/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlkContactPhoto.
 * 
 */
@CoClass(guid="{0006F04F-0000-0000-C000-000000000046}")
public class OlkContactPhoto extends Dispatch implements _OlkContactPhoto {
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-514)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(-522)  public void setMouseIcon(com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(-521)  public OlMousePointer getMousePointer() throws ComException {
    final Object obj = this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlMousePointer.valueOf((Integer)obj);
  }
  @DeclDISPID(-521)  public void setMousePointer(OlMousePointer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYPUT,value.value);
  }
  public OlkContactPhoto() throws ComException {
    super("{0006F04F-0000-0000-C000-000000000046}", "{000672EB-0000-0000-C000-000000000046}");
  }
  protected OlkContactPhoto(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OlkContactPhoto" + super.toString() + "]";
  }
}
