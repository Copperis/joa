/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * NavigationPane.
 * 
 */
@CoClass(guid="{000610F3-0000-0000-C000-000000000046}")
public class NavigationPane extends Dispatch implements _NavigationPane {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(64436)  public Boolean getIsCollapsed() throws ComException {
    final Object obj = this._dispatchCall(64436,"IsCollapsed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64436)  public void setIsCollapsed(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64436,"IsCollapsed", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64437)  public NavigationModule getCurrentModule() throws ComException {
    final Object obj = this._dispatchCall(64437,"CurrentModule", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(NavigationModule.class);
  }
  @DeclDISPID(64437)  public void setCurrentModule(final NavigationModule value) throws ComException {
    this._dispatchCall(64437,"CurrentModule", DISPATCH_PROPERTYPUTREF,Dispatch.param(value));
  }
  @DeclDISPID(64438)  public Integer getDisplayedModuleCount() throws ComException {
    final Object obj = this._dispatchCall(64438,"DisplayedModuleCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64438)  public void setDisplayedModuleCount(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64438,"DisplayedModuleCount", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64439)  public NavigationModules getModules() throws ComException {
    final Object obj = this._dispatchCall(64439,"Modules", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(NavigationModules.class);
  }
  public NavigationPane() throws ComException {
    super("{000610F3-0000-0000-C000-000000000046}", "{000630E6-0000-0000-C000-000000000046}");
  }
  protected NavigationPane(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[NavigationPane" + super.toString() + "]";
  }
}
