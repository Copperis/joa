/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * NavigationFolders.
 * 
 */
@CoClass(guid="{000610F1-0000-0000-C000-000000000046}")
public class NavigationFolders extends Dispatch implements _NavigationFolders {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public _NavigationFolder Item(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NavigationFolderImpl.class);
  }
  @DeclDISPID(64450)  public NavigationFolder Add(final MAPIFolder Folder) throws ComException {
    final Object obj = this._dispatchCall(64450,"Add", DISPATCH_METHOD,null,Dispatch.param(Folder));
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(NavigationFolder.class);
  }
  @DeclDISPID(64451)  public void Remove(final NavigationFolder RemovableFolder) throws ComException {
    this._dispatchCall(64451,"Remove", DISPATCH_METHOD,null,Dispatch.param(RemovableFolder));
  }
  public NavigationFolders() throws ComException {
    super("{000610F1-0000-0000-C000-000000000046}", "{000630F1-0000-0000-C000-000000000046}");
  }
  protected NavigationFolders(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[NavigationFolders" + super.toString() + "]";
  }
}
