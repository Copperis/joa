/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B907F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class WebPageFontsImpl extends Dispatch implements com.wilutions.mslib.office.WebPageFonts {
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
  @DeclDISPID(1)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.WebPageFont getItem(final com.wilutions.mslib.office.MsoCharacterSet Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.WebPageFontImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public WebPageFontsImpl(String progId) throws ComException {
    super(progId, "{000C0914-0000-0000-C000-000000000046}");
  }
  protected WebPageFontsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[WebPageFontsImpl" + super.toString() + "]";
  }
}
