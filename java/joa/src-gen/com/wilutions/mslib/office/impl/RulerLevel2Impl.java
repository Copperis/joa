/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AA8-A463-DB41-5DAE-69E7A5F7FCBC}")
public class RulerLevel2Impl extends Dispatch implements com.wilutions.mslib.office.RulerLevel2 {
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
  @DeclDISPID(1)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(2)  public Float getFirstMargin() throws ComException {
    final Object obj = this._dispatchCall(2,"FirstMargin", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(2)  public void setFirstMargin(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"FirstMargin", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public Float getLeftMargin() throws ComException {
    final Object obj = this._dispatchCall(3,"LeftMargin", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(3)  public void setLeftMargin(Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"LeftMargin", DISPATCH_PROPERTYPUT,value);
  }
  public RulerLevel2Impl(String progId) throws ComException {
    super(progId);
  }
  protected RulerLevel2Impl(long ndisp) {
    super(ndisp);
  }
  public RulerLevel2Impl(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RulerLevel2Impl" + super.toString() + "]";
  }
}
