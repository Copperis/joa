/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * AssignToCategoryRuleAction.
 * 
 */
@CoClass(guid="{000610D4-0000-0000-C000-000000000046}")
public class AssignToCategoryRuleAction extends Dispatch implements _AssignToCategoryRuleAction {
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
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(103)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64271)  public OlRuleActionType getActionType() throws ComException {
    final Object obj = this._dispatchCall(64271,"ActionType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlRuleActionType.valueOf((Integer)obj);
  }
  @DeclDISPID(64289)  public Object getCategories() throws ComException {
    final Object obj = this._dispatchCall(64289,"Categories", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64289)  public void setCategories(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(64289,"Categories", DISPATCH_PROPERTYPUT,value);
  }
  public AssignToCategoryRuleAction() throws ComException {
    super("{000610D4-0000-0000-C000-000000000046}", "{000630D4-0000-0000-C000-000000000046}");
  }
  protected AssignToCategoryRuleAction(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AssignToCategoryRuleAction" + super.toString() + "]";
  }
}
