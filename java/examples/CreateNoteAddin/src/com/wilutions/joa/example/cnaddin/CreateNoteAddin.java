/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.example.cnaddin;

import java.util.ArrayList;
import java.util.List;

import com.wilutions.com.BackgTask;
import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.IDispatch;
import com.wilutions.com.JoaDll;
import com.wilutions.com.reg.Registry;
import com.wilutions.joa.DeclAddin;
import com.wilutions.joa.IconManager;
import com.wilutions.joa.LoadBehavior;
import com.wilutions.joa.OfficeApplication;
import com.wilutions.joa.TaskPane;
import com.wilutions.joa.fx.MessageBox;
import com.wilutions.joa.outlook.InspectorWrappers;
import com.wilutions.joa.outlook.OutlookAddin;
import com.wilutions.mslib.office.IRibbonControl;
import com.wilutions.mslib.office.IRibbonUI;
import com.wilutions.mslib.outlook.Application;
import com.wilutions.mslib.outlook.Inspector;
import com.wilutions.mslib.outlook.InspectorsEvents;
import com.wilutions.mslib.outlook.MailItem;
import com.wilutions.mslib.outlook._Inspector;
import com.wilutions.mslib.outlook._Inspectors;

/**
 * This Add-in displays a task pane in a mail inspector window.
 * This example is based on the MSND article "How to: Display Custom Task Panes with E-Mail Messages in Outlook".
 * @see http://msdn.microsoft.com/en-us/library/bb608622(v=vs.90).aspx
 */
@CoClass(progId = "JoaExample2.Addin", guid = "{C2A41A22-7858-4C13-88D4-88192CAAEFCF}")
@DeclAddin(application = OfficeApplication.Outlook, loadBehavior = LoadBehavior.LoadOnStart, friendlyName = "Create Note Add-in", description = "Example for an Outlook Add-in developed in Java")
public class CreateNoteAddin extends OutlookAddin implements InspectorsEvents {

	private final ArrayList<TaskPane> taskPanes = new ArrayList<TaskPane>();
	private final InspectorWrappers<InspectorWrapper> inspectorWrappers = new InspectorWrappers<InspectorWrapper>();
	private final Registry registry = new Registry(getClass());
	private volatile _Inspectors inspectors;
	private volatile IRibbonUI ribbon;
	private final IconManager ribbonIcons;
	
	public CreateNoteAddin() {
		Globals.setThisAddin(this);
		ribbonIcons = new IconManager(this);
	}	

	public List<TaskPane> getTaskPanes() {
		return taskPanes;
	}

	public IRibbonUI getRibbon() {
		return ribbon;
	}

	public Registry getRegistry() {
		return registry;
	}

	public void onLoadRibbon(IRibbonUI ribbon) throws ComException {
		System.out.println("onLoadRibbon " + ribbon);
		this.ribbon = ribbon;
	}

	public Object onGetImage(IRibbonControl control) {
		System.out.println("onGetImage");
		Object picdisp = ribbonIcons.get("Ribbon-Note.png");
		return picdisp;
	}

	public boolean ShowHideTP_getVisible(IRibbonControl control) throws ComException {
		System.out.println("ShowHideTP_getVisible " + control);
		return true;
	}

	public boolean ShowHideTP_getPressed(IRibbonControl control) throws ComException {
		System.out.println("ShowHideTP_getPressed " + control);
		IDispatch ctx = control.getContext();
		boolean ret = false;
		if (ctx != null) {
			Inspector inspector = ctx.as(Inspector.class);
			InspectorWrapper inspectorWrapper = inspectorWrappers.get(inspector);
			System.out.println("inspectorWrapper=" + inspectorWrapper);
			if (inspectorWrapper != null) {
				ret = inspectorWrapper.getTaskPaneVisible();
			}
		}
		return ret;
	}
	
	public void onSmileButtonClicked(Dispatch control, Boolean pressed) throws ComException {
		Object owner = getApplication().ActiveExplorer();
		MessageBox.show(owner, "JOA Example", "This example application shows a custom task pane in mail inspector windows.", (result, ex) -> {
			if (ex != null) {
				ex.printStackTrace();
			}
			else {
				System.out.println("Message box closed with button=" + result);
			}
		});
	}

	public void onButtonClicked(Dispatch control, Boolean pressed) throws ComException {
	}

	public void onShowHideTaskPaneClicked(Dispatch control, Boolean pressed) throws ComException {
		System.out.println("onShowHideTaskPaneClicked: " + control._get("id"));
		Dispatch ctx = (Dispatch) control._get("Context");
		System.out.println("ctx=" + ctx + ", id=" + System.identityHashCode(ctx));

		{
			Inspector inspector = ctx.as(Inspector.class);
			System.out.println("inspector=" + inspector + ", id=" + System.identityHashCode(inspector));
			InspectorWrapper inspectorWrapper = inspectorWrappers.get(inspector);
			System.out.println("inspectorWrapper=" + inspectorWrapper);
			if (inspectorWrapper != null) {
				inspectorWrapper.setTaskPaneVisible(pressed);
			}
		}
	}

	@Override
	public void onStartup() throws ComException {
		System.out.println("Ctp4IptorOutlookAddin.onStartup");
		Application app = getApplication();
		inspectors = app.getInspectors();
		Dispatch.withEvents(inspectors, this);
		int n = inspectors.getCount();
		for (int i = 0; i < n; i++) {
			Inspector inspector = inspectors.Item(i);
			onNewInspector(inspector);
		}
	}

	@Override
	public void onQuit() throws ComException {
		System.out.println("Ctp4IptorOutlookAddin.onQuit");
		Dispatch.releaseEvents(inspectors, this);
		JoaDll.dumpComReferenceMap("before exit");
		super.onQuit();
	}

	@Override
	public void onNewInspector(final _Inspector insp) throws ComException {
		Inspector inspector = Dispatch.as(insp, Inspector.class);
		System.out.println("Ctp4IptorOutlookAddin.onNewInspector " + inspector);
		BackgTask.run(() -> {
			try {
				IDispatch dispItem = inspector.getCurrentItem();
				if (dispItem.is(MailItem.class)) {
					MailItem mailItem = dispItem.as(MailItem.class);
					String id = mailItem.getEntryID();
					
					// Display the task pane only for received or sent mails.
					// Do not display the task pane for new mails to be composed.
					if (id != null && id.length() != 0) {
						inspectorWrappers.add(new InspectorWrapper(inspector));
					}
				}
			} catch (Throwable e) {
				e.printStackTrace();
			}
		});
	}

	public InspectorWrappers<InspectorWrapper> getInspectorWrappers() {
		return inspectorWrappers;
	}

}
