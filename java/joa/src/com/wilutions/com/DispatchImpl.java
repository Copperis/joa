/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.com;

import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is the base class for IDispatch implementations in Java. The
 * native library finds via reflection the implemented interfaces and makes them
 * available for COM - only IDispatch interfaces can be provide by a Java
 * object, VTBL interfaces are not supported (since they use a native function
 * pointer table).
 */
public class DispatchImpl implements IDispatch {

	/**
	 * Internal pointer. This value is internally used as a pointer to
	 * the corresponding native object.
	 */
	private long nptr;

	private final ConnectionPointContainer connectionPointContainer = new ConnectionPointContainer();

	public DispatchImpl() {
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "DispatchImpl(");
		JoaDll.nativeInit(this);
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")DispatchImpl");
	}

	public ConnectionPointContainer getConnectionPointContainer() {
		return connectionPointContainer;
	}
	
	public <T extends IUnknown> void _fireEvent(Class<T> listenerClass, Consumer<T> action) {
		ConnectionPoint<T> listeners = getConnectionPointContainer().findConnectionPoint(listenerClass);
		if (listeners != null) {
			listeners.forEach(action);
		}
	}

	public static void initLogger(String logFile, String logLevel, boolean append) {
		JoaDll.nativeInitLogger(logFile, logLevel, append);
	}

	public static void doneLogger() {
		JoaDll.nativeDoneLogger();
	}

	public static void initCOM(Object module) throws ComException {
		JoaDll.nativeInitCOM(module);
	}

	public static void doneCOM() {
		JoaDll.nativeDoneCOM();
	}

	public String toString() {
		return "[DispatchImpl " + Long.toHexString(nptr) + "]";
	}
	
	private final static Logger log = Logger.getLogger("DispatchImpl");
}
