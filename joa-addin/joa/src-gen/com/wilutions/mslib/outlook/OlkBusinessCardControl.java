/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlkBusinessCardControl.
 * 
 */
@CoClass(guid="{0006F050-0000-0000-C000-000000000046}")
public class OlkBusinessCardControl extends Dispatch implements _OlkBusinessCardControl {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,Dispatch.param(value));
  }
  @DeclDISPID(-521)  public OlMousePointer getMousePointer() throws ComException {
    final Object obj = this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlMousePointer.valueOf((Integer)obj);
  }
  @DeclDISPID(-521)  public void setMousePointer(final OlMousePointer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYPUT,value.value);
  }
  public OlkBusinessCardControl() throws ComException {
    super("{0006F050-0000-0000-C000-000000000046}", "{000672ED-0000-0000-C000-000000000046}");
  }
  protected OlkBusinessCardControl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OlkBusinessCardControl" + super.toString() + "]";
  }
}
