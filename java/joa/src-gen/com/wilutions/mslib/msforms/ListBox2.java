/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * ListBox2.
 * 
 */
@CoClass(guid="{19FED08E-EFD1-45DA-B524-7BE4774A6AEE}")
public class ListBox2 extends Dispatch implements IMdcList {
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
  @DeclDISPID(-503)  public void setBorderColor(final OLE_COLOR value) throws ComException {
    assert(value != null);
    this._dispatchCall(-503,"BorderColor", DISPATCH_PROPERTYPUT,value.getValue());
  }
  @DeclDISPID(-503)  public OLE_COLOR getBorderColor() throws ComException {
    final Object obj = this._dispatchCall(-503,"BorderColor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Integer als = (Integer)obj;
    return new OLE_COLOR(als);
  }
  @DeclDISPID(-504)  public void setBorderStyle(final fmBorderStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-504)  public fmBorderStyle getBorderStyle() throws ComException {
    final Object obj = this._dispatchCall(-504,"BorderStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmBorderStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(501)  public void setBoundColumn(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(501,"BoundColumn", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(501)  public Object getBoundColumn() throws ComException {
    final Object obj = this._dispatchCall(501,"BoundColumn", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(601)  public void setColumnCount(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(601,"ColumnCount", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(601)  public Integer getColumnCount() throws ComException {
    final Object obj = this._dispatchCall(601,"ColumnCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(602)  public void setColumnHeads(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(602,"ColumnHeads", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(602)  public Boolean getColumnHeads() throws ComException {
    final Object obj = this._dispatchCall(602,"ColumnHeads", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(603)  public void setColumnWidths(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(603,"ColumnWidths", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(603)  public String getColumnWidths() throws ComException {
    final Object obj = this._dispatchCall(603,"ColumnWidths", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
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
  @DeclDISPID(-512)  public void setFont(final Font value) throws ComException {
    this._dispatchCall(-512,"Font", DISPATCH_PROPERTYPUTREF,Dispatch.param(value));
  }
  @DeclDISPID(-512)  public Font getFont() throws ComException {
    final Object obj = this._dispatchCall(-512,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.msforms.impl.FontImpl.class);
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
  @DeclDISPID(604)  public void setIntegralHeight(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(604,"IntegralHeight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(604)  public Boolean getIntegralHeight() throws ComException {
    final Object obj = this._dispatchCall(604,"IntegralHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-531)  public Integer getListCount() throws ComException {
    final Object obj = this._dispatchCall(-531,"ListCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(-526)  public void setListIndex(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(-526,"ListIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-526)  public Object getListIndex() throws ComException {
    final Object obj = this._dispatchCall(-526,"ListIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(307)  public void setListStyle(final fmListStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(307,"ListStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(307)  public fmListStyle getListStyle() throws ComException {
    final Object obj = this._dispatchCall(307,"ListStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmListStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(10)  public void setLocked(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(10,"Locked", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(10)  public Boolean getLocked() throws ComException {
    final Object obj = this._dispatchCall(10,"Locked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(504)  public void setMatchEntry(final fmMatchEntry value) throws ComException {
    assert(value != null);
    this._dispatchCall(504,"MatchEntry", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(504)  public fmMatchEntry getMatchEntry() throws ComException {
    final Object obj = this._dispatchCall(504,"MatchEntry", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmMatchEntry.valueOf((Integer)obj);
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
  @DeclDISPID(-532)  public void setMultiSelect(final fmMultiSelect value) throws ComException {
    assert(value != null);
    this._dispatchCall(-532,"MultiSelect", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-532)  public fmMultiSelect getMultiSelect() throws ComException {
    final Object obj = this._dispatchCall(-532,"MultiSelect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmMultiSelect.valueOf((Integer)obj);
  }
  @DeclDISPID(12)  public void setSpecialEffect(final fmSpecialEffect value) throws ComException {
    assert(value != null);
    this._dispatchCall(12,"SpecialEffect", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(12)  public fmSpecialEffect getSpecialEffect() throws ComException {
    final Object obj = this._dispatchCall(12,"SpecialEffect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmSpecialEffect.valueOf((Integer)obj);
  }
  @DeclDISPID(-517)  public void setText(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-517,"Text", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-517)  public String getText() throws ComException {
    final Object obj = this._dispatchCall(-517,"Text", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(502)  public void setTextColumn(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(502,"TextColumn", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(502)  public Object getTextColumn() throws ComException {
    final Object obj = this._dispatchCall(502,"TextColumn", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(611)  public void setTopIndex(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(611,"TopIndex", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(611)  public Object getTopIndex() throws ComException {
    final Object obj = this._dispatchCall(611,"TopIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setValue(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(-529)  public Object getColumn(final Object pvargColumn, final Object pvargIndex) throws ComException {
    assert(pvargColumn != null);
    assert(pvargIndex != null);
    final Object obj = this._dispatchCall(-529,"Column", DISPATCH_PROPERTYGET,null,pvargColumn,pvargIndex);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(-529)  public void setColumn(final Object pvargColumn, final Object pvargIndex, final Object value3) throws ComException {
    assert(value3 != null);
    assert(pvargColumn != null);
    assert(pvargIndex != null);
    this._dispatchCall(-529,"Column", DISPATCH_PROPERTYPUT,value3,pvargColumn,pvargIndex);
  }
  @DeclDISPID(-528)  public Object getList(final Object pvargIndex, final Object pvargColumn) throws ComException {
    assert(pvargIndex != null);
    assert(pvargColumn != null);
    final Object obj = this._dispatchCall(-528,"List", DISPATCH_PROPERTYGET,null,pvargIndex,pvargColumn);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(-528)  public void setList(final Object pvargIndex, final Object pvargColumn, final Object value3) throws ComException {
    assert(value3 != null);
    assert(pvargIndex != null);
    assert(pvargColumn != null);
    this._dispatchCall(-528,"List", DISPATCH_PROPERTYPUT,value3,pvargIndex,pvargColumn);
  }
  @DeclDISPID(-527)  public Boolean getSelected(final Object pvargIndex) throws ComException {
    assert(pvargIndex != null);
    final Object obj = this._dispatchCall(-527,"Selected", DISPATCH_PROPERTYGET,null,pvargIndex);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-527)  public void setSelected(final Object pvargIndex, final Boolean value2) throws ComException {
    assert(value2 != null);
    assert(pvargIndex != null);
    this._dispatchCall(-527,"Selected", DISPATCH_PROPERTYPUT,value2,pvargIndex);
  }
  @DeclDISPID(-553)  public void AddItem(final Object pvargItem, final Object pvargIndex) throws ComException {
    assert(pvargItem != null);
    assert(pvargIndex != null);
    this._dispatchCall(-553,"AddItem", DISPATCH_METHOD,null,pvargItem,pvargIndex);
  }
  @DeclDISPID(-554)  public void Clear() throws ComException {
    this._dispatchCall(-554,"Clear", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-555)  public void RemoveItem(final Object pvargIndex) throws ComException {
    assert(pvargIndex != null);
    this._dispatchCall(-555,"RemoveItem", DISPATCH_METHOD,null,pvargIndex);
  }
  @DeclDISPID(-542)  public void setIMEMode(final fmIMEMode value) throws ComException {
    assert(value != null);
    this._dispatchCall(-542,"IMEMode", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(-542)  public fmIMEMode getIMEMode() throws ComException {
    final Object obj = this._dispatchCall(-542,"IMEMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmIMEMode.valueOf((Integer)obj);
  }
  @DeclDISPID(10004)  public void setTextAlign(final fmTextAlign value) throws ComException {
    assert(value != null);
    this._dispatchCall(10004,"TextAlign", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(10004)  public fmTextAlign getTextAlign() throws ComException {
    final Object obj = this._dispatchCall(10004,"TextAlign", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return fmTextAlign.valueOf((Integer)obj);
  }
  public ListBox2() throws ComException {
    super("{19FED08E-EFD1-45DA-B524-7BE4774A6AEE}", "{8BD21D23-EC42-11CE-9E0D-00AA006002F3}");
  }
  protected ListBox2(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ListBox2" + super.toString() + "]";
  }
}
