/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoEnvelope.
 * 
 */
@CoClass(guid="{0006F01A-0000-0000-C000-000000000046}")
public class MsoEnvelope extends Dispatch implements IMsoEnvelopeVB {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public String getIntroduction() throws ComException {
    final Object obj = this._dispatchCall(1,"Introduction", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public void setIntroduction(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"Introduction", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2)  public IDispatch getItem() throws ComException {
    final Object obj = this._dispatchCall(2,"Item", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(3)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(3,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(4)  public IDispatch getCommandBars() throws ComException {
    final Object obj = this._dispatchCall(4,"CommandBars", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public MsoEnvelope() throws ComException {
    super("{0006F01A-0000-0000-C000-000000000046}", "{000672AC-0000-0000-C000-000000000046}");
  }
  protected MsoEnvelope(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[MsoEnvelope" + super.toString() + "]";
  }
}
