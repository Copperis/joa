/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E7C-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoBorderImpl extends Dispatch implements com.wilutions.mslib.office.IMsoBorder {
  @DeclDISPID(1610743808)  public void setColor(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743808,"Color", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743808)  public Object getColor() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Color", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public void setColorIndex(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743810,"ColorIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743810)  public Object getColorIndex() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"ColorIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743812)  public void setLineStyle(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743812,"LineStyle", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743812)  public Object getLineStyle() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"LineStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743814)  public void setWeight(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743814,"Weight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743814)  public Object getWeight() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Weight", DISPATCH_PROPERTYGET,null);
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
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  public IMsoBorderImpl(String progId) throws ComException {
    super(progId, "{000C1717-0000-0000-C000-000000000046}");
  }
  protected IMsoBorderImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoBorderImpl" + super.toString() + "]";
  }
}
