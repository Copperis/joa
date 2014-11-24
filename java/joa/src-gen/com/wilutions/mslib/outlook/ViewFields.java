/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ViewFields.
 * 
 */
@CoClass(guid="{000610A1-0000-0000-C000-000000000046}")
public class ViewFields extends Dispatch implements _ViewFields {
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
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public _ViewField Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ViewFieldImpl.class);
  }
  @DeclDISPID(95)  public ViewField Add(String PropertyName) throws ComException {
    assert(PropertyName != null);
    final Object obj = this._dispatchCall(95,"Add", DISPATCH_METHOD,null,PropertyName);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(ViewField.class);
  }
  @DeclDISPID(64342)  public ViewField Insert(String PropertyName, Object Index) throws ComException {
    assert(PropertyName != null);
    assert(Index != null);
    final Object obj = this._dispatchCall(64342,"Insert", DISPATCH_METHOD,null,PropertyName,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(ViewField.class);
  }
  @DeclDISPID(82)  public void Remove(Object Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(82,"Remove", DISPATCH_METHOD,null,Index);
  }
  public ViewFields() throws ComException {
    super("{000610A1-0000-0000-C000-000000000046}", "{000630A1-0000-0000-C000-000000000046}");
  }
  protected ViewFields(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ViewFields" + super.toString() + "]";
  }
}
