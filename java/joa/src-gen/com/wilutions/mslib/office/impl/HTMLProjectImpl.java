/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A3D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class HTMLProjectImpl extends Dispatch implements com.wilutions.mslib.office.HTMLProject {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.MsoHTMLProjectState getState() throws ComException {
    final Object obj = this._dispatchCall(0,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoHTMLProjectState.valueOf((Integer)obj);
  }
  @DeclDISPID(1)  public void RefreshProject(final Boolean Refresh) throws ComException {
    assert(Refresh != null);
    this._dispatchCall(1,"RefreshProject", DISPATCH_METHOD,null,Refresh);
  }
  @DeclDISPID(2)  public void RefreshDocument(final Boolean Refresh) throws ComException {
    assert(Refresh != null);
    this._dispatchCall(2,"RefreshDocument", DISPATCH_METHOD,null,Refresh);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.HTMLProjectItems getHTMLProjectItems() throws ComException {
    final Object obj = this._dispatchCall(3,"HTMLProjectItems", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.HTMLProjectItemsImpl.class);
  }
  @DeclDISPID(4)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(4,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(5)  public void Open(final com.wilutions.mslib.office.MsoHTMLProjectOpen OpenKind) throws ComException {
    assert(OpenKind != null);
    this._dispatchCall(5,"Open", DISPATCH_METHOD,null,OpenKind.value);
  }
  public HTMLProjectImpl(String progId) throws ComException {
    super(progId, "{000C0356-0000-0000-C000-000000000046}");
  }
  protected HTMLProjectImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLProjectImpl" + super.toString() + "]";
  }
}
