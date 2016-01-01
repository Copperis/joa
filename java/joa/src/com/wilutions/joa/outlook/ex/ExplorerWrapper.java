package com.wilutions.joa.outlook.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.wilutions.com.ByRef;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.IDispatch;
import com.wilutions.joa.ribbon.RibbonControls;
import com.wilutions.mslib.office.IRibbonControl;
import com.wilutions.mslib.outlook.Explorer;
import com.wilutions.mslib.outlook.ExplorerEvents_10;
import com.wilutions.mslib.outlook.MAPIFolder;

public class ExplorerWrapper extends DispatchImpl implements ExplorerEvents_10, Wrapper {
	
	protected Explorer explorer;
	
	/**
	 * This map keeps references to the ribbon controls.
	 * The ribbon callback functions like "getLabel", "getImage" etc. should 
	 * call {@link #addRibbonControlDispatchReference(IRibbonControl)} in order to put a 
	 * reference to their underlying objects into this map. This ensures,
	 * that the objects are not garbage collected which could cause concurrent
	 * situations where the Java object is collected but the internal native IDispatch
	 * pointer is still in use. 
	 */
	protected Map<String, IRibbonControl> ribbonControlsDispatchReferences;
	
	/**
	 * Ribbon control map.
	 * This map contains objects from package com.wilutions.joa.ribbon.
	 * It does not contain COM objects.
	 */
	protected RibbonControls ribbonControls = new RibbonControls();

	public ExplorerWrapper(Explorer explorer) {
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "ExplorerWrapper(");
		this.explorer = explorer;
		this.ribbonControlsDispatchReferences = new HashMap<String, IRibbonControl>();
		Dispatch.withEvents(explorer, this);
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")ExplorerWrapper");
	}

	public Explorer getExplorer() {
		return explorer;
	}

	@Override
	public IDispatch getWrappedObject() {
		return getExplorer();
	}
	
	@Override
	public void onActivate() throws ComException {
		
	}

	@Override
	public void onFolderSwitch() throws ComException {
		
	}

	@Override
	public void onBeforeFolderSwitch(IDispatch NewFolder, ByRef<Boolean> Cancel)
			throws ComException {
		
	}

	@Override
	public void onViewSwitch() throws ComException {
		
	}

	@Override
	public void onBeforeViewSwitch(Object NewView, ByRef<Boolean> Cancel)
			throws ComException {
		
	}

	@Override
	public void onDeactivate() throws ComException {
		
	}

	@Override
	public void onSelectionChange() throws ComException {
		
	}

	@Override
	public void onClose() throws ComException {
		ribbonControlsDispatchReferences.clear();
		if (explorer != null) {
			explorer.releaseEvents(this);
			explorer.releaseComObject();
			ExplorerWrappers.remove(this);
			System.out.println("release explorer");
		}
	}

	@Override
	public void onBeforeMaximize(ByRef<Boolean> Cancel) throws ComException {
		
	}

	@Override
	public void onBeforeMinimize(ByRef<Boolean> Cancel) throws ComException {
		
	}

	@Override
	public void onBeforeMove(ByRef<Boolean> Cancel) throws ComException {
		
	}

	@Override
	public void onBeforeSize(ByRef<Boolean> Cancel) throws ComException {
		
	}

	@Override
	public void onBeforeItemCopy(ByRef<Boolean> Cancel) throws ComException {
		
	}

	@Override
	public void onBeforeItemCut(ByRef<Boolean> Cancel) throws ComException {
		
	}

	@Override
	public void onBeforeItemPaste(Object ClipboardContent, MAPIFolder Target,
			ByRef<Boolean> Cancel) throws ComException {
		
	}

	@Override
	public void onAttachmentSelectionChange() throws ComException {
		
	}

	@Override
	public void onInlineResponse(IDispatch Item) throws ComException {
		
	}

	@Override
	public void onInlineResponseClose() throws ComException {
		
	}

	/**
	 * Add the ribbon control to keep the underlying object alive.
	 */
	@Override
	public void addRibbonControlDispatchReference(IRibbonControl control) {
		ribbonControlsDispatchReferences.put(control.getId(), control);
	}

	@Override
	public RibbonControls getRibbonControls() {
		return ribbonControls;
	}
	
	private final static Logger log = Logger.getLogger("ExplorerWrapper");
}
