/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9BE-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _PlaySoundRuleActionImpl extends Dispatch implements com.wilutions.mslib.outlook._PlaySoundRuleAction {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(103)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64271)  public com.wilutions.mslib.outlook.OlRuleActionType getActionType() throws ComException {
    final Object obj = this._dispatchCall(64271,"ActionType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlRuleActionType.valueOf((Integer)obj);
  }
  @DeclDISPID(64221)  public String getFilePath() throws ComException {
    final Object obj = this._dispatchCall(64221,"FilePath", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64221)  public void setFilePath(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64221,"FilePath", DISPATCH_PROPERTYPUT,value);
  }
  public _PlaySoundRuleActionImpl(String progId) throws ComException {
    super(progId, "{000630D5-0000-0000-C000-000000000046}");
  }
  protected _PlaySoundRuleActionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_PlaySoundRuleActionImpl" + super.toString() + "]";
  }
}
