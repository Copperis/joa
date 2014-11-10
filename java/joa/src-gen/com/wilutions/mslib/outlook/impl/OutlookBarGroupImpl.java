/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A918-A463-DB41-5DAE-69E7A5F7FCBC}")
public class OutlookBarGroupImpl extends Dispatch implements com.wilutions.mslib.outlook.OutlookBarGroup {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(0)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(0,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8450)  public com.wilutions.mslib.outlook._OutlookBarShortcuts getShortcuts() throws ComException {
    final Object obj = this._dispatchCall(8450,"Shortcuts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._OutlookBarShortcutsImpl.class);
  }
  @DeclDISPID(8451)  public com.wilutions.mslib.outlook.OlOutlookBarViewType getViewType() throws ComException {
    final Object obj = this._dispatchCall(8451,"ViewType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlOutlookBarViewType.valueOf((Integer)obj);
  }
  @DeclDISPID(8451)  public void setViewType(com.wilutions.mslib.outlook.OlOutlookBarViewType value) throws ComException {
    assert(value != null);
    this._dispatchCall(8451,"ViewType", DISPATCH_PROPERTYPUT,value.value);
  }
  public OutlookBarGroupImpl(String progId) throws ComException {
    super(progId);
  }
  protected OutlookBarGroupImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OutlookBarGroupImpl" + super.toString() + "]";
  }
}
