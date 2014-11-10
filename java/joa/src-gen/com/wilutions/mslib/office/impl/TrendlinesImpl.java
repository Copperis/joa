/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E49-A463-DB41-5DAE-69E7A5F7FCBC}")
public class TrendlinesImpl extends Dispatch implements com.wilutions.mslib.office.Trendlines {
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(181)  public com.wilutions.mslib.office.IMsoTrendline Add(com.wilutions.mslib.office.XlTrendlineType Type, Object Order, Object Period, Object Forward, Object Backward, Object Intercept, Object DisplayEquation, Object DisplayRSquared, Object Name) throws ComException {
    assert(Type != null);
    assert(Order != null);
    assert(Period != null);
    assert(Forward != null);
    assert(Backward != null);
    assert(Intercept != null);
    assert(DisplayEquation != null);
    assert(DisplayRSquared != null);
    assert(Name != null);
    final Object obj = this._dispatchCall(181,"Add", DISPATCH_METHOD,null,Type.value,Order,Period,Forward,Backward,Intercept,DisplayEquation,DisplayRSquared,Name);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoTrendline)obj;
  }
  @DeclDISPID(118)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(118,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(170)  public com.wilutions.mslib.office.IMsoTrendline Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(170,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoTrendline)obj;
  }
  @DeclDISPID(-4)  public Object _NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.IMsoTrendline get_Default(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"_Default", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoTrendline)obj;
  }
  public TrendlinesImpl(String progId) throws ComException {
    super(progId);
  }
  protected TrendlinesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TrendlinesImpl" + super.toString() + "]";
  }
}
