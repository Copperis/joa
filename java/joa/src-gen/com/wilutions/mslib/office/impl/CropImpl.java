/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AB8-A463-DB41-5DAE-69E7A5F7FCBC}")
public class CropImpl extends Dispatch implements com.wilutions.mslib.office.Crop {
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
  @DeclDISPID(0)  public Float getPictureOffsetX() throws ComException {
    final Object obj = this._dispatchCall(0,"PictureOffsetX", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(0)  public void setPictureOffsetX(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"PictureOffsetX", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1)  public Float getPictureOffsetY() throws ComException {
    final Object obj = this._dispatchCall(1,"PictureOffsetY", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1)  public void setPictureOffsetY(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"PictureOffsetY", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2)  public Float getPictureWidth() throws ComException {
    final Object obj = this._dispatchCall(2,"PictureWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(2)  public void setPictureWidth(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"PictureWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public Float getPictureHeight() throws ComException {
    final Object obj = this._dispatchCall(3,"PictureHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(3)  public void setPictureHeight(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"PictureHeight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(5)  public Float getShapeLeft() throws ComException {
    final Object obj = this._dispatchCall(5,"ShapeLeft", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(5)  public void setShapeLeft(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"ShapeLeft", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(6)  public Float getShapeTop() throws ComException {
    final Object obj = this._dispatchCall(6,"ShapeTop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(6)  public void setShapeTop(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(6,"ShapeTop", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(7)  public Float getShapeWidth() throws ComException {
    final Object obj = this._dispatchCall(7,"ShapeWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(7)  public void setShapeWidth(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(7,"ShapeWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8)  public Float getShapeHeight() throws ComException {
    final Object obj = this._dispatchCall(8,"ShapeHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(8)  public void setShapeHeight(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(8,"ShapeHeight", DISPATCH_PROPERTYPUT,value);
  }
  public CropImpl(String progId) throws ComException {
    super(progId, "{000C03D3-0000-0000-C000-000000000046}");
  }
  protected CropImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CropImpl" + super.toString() + "]";
  }
}
