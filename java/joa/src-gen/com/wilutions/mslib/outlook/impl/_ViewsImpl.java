/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9E6-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _ViewsImpl extends Dispatch implements com.wilutions.mslib.outlook._Views {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
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
  @DeclDISPID(0)  public com.wilutions.mslib.outlook.View Item(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ViewImpl.class);
  }
  @DeclDISPID(95)  public com.wilutions.mslib.outlook.View Add(final String Name, final com.wilutions.mslib.outlook.OlViewType ViewType, final com.wilutions.mslib.outlook.OlViewSaveOption SaveOption) throws ComException {
    assert(Name != null);
    assert(ViewType != null);
    assert(SaveOption != null);
    final Object obj = this._dispatchCall(95,"Add", DISPATCH_METHOD,null,Name,ViewType.value,SaveOption.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ViewImpl.class);
  }
  @DeclDISPID(84)  public void Remove(final Object Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(84,"Remove", DISPATCH_METHOD,null,Index);
  }
  public _ViewsImpl(String progId) throws ComException {
    super(progId, "{0006308D-0000-0000-C000-000000000046}");
  }
  protected _ViewsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_ViewsImpl" + super.toString() + "]";
  }
}
