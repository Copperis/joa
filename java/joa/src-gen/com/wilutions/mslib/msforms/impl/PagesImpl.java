/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{52768368-D73B-CA8F-1D65-694DA596EC7A}")
public class PagesImpl extends Dispatch implements com.wilutions.mslib.msforms.Pages {
  @DeclDISPID(60)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(60,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public IDispatch Item(final Object varg) throws ComException {
    assert(varg != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,varg);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743811)  public Object Enum() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Enum", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(66)  public com.wilutions.mslib.msforms.Page Add(final Object bstrName, final Object bstrCaption, final Object lIndex) throws ComException {
    assert(bstrName != null);
    assert(bstrCaption != null);
    assert(lIndex != null);
    final Object obj = this._dispatchCall(66,"Add", DISPATCH_METHOD,null,Variant.param(bstrName),Variant.param(bstrCaption),Variant.param(lIndex));
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.msforms.Page.class);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.msforms.Page _AddCtrl(final Integer clsid, final String bstrName, final String bstrCaption) throws ComException {
    assert(clsid != null);
    assert(bstrName != null);
    assert(bstrCaption != null);
    final Object obj = this._dispatchCall(1610743813,"_AddCtrl", DISPATCH_METHOD,null,clsid,bstrName,bstrCaption);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.msforms.Page.class);
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.msforms.Page _InsertCtrl(final Integer clsid, final String bstrName, final String bstrCaption, final Integer lIndex) throws ComException {
    assert(clsid != null);
    assert(bstrName != null);
    assert(bstrCaption != null);
    assert(lIndex != null);
    final Object obj = this._dispatchCall(1610743814,"_InsertCtrl", DISPATCH_METHOD,null,clsid,bstrName,bstrCaption,lIndex);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.msforms.Page.class);
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.msforms.Control _GetItemByIndex(final Integer lIndex) throws ComException {
    assert(lIndex != null);
    final Object obj = this._dispatchCall(1610743815,"_GetItemByIndex", DISPATCH_METHOD,null,lIndex);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.msforms.Control.class);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.msforms.Control _GetItemByName(final String pstrName) throws ComException {
    assert(pstrName != null);
    final Object obj = this._dispatchCall(1610743816,"_GetItemByName", DISPATCH_METHOD,null,pstrName);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.msforms.Control.class);
  }
  @DeclDISPID(67)  public void Remove(final Object varg) throws ComException {
    assert(varg != null);
    this._dispatchCall(67,"Remove", DISPATCH_METHOD,null,varg);
  }
  @DeclDISPID(62)  public void Clear() throws ComException {
    this._dispatchCall(62,"Clear", DISPATCH_METHOD,null);
  }
  public PagesImpl(String progId) throws ComException {
    super(progId, "{92E11A03-7358-11CE-80CB-00AA00611080}");
  }
  protected PagesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PagesImpl" + super.toString() + "]";
  }
}
