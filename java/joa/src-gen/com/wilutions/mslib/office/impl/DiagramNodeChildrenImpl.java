/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A04-A463-DB41-5DAE-69E7A5F7FCBC}")
public class DiagramNodeChildrenImpl extends Dispatch implements com.wilutions.mslib.office.DiagramNodeChildren {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.DiagramNode Item(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.DiagramNodeImpl.class);
  }
  @DeclDISPID(10)  public com.wilutions.mslib.office.DiagramNode AddNode(final Object Index, final com.wilutions.mslib.office.MsoDiagramNodeType NodeType) throws ComException {
    assert(Index != null);
    assert(NodeType != null);
    final Object obj = this._dispatchCall(10,"AddNode", DISPATCH_METHOD,null,Variant.param(Index),NodeType.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.DiagramNodeImpl.class);
  }
  @DeclDISPID(11)  public void SelectAll() throws ComException {
    this._dispatchCall(11,"SelectAll", DISPATCH_METHOD,null);
  }
  @DeclDISPID(100)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(100,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(101)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(101,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(103)  public com.wilutions.mslib.office.DiagramNode getFirstChild() throws ComException {
    final Object obj = this._dispatchCall(103,"FirstChild", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.DiagramNodeImpl.class);
  }
  @DeclDISPID(104)  public com.wilutions.mslib.office.DiagramNode getLastChild() throws ComException {
    final Object obj = this._dispatchCall(104,"LastChild", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.DiagramNodeImpl.class);
  }
  public DiagramNodeChildrenImpl(String progId) throws ComException {
    super(progId, "{000C036F-0000-0000-C000-000000000046}");
  }
  protected DiagramNodeChildrenImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DiagramNodeChildrenImpl" + super.toString() + "]";
  }
}
