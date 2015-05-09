/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A17-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SharedWorkspaceFilesImpl extends Dispatch implements com.wilutions.mslib.office.SharedWorkspaceFiles {
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
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.SharedWorkspaceFile getItem(final Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SharedWorkspaceFileImpl.class);
  }
  @DeclDISPID(1)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public com.wilutions.mslib.office.SharedWorkspaceFile Add(final String FileName, final Object ParentFolder, final Object OverwriteIfFileAlreadyExists, final Object KeepInSync) throws ComException {
    assert(FileName != null);
    assert(ParentFolder != null);
    assert(OverwriteIfFileAlreadyExists != null);
    assert(KeepInSync != null);
    final Object obj = this._dispatchCall(2,"Add", DISPATCH_METHOD,null,FileName,Variant.param(ParentFolder),Variant.param(OverwriteIfFileAlreadyExists),Variant.param(KeepInSync));
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.SharedWorkspaceFileImpl.class);
  }
  @DeclDISPID(3)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(3,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(4)  public Boolean getItemCountExceeded() throws ComException {
    final Object obj = this._dispatchCall(4,"ItemCountExceeded", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public SharedWorkspaceFilesImpl(String progId) throws ComException {
    super(progId, "{000C037C-0000-0000-C000-000000000046}");
  }
  protected SharedWorkspaceFilesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SharedWorkspaceFilesImpl" + super.toString() + "]";
  }
}
