/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A5F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PropertyTestsImpl extends Dispatch implements com.wilutions.mslib.office.PropertyTests {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.PropertyTest getItem(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.PropertyTestImpl.class);
  }
  @DeclDISPID(4)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(4,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(5)  public void Add(String Name, com.wilutions.mslib.office.MsoCondition Condition, Object Value, Object SecondValue, com.wilutions.mslib.office.MsoConnector Connector) throws ComException {
    assert(Name != null);
    assert(Condition != null);
    assert(Value != null);
    assert(SecondValue != null);
    assert(Connector != null);
    this._dispatchCall(5,"Add", DISPATCH_METHOD,null,Name,Condition.value,Value,SecondValue,Connector.value);
  }
  @DeclDISPID(6)  public void Remove(Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(6,"Remove", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public PropertyTestsImpl(String progId) throws ComException {
    super(progId);
  }
  protected PropertyTestsImpl(long ndisp) {
    super(ndisp);
  }
  public PropertyTestsImpl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PropertyTestsImpl" + super.toString() + "]";
  }
}
