/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.joactrllib;
import com.wilutions.com.*;

/**
 * JoaBridgeCtrl.
 * 
 */
@CoClass(guid="{246D42EA-0513-447B-B7E6-86FE0400B3EA}")
public class JoaBridgeCtrl extends Dispatch implements IJoaBridgeCtrl {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-515)  public LONG_PTR getHWND() throws ComException {
    final Object obj = this._dispatchCall(-515,"HWND", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new LONG_PTR(als);
  }
  @DeclDISPID(1111)  public Boolean getFitToParent() throws ComException {
    final Object obj = this._dispatchCall(1111,"FitToParent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1111)  public void setFitToParent(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1111,"FitToParent", DISPATCH_PROPERTYPUT,value);
  }
  public JoaBridgeCtrl() throws ComException {
    super("{246D42EA-0513-447B-B7E6-86FE0400B3EA}", "{8B43F7ED-C4B5-4DBA-B174-E8D61C449B08}");
  }
  protected JoaBridgeCtrl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[JoaBridgeCtrl" + super.toString() + "]";
  }
}
