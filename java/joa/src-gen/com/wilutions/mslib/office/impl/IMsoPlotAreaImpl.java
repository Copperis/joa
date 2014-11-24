/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E4F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoPlotAreaImpl extends Dispatch implements com.wilutions.mslib.office.IMsoPlotArea {
  @DeclDISPID(110)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(110,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(235)  public Object Select() throws ComException {
    final Object obj = this._dispatchCall(235,"Select", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(150)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(128)  public com.wilutions.mslib.office.IMsoBorder getBorder() throws ComException {
    final Object obj = this._dispatchCall(128,"Border", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoBorderImpl.class);
  }
  @DeclDISPID(112)  public Object ClearFormats() throws ComException {
    final Object obj = this._dispatchCall(112,"ClearFormats", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(123)  public Double getHeight() throws ComException {
    final Object obj = this._dispatchCall(123,"Height", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(123)  public void setHeight(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(123,"Height", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(129)  public com.wilutions.mslib.office.IMsoInterior getInterior() throws ComException {
    final Object obj = this._dispatchCall(129,"Interior", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoInteriorImpl.class);
  }
  @DeclDISPID(1663)  public com.wilutions.mslib.office.ChartFillFormat getFill() throws ComException {
    final Object obj = this._dispatchCall(1663,"Fill", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ChartFillFormatImpl.class);
  }
  @DeclDISPID(127)  public Double getLeft() throws ComException {
    final Object obj = this._dispatchCall(127,"Left", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(127)  public void setLeft(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(127,"Left", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(126)  public Double getTop() throws ComException {
    final Object obj = this._dispatchCall(126,"Top", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(126)  public void setTop(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(126,"Top", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(122)  public Double getWidth() throws ComException {
    final Object obj = this._dispatchCall(122,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(122)  public void setWidth(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(122,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1667)  public Double getInsideLeft() throws ComException {
    final Object obj = this._dispatchCall(1667,"InsideLeft", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1667)  public void setInsideLeft(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(1667,"InsideLeft", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1668)  public Double getInsideTop() throws ComException {
    final Object obj = this._dispatchCall(1668,"InsideTop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1668)  public void setInsideTop(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(1668,"InsideTop", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1669)  public Double getInsideWidth() throws ComException {
    final Object obj = this._dispatchCall(1669,"InsideWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1669)  public void setInsideWidth(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(1669,"InsideWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1670)  public Double getInsideHeight() throws ComException {
    final Object obj = this._dispatchCall(1670,"InsideHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Double)obj;
  }
  @DeclDISPID(1670)  public void setInsideHeight(Double value) throws ComException {
    assert(value != null);
    this._dispatchCall(1670,"InsideHeight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1671)  public com.wilutions.mslib.office.XlChartElementPosition getPosition() throws ComException {
    final Object obj = this._dispatchCall(1671,"Position", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlChartElementPosition.valueOf((Integer)obj);
  }
  @DeclDISPID(1671)  public void setPosition(com.wilutions.mslib.office.XlChartElementPosition value) throws ComException {
    assert(value != null);
    this._dispatchCall(1671,"Position", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743833)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743833,"Format", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoChartFormatImpl.class);
  }
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IMsoPlotAreaImpl(String progId) throws ComException {
    super(progId, "{000C1724-0000-0000-C000-000000000046}");
  }
  protected IMsoPlotAreaImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoPlotAreaImpl" + super.toString() + "]";
  }
}
