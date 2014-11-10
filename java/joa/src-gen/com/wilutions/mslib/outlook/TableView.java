/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * TableView.
 * 
 */
@CoClass(guid="{00062000-0000-0000-C000-000000000046}")
public class TableView extends Dispatch implements _TableView {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(407)  public void Apply() throws ComException {
    this._dispatchCall(407,"Apply", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61490)  public View Copy(String Name, OlViewSaveOption SaveOption) throws ComException {
    assert(Name != null);
    assert(SaveOption != null);
    final Object obj = this._dispatchCall(61490,"Copy", DISPATCH_METHOD,null,Name,SaveOption.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.ViewImpl.class);
  }
  @DeclDISPID(61514)  public void Delete() throws ComException {
    this._dispatchCall(61514,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64068)  public void Reset() throws ComException {
    this._dispatchCall(64068,"Reset", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61512)  public void Save() throws ComException {
    this._dispatchCall(61512,"Save", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64065)  public String getLanguage() throws ComException {
    final Object obj = this._dispatchCall(64065,"Language", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64065)  public void setLanguage(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64065,"Language", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64064)  public Boolean getLockUserChanges() throws ComException {
    final Object obj = this._dispatchCall(64064,"LockUserChanges", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64064)  public void setLockUserChanges(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64064,"LockUserChanges", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(0,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64063)  public OlViewSaveOption getSaveOption() throws ComException {
    final Object obj = this._dispatchCall(64063,"SaveOption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlViewSaveOption.valueOf((Integer)obj);
  }
  @DeclDISPID(64062)  public Boolean getStandard() throws ComException {
    final Object obj = this._dispatchCall(64062,"Standard", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(404)  public OlViewType getViewType() throws ComException {
    final Object obj = this._dispatchCall(404,"ViewType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlViewType.valueOf((Integer)obj);
  }
  @DeclDISPID(64060)  public String getXML() throws ComException {
    final Object obj = this._dispatchCall(64060,"XML", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64060)  public void setXML(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64060,"XML", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64054)  public void GoToDate(java.util.Date Date) throws ComException {
    assert(Date != null);
    this._dispatchCall(64054,"GoToDate", DISPATCH_METHOD,null,Date);
  }
  @DeclDISPID(409)  public String getFilter() throws ComException {
    final Object obj = this._dispatchCall(409,"Filter", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(409)  public void setFilter(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(409,"Filter", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64341)  public ViewFields getViewFields() throws ComException {
    final Object obj = this._dispatchCall(64341,"ViewFields", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(ViewFields.class);
  }
  @DeclDISPID(64344)  public OrderFields getGroupByFields() throws ComException {
    final Object obj = this._dispatchCall(64344,"GroupByFields", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(OrderFields.class);
  }
  @DeclDISPID(64346)  public OrderFields getSortFields() throws ComException {
    final Object obj = this._dispatchCall(64346,"SortFields", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(OrderFields.class);
  }
  @DeclDISPID(64347)  public Integer getMaxLinesInMultiLineView() throws ComException {
    final Object obj = this._dispatchCall(64347,"MaxLinesInMultiLineView", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64347)  public void setMaxLinesInMultiLineView(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64347,"MaxLinesInMultiLineView", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64345)  public Boolean getAutomaticGrouping() throws ComException {
    final Object obj = this._dispatchCall(64345,"AutomaticGrouping", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64345)  public void setAutomaticGrouping(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64345,"AutomaticGrouping", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64384)  public OlDefaultExpandCollapseSetting getDefaultExpandCollapseSetting() throws ComException {
    final Object obj = this._dispatchCall(64384,"DefaultExpandCollapseSetting", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlDefaultExpandCollapseSetting.valueOf((Integer)obj);
  }
  @DeclDISPID(64384)  public void setDefaultExpandCollapseSetting(OlDefaultExpandCollapseSetting value) throws ComException {
    assert(value != null);
    this._dispatchCall(64384,"DefaultExpandCollapseSetting", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64348)  public Boolean getAutomaticColumnSizing() throws ComException {
    final Object obj = this._dispatchCall(64348,"AutomaticColumnSizing", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64348)  public void setAutomaticColumnSizing(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64348,"AutomaticColumnSizing", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64349)  public OlMultiLine getMultiLine() throws ComException {
    final Object obj = this._dispatchCall(64349,"MultiLine", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlMultiLine.valueOf((Integer)obj);
  }
  @DeclDISPID(64349)  public void setMultiLine(OlMultiLine value) throws ComException {
    assert(value != null);
    this._dispatchCall(64349,"MultiLine", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64350)  public Integer getMultiLineWidth() throws ComException {
    final Object obj = this._dispatchCall(64350,"MultiLineWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64350)  public void setMultiLineWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64350,"MultiLineWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64351)  public Boolean getAllowInCellEditing() throws ComException {
    final Object obj = this._dispatchCall(64351,"AllowInCellEditing", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64351)  public void setAllowInCellEditing(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64351,"AllowInCellEditing", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64352)  public Boolean getShowNewItemRow() throws ComException {
    final Object obj = this._dispatchCall(64352,"ShowNewItemRow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64352)  public void setShowNewItemRow(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64352,"ShowNewItemRow", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64353)  public OlGridLineStyle getGridLineStyle() throws ComException {
    final Object obj = this._dispatchCall(64353,"GridLineStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlGridLineStyle.valueOf((Integer)obj);
  }
  @DeclDISPID(64353)  public void setGridLineStyle(OlGridLineStyle value) throws ComException {
    assert(value != null);
    this._dispatchCall(64353,"GridLineStyle", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64354)  public Boolean getShowItemsInGroups() throws ComException {
    final Object obj = this._dispatchCall(64354,"ShowItemsInGroups", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64354)  public void setShowItemsInGroups(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64354,"ShowItemsInGroups", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64355)  public Boolean getShowReadingPane() throws ComException {
    final Object obj = this._dispatchCall(64355,"ShowReadingPane", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64355)  public void setShowReadingPane(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64355,"ShowReadingPane", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64356)  public Boolean getHideReadingPaneHeaderInfo() throws ComException {
    final Object obj = this._dispatchCall(64356,"HideReadingPaneHeaderInfo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64356)  public void setHideReadingPaneHeaderInfo(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64356,"HideReadingPaneHeaderInfo", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64360)  public ViewFont getRowFont() throws ComException {
    final Object obj = this._dispatchCall(64360,"RowFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(ViewFont.class);
  }
  @DeclDISPID(64359)  public ViewFont getColumnFont() throws ComException {
    final Object obj = this._dispatchCall(64359,"ColumnFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(ViewFont.class);
  }
  @DeclDISPID(64361)  public ViewFont getAutoPreviewFont() throws ComException {
    final Object obj = this._dispatchCall(64361,"AutoPreviewFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(ViewFont.class);
  }
  @DeclDISPID(64376)  public OlAutoPreview getAutoPreview() throws ComException {
    final Object obj = this._dispatchCall(64376,"AutoPreview", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlAutoPreview.valueOf((Integer)obj);
  }
  @DeclDISPID(64376)  public void setAutoPreview(OlAutoPreview value) throws ComException {
    assert(value != null);
    this._dispatchCall(64376,"AutoPreview", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64059)  public AutoFormatRules getAutoFormatRules() throws ComException {
    final Object obj = this._dispatchCall(64059,"AutoFormatRules", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(AutoFormatRules.class);
  }
  @DeclDISPID(64285)  public Table GetTable() throws ComException {
    final Object obj = this._dispatchCall(64285,"GetTable", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(Table.class);
  }
  @DeclDISPID(64640)  public Boolean getShowConversationByDate() throws ComException {
    final Object obj = this._dispatchCall(64640,"ShowConversationByDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64640)  public void setShowConversationByDate(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64640,"ShowConversationByDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64641)  public Boolean getShowFullConversations() throws ComException {
    final Object obj = this._dispatchCall(64641,"ShowFullConversations", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64641)  public void setShowFullConversations(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64641,"ShowFullConversations", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64643)  public Boolean getAlwaysExpandConversation() throws ComException {
    final Object obj = this._dispatchCall(64643,"AlwaysExpandConversation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64643)  public void setAlwaysExpandConversation(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64643,"AlwaysExpandConversation", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64649)  public Boolean getShowConversationSendersAboveSubject() throws ComException {
    final Object obj = this._dispatchCall(64649,"ShowConversationSendersAboveSubject", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64649)  public void setShowConversationSendersAboveSubject(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64649,"ShowConversationSendersAboveSubject", DISPATCH_PROPERTYPUT,value);
  }
  public TableView() throws ComException {
    super("{00062000-0000-0000-C000-000000000046}");
  }
  protected TableView(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TableView" + super.toString() + "]";
  }
}
