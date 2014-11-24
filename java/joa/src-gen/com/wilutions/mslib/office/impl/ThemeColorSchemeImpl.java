/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AC9-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ThemeColorSchemeImpl extends Dispatch implements com.wilutions.mslib.office.ThemeColorScheme {
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
  @DeclDISPID(1)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(2)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(2,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.ThemeColor Colors(com.wilutions.mslib.office.MsoThemeColorSchemeIndex Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Colors", DISPATCH_METHOD,null,Index.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.ThemeColorImpl.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(3)  public void Load(String FileName) throws ComException {
    assert(FileName != null);
    this._dispatchCall(3,"Load", DISPATCH_METHOD,null,FileName);
  }
  @DeclDISPID(4)  public void Save(String FileName) throws ComException {
    assert(FileName != null);
    this._dispatchCall(4,"Save", DISPATCH_METHOD,null,FileName);
  }
  @DeclDISPID(5)  public com.wilutions.mslib.office.MsoRGBType GetCustomColor(String Name) throws ComException {
    assert(Name != null);
    final Object obj = this._dispatchCall(5,"GetCustomColor", DISPATCH_METHOD,null,Name);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new com.wilutions.mslib.office.MsoRGBType(als);
  }
  public ThemeColorSchemeImpl(String progId) throws ComException {
    super(progId, "{000C03A2-0000-0000-C000-000000000046}");
  }
  protected ThemeColorSchemeImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ThemeColorSchemeImpl" + super.toString() + "]";
  }
}
