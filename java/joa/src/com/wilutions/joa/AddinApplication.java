/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.wilutions.com.BackgTask;
import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.ComModule;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.JoaDll;
import com.wilutions.com.reg.RegUtil;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * The JavaFX application class. This class serves as a COM EXE server and as
 * the application class for the JavaFX toolkit.
 * 
 */
public class AddinApplication extends javafx.application.Application {
	
	private static Logger log = Logger.getLogger(AddinApplication.class.getName());
	private final static String AUTOSTART_FOLDER = "%APPDATA%\\Microsoft\\Windows\\Start Menu\\Programs\\Startup";
	
	public static void main(String[] args) {
		main(AddinApplication.class, AddinApplication.class, args);
	}

	public static void main(Class<? extends AddinApplication> mainClass, Class<? extends Application> fxappClass,
			String[] args) {
		
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "main(mainClass=" + mainClass + ", fxappClass=" + fxappClass + ", args=" + Arrays.toString(args));

		try {
			if (invokeParseCommandLine(mainClass, args)) {
				if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "Platform.exit();");
				Platform.exit();
			} else {
				try {
					// Start class factories for COM objects defined by the
					// module.
					// The module class is found via reflection. Its name has to
					// be
					// com.wilutions.com.module.Module
					if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "DispatchImpl.initCOM...");
					DispatchImpl.initCOM(ComModule.getInstance());
					if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "DispatchImpl.initCOM OK");

					if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "launch...");
					Application.launch(fxappClass, args);
					if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "launch OK");

				} finally {
					
					// Kill thread pool
					if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "BackgTask.done()");
					BackgTask.done();

					// JoaDll.dumpComReferenceMap("before exit");

					// Shutdown COM library: release class factories,
					// top thread pools, etc.
					if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "DispatchImpl.doneCOM()");
					DispatchImpl.doneCOM();

					// Close log file
					if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "JoaDll.nativeDoneLogger()");
					JoaDll.nativeDoneLogger();
				}

			}

		} catch (Throwable e) {
			e.printStackTrace();
			log.log(Level.SEVERE, "main failed", e);
		}
		finally {
			// This call ensures that the application is terminated
			// even if there are Swing windows visible.
			if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "System.exit(0);");
			System.exit(0);
		}

		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")main");
	}

	private static boolean invokeParseCommandLine(Class<? extends AddinApplication> addinMain, String[] args) throws ComException, InstantiationException, IllegalAccessException, IOException {
		return addinMain.newInstance().parseCommandLine(args);
	}

	public boolean parseCommandLine(String[] args) throws ComException, IOException {
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "parseCommandLine(" + Arrays.toString(args));
		Command command = Command.Run;
		boolean userNotMachine = false;
		String logFile = "";
		String logLevel = "";
		boolean logAppend = false;

		int argIdx = 0;
		while (argIdx < args.length) {

			String arg_i = args[argIdx];
			String arg_i1 = (argIdx + 1 < args.length) ? args[argIdx + 1] : "";
			if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "arg_i=" + arg_i + ", arg_i1=" + arg_i1);

			if (arg_i == null) {
			} else if (arg_i.equals("/Version")) {
				command = Command.Version;
			} else if (arg_i.equals("/RegisterServer")) {
				command = Command.RegisterServer;
				userNotMachine = arg_i1.equals("user");
				if (userNotMachine)
					argIdx++;
			} else if (arg_i.equals("/UnregisterServer")) {
				command = Command.UnregisterServer;
				userNotMachine = arg_i1.equals("user");
				if (userNotMachine)
					argIdx++;
			} else if (arg_i.equals("/log")) {
				logFile = arg_i1;
			} else if (arg_i.equals("/llevel")) {
				logLevel = arg_i1;
			} else if (arg_i.equals("/lappend")) {
				logAppend = true;
			}

			argIdx++;
		}

		if (logFile != null && logFile.length() != 0) {
			if (logLevel != null && logLevel.length() == 0) {
				logLevel = "INFO";
			}
			
			if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "DispatchImpl.initLogger(" + logFile + ", " + logLevel + ", " + logAppend);
			DispatchImpl.initLogger(logFile, logLevel, logAppend);
		}

		switch (command) {
		case Version:
			break;
		case RegisterServer: {
			Class<?> addinMain = this.getClass();
			String path = RegUtil.getExecPath(addinMain);
			register(userNotMachine, path);
		}
			break;
		case UnregisterServer: {
			Class<?> addinMain = this.getClass();
			String path = RegUtil.getExecPath(addinMain);
			unregister(userNotMachine, path);
		}
			break;
		case Run:
			for (Class<?> addinClass : ComModule.getInstance().getAddins()) {
				activateDisabledAddin(addinClass);
			}
		default:
		}

		boolean ret = command != Command.Run;
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")parseCommandLine=" + ret);
		return ret;
	}

	protected void unregister(boolean userNotMachine, String exePath) {
		String regfor = userNotMachine ? "user" : "machine";
		System.out.println("Unregister for " + regfor);
		if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "Unregister for " + regfor);
		ComModule.getInstance().unregister(userNotMachine);
	}

	protected void register(boolean userNotMachine, String execPath) {
		String regfor = userNotMachine ? "user" : "machine";
		System.out.println("Register for " + regfor + " at path=" + execPath);
		if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "Register for " + regfor + " at path=" + execPath);
		ComModule.getInstance().register(userNotMachine, execPath);
	}

	protected String registerAutostart(boolean registerNotUnregister, String exe) {
		if (exe.startsWith("\"")) exe = exe.substring(1);
		if (exe.endsWith("\"")) exe = exe.substring(0, exe.length() - 1);
		String linkName = makeValidPath(AUTOSTART_FOLDER + "\\" + (new File(exe)).getName() + ".lnk");
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "linkName=" + linkName);

		// Im Autostart-Ordner ablegen
		if (registerNotUnregister) {
			try {
				String targetName = exe;
				String description = "";
				if (log.isLoggable(Level.INFO))
					log.log(Level.INFO, "Create shortcut=" + linkName + " to " + targetName);

				JoaDll.nativeCreateShortcut(linkName, targetName, description);
			}
			catch (Throwable e) {
				log.log(Level.SEVERE, "Failed to create shortcut=" + linkName, e);
			}
		}

		// Im Autostart-Ordner l�schen.
		else {
			if (log.isLoggable(Level.INFO)) log.log(Level.INFO, "Delete lnk=" + linkName);
			new File(linkName).delete();
		}

		// pushd "%APPDATA%\..\Local\Issue Tracker for Microsoft Outlook 32bit"
		// REG add
		// "HKCU\Software\Microsoft\Office\Outlook\Addins\ItolAddin.Class" /f /v
		// "LoadBehavior" /t REG_DWORD /d 3
		// START "" "Issue Tracker for Microsoft Outlook 32bit.exe"
		// popd

		return exe.toLowerCase().endsWith("exe") ? linkName : null;
	}

	public void activateDisabledAddin(Class<?> addinClass) throws ComException {
		OfficeApplication application = addinClass.getDeclaredAnnotation(DeclAddin.class).application();
		if (application != null && application == OfficeApplication.Outlook) {
			String progId = addinClass.getDeclaredAnnotation(CoClass.class).progId();
			JoaDll.activateDisabledAddin(progId);
		}
	}

	/**
	 * Make valid path.
	 * 
	 * @param path
	 *            File system path that might contain environment variables.
	 * @return File system path with replaced variables.
	 */
	public static String makeValidPath(String path) {

		int p = path.indexOf('%');
		while (p >= 0) {

			int e = path.indexOf('%', p + 1);
			String variableName = path.substring(p + 1, e);
			String variableValue = System.getenv(variableName);
			if (variableValue == null) variableValue = "";
			path = path.replace(path.substring(p, e + 1), variableValue);

			p = path.indexOf('%');
		}

		return path;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		javafx.application.Application.setUserAgentStylesheet(null);

		// A primary stage is only needed in order to keep the
		// javafx alive when the last TaskPane or FormRegion
		// is closed.
		// The addin class is responsible for closing this stage.
		// The OutlookAddin class calls therefore Platform.exit() in its close()
		// method.
		primaryStage.initStyle(StageStyle.UTILITY);
		primaryStage.setX(10000);
		primaryStage.setY(10000);
		primaryStage.setWidth(1);
		primaryStage.setHeight(1);
		primaryStage.show();
	}

	private enum Command {
		Version, Run, RegisterServer, UnregisterServer
	};

}
