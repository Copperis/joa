/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OrderFields.
 * 
 */
@CoClass(guid="{0006109A-0000-0000-C000-000000000046}")
public class OrderFields extends Dispatch implements _OrderFields {
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
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public _OrderField Item(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._OrderFieldImpl.class);
  }
  @DeclDISPID(95)  public OrderField Add(final String PropertyName, final Object IsDescending) throws ComException {
    assert(PropertyName != null);
    assert(IsDescending != null);
    final Object obj = this._dispatchCall(95,"Add", DISPATCH_METHOD,null,PropertyName,IsDescending);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(OrderField.class);
  }
  @DeclDISPID(82)  public void Remove(final Object Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(82,"Remove", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(64343)  public void RemoveAll() throws ComException {
    this._dispatchCall(64343,"RemoveAll", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64342)  public OrderField Insert(final String PropertyName, final Object Index, final Object IsDescending) throws ComException {
    assert(PropertyName != null);
    assert(Index != null);
    assert(IsDescending != null);
    final Object obj = this._dispatchCall(64342,"Insert", DISPATCH_METHOD,null,PropertyName,Index,IsDescending);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(OrderField.class);
  }
  public OrderFields() throws ComException {
    super("{0006109A-0000-0000-C000-000000000046}", "{0006309A-0000-0000-C000-000000000046}");
  }
  protected OrderFields(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OrderFields" + super.toString() + "]";
  }
}
