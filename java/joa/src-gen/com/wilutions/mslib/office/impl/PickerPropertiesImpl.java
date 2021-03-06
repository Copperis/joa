/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A88-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PickerPropertiesImpl extends Dispatch implements com.wilutions.mslib.office.PickerProperties {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.PickerProperty getItem(final Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.PickerPropertyImpl.class);
  }
  @DeclDISPID(1)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.PickerProperty Add(final String Id, final String Value, final com.wilutions.mslib.office.MsoPickerField Type) throws ComException {
    assert(Id != null);
    assert(Value != null);
    assert(Type != null);
    final Object obj = this._dispatchCall(2,"Add", DISPATCH_METHOD,null,Id,Value,Type.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.PickerPropertyImpl.class);
  }
  @DeclDISPID(3)  public void Remove(final String Id) throws ComException {
    assert(Id != null);
    this._dispatchCall(3,"Remove", DISPATCH_METHOD,null,Id);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public PickerPropertiesImpl(String progId) throws ComException {
    super(progId, "{000C03E3-0000-0000-C000-000000000046}");
  }
  protected PickerPropertiesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PickerPropertiesImpl" + super.toString() + "]";
  }
}
