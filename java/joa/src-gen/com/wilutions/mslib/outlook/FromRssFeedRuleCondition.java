/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * FromRssFeedRuleCondition.
 * 
 */
@CoClass(guid="{000610FB-0000-0000-C000-000000000046}")
public class FromRssFeedRuleCondition extends Dispatch implements _FromRssFeedRuleCondition {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
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
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(103)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64298)  public OlRuleConditionType getConditionType() throws ComException {
    final Object obj = this._dispatchCall(64298,"ConditionType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlRuleConditionType.valueOf((Integer)obj);
  }
  @DeclDISPID(64295)  public Object getFromRssFeed() throws ComException {
    final Object obj = this._dispatchCall(64295,"FromRssFeed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64295)  public void setFromRssFeed(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(64295,"FromRssFeed", DISPATCH_PROPERTYPUT,value);
  }
  public FromRssFeedRuleCondition() throws ComException {
    super("{000610FB-0000-0000-C000-000000000046}");
  }
  protected FromRssFeedRuleCondition(long ndisp) {
    super(ndisp);
  }
  public FromRssFeedRuleCondition(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FromRssFeedRuleCondition" + super.toString() + "]";
  }
}
