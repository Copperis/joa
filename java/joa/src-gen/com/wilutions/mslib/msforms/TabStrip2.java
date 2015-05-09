/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * TabStrip2.
 * 
 */
@CoClass(guid="{FDEA20DB-AC7A-42F8-90EE-82208B9B4FC0}")
public class TabStrip2 extends Dispatch implements ITabStrip {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-501)  public void setBackColor(final OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-501)  public OLE_COLOR getBackColor() throws ComException {
    final Object obj = this._dispatchCall(-501,"BackColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new OLE_COLOR(als);
  }
  @DeclDISPID(-513)  public void setForeColor(final OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-513)  public OLE_COLOR getForeColor() throws ComException {
    final Object obj = this._dispatchCall(-513,"ForeColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new OLE_COLOR(als);
  }
  @DeclDISPID(-512)  public void setFont(final Font value) throws ComException {
    this._dispatchCall(-512,"Font", DISPATCH_PROPERTYPUTREF,Dispatch.param(value));
  }
  @DeclDISPID(-512)  public Font getFont() throws ComException {
    final Object obj = this._dispatchCall(-512,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.msforms.impl.FontImpl.class);
  }
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(-514,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException {
    this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYPUT,Dispatch.param(value));
  }
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException {
    final Object obj = this._dispatchCall(-522,"MouseIcon", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  @DeclDISPID(-521)  public void setMousePointer(final fmMousePointer value) throws ComException {
    assert(value != null);
    this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-521)  public fmMousePointer getMousePointer() throws ComException {
    final Object obj = this._dispatchCall(-521,"MousePointer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmMousePointer.valueOf((Integer)obj);
  }
  @DeclDISPID(514)  public void setMultiRow(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(514,"MultiRow", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(514)  public Boolean getMultiRow() throws ComException {
    final Object obj = this._dispatchCall(514,"MultiRow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(513)  public void setStyle(final fmTabStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(513,"Style", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(513)  public fmTabStyle getStyle() throws ComException {
    final Object obj = this._dispatchCall(513,"Style", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmTabStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(512)  public void setTabOrientation(final fmTabOrientation value) throws ComException {
    assert(value != null);
    this._dispatchCall(512,"TabOrientation", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(512)  public fmTabOrientation getTabOrientation() throws ComException {
    final Object obj = this._dispatchCall(512,"TabOrientation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmTabOrientation.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743840)  public void _SetTabFixedWidth(final Integer TabFixedWidth) throws ComException {
    assert(TabFixedWidth != null);
    this._dispatchCall(1610743840,"_SetTabFixedWidth", DISPATCH_METHOD,null,TabFixedWidth);
  }
  @DeclDISPID(1610743841)  public void _GetTabFixedWidth(final ByRef<Integer> TabFixedWidth) throws ComException {
    assert(TabFixedWidth != null);
    this._dispatchCall(1610743841,"_GetTabFixedWidth", DISPATCH_METHOD,null,TabFixedWidth);
  }
  @DeclDISPID(1610743842)  public void _SetTabFixedHeight(final Integer TabFixedHeight) throws ComException {
    assert(TabFixedHeight != null);
    this._dispatchCall(1610743842,"_SetTabFixedHeight", DISPATCH_METHOD,null,TabFixedHeight);
  }
  @DeclDISPID(1610743843)  public void _GetTabFixedHeight(final ByRef<Integer> TabFixedHeight) throws ComException {
    assert(TabFixedHeight != null);
    this._dispatchCall(1610743843,"_GetTabFixedHeight", DISPATCH_METHOD,null,TabFixedHeight);
  }
  @DeclDISPID(1610743844)  public void _GetClientTop(final ByRef<Integer> ClientTop) throws ComException {
    assert(ClientTop != null);
    this._dispatchCall(1610743844,"_GetClientTop", DISPATCH_METHOD,null,ClientTop);
  }
  @DeclDISPID(548)  public Float getClientTop() throws ComException {
    final Object obj = this._dispatchCall(548,"ClientTop", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743846)  public void _GetClientLeft(final ByRef<Integer> ClientLeft) throws ComException {
    assert(ClientLeft != null);
    this._dispatchCall(1610743846,"_GetClientLeft", DISPATCH_METHOD,null,ClientLeft);
  }
  @DeclDISPID(547)  public Float getClientLeft() throws ComException {
    final Object obj = this._dispatchCall(547,"ClientLeft", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743848)  public void _GetClientWidth(final ByRef<Integer> ClientWidth) throws ComException {
    assert(ClientWidth != null);
    this._dispatchCall(1610743848,"_GetClientWidth", DISPATCH_METHOD,null,ClientWidth);
  }
  @DeclDISPID(549)  public Float getClientWidth() throws ComException {
    final Object obj = this._dispatchCall(549,"ClientWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(1610743850)  public void _GetClientHeight(final ByRef<Integer> ClientHeight) throws ComException {
    assert(ClientHeight != null);
    this._dispatchCall(1610743850,"_GetClientHeight", DISPATCH_METHOD,null,ClientHeight);
  }
  @DeclDISPID(546)  public Float getClientHeight() throws ComException {
    final Object obj = this._dispatchCall(546,"ClientHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(0)  public Tabs getTabs() throws ComException {
    final Object obj = this._dispatchCall(0,"Tabs", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.msforms.impl.TabsImpl.class);
  }
  @DeclDISPID(545)  public Tab getSelectedItem() throws ComException {
    final Object obj = this._dispatchCall(545,"SelectedItem", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.msforms.impl.TabImpl.class);
  }
  @DeclDISPID(528)  public void setValue(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(528,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(528)  public Integer getValue() throws ComException {
    final Object obj = this._dispatchCall(528,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(515)  public void setTabFixedWidth(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(515,"TabFixedWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(515)  public Float getTabFixedWidth() throws ComException {
    final Object obj = this._dispatchCall(515,"TabFixedWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  @DeclDISPID(516)  public void setTabFixedHeight(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(516,"TabFixedHeight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(516)  public Float getTabFixedHeight() throws ComException {
    final Object obj = this._dispatchCall(516,"TabFixedHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  public TabStrip2() throws ComException {
    super("{FDEA20DB-AC7A-42F8-90EE-82208B9B4FC0}", "{04598FC2-866C-11CF-AB7C-00AA00C08FCF}");
  }
  protected TabStrip2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TabStrip2" + super.toString() + "]";
  }
}
