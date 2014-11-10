/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * UserDefinedProperty.
 * 
 */
@CoClass(guid="{0006105C-0000-0000-C000-000000000046}")
public class UserDefinedProperty extends Dispatch implements _UserDefinedProperty {
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
  @DeclDISPID(103)  public String getFormula() throws ComException {
    final Object obj = this._dispatchCall(103,"Formula", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(112)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(112,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(109)  public OlUserPropertyType getType() throws ComException {
    final Object obj = this._dispatchCall(109,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlUserPropertyType.valueOf((Integer)obj);
  }
  @DeclDISPID(64039)  public Integer getDisplayFormat() throws ComException {
    final Object obj = this._dispatchCall(64039,"DisplayFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64523)  public void Delete() throws ComException {
    this._dispatchCall(64523,"Delete", DISPATCH_METHOD,null);
  }
  public UserDefinedProperty() throws ComException {
    super("{0006105C-0000-0000-C000-000000000046}");
  }
  protected UserDefinedProperty(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[UserDefinedProperty" + super.toString() + "]";
  }
}
