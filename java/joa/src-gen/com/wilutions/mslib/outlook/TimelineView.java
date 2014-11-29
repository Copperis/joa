/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * TimelineView.
 * 
 */
@CoClass(guid="{00062001-0000-0000-C000-000000000046}")
public class TimelineView extends Dispatch implements _TimelineView {
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
  @DeclDISPID(407)  public void Apply() throws ComException {
    this._dispatchCall(407,"Apply", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61490)  public View Copy(String Name, OlViewSaveOption SaveOption) throws ComException {
    assert(Name != null);
    assert(SaveOption != null);
    final Object obj = this._dispatchCall(61490,"Copy", DISPATCH_METHOD,null,Name,SaveOption.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ViewImpl.class);
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
  @DeclDISPID(8449)  public String getStartField() throws ComException {
    final Object obj = this._dispatchCall(8449,"StartField", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8449)  public void setStartField(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(8449,"StartField", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64379)  public String getEndField() throws ComException {
    final Object obj = this._dispatchCall(64379,"EndField", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64379)  public void setEndField(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64379,"EndField", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64344)  public OrderFields getGroupByFields() throws ComException {
    final Object obj = this._dispatchCall(64344,"GroupByFields", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(OrderFields.class);
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
  @DeclDISPID(64373)  public Boolean getShowWeekNumbers() throws ComException {
    final Object obj = this._dispatchCall(64373,"ShowWeekNumbers", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64373)  public void setShowWeekNumbers(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64373,"ShowWeekNumbers", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64043)  public Integer getMaxLabelWidth() throws ComException {
    final Object obj = this._dispatchCall(64043,"MaxLabelWidth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64043)  public void setMaxLabelWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64043,"MaxLabelWidth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64372)  public Boolean getShowLabelWhenViewingByMonth() throws ComException {
    final Object obj = this._dispatchCall(64372,"ShowLabelWhenViewingByMonth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64372)  public void setShowLabelWhenViewingByMonth(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64372,"ShowLabelWhenViewingByMonth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64040)  public ViewFont getUpperScaleFont() throws ComException {
    final Object obj = this._dispatchCall(64040,"UpperScaleFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(ViewFont.class);
  }
  @DeclDISPID(64044)  public ViewFont getLowerScaleFont() throws ComException {
    final Object obj = this._dispatchCall(64044,"LowerScaleFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(ViewFont.class);
  }
  @DeclDISPID(64045)  public ViewFont getItemFont() throws ComException {
    final Object obj = this._dispatchCall(64045,"ItemFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(ViewFont.class);
  }
  @DeclDISPID(64392)  public OlTimelineViewMode getTimelineViewMode() throws ComException {
    final Object obj = this._dispatchCall(64392,"TimelineViewMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlTimelineViewMode.valueOf((Integer)obj);
  }
  @DeclDISPID(64392)  public void setTimelineViewMode(OlTimelineViewMode value) throws ComException {
    assert(value != null);
    this._dispatchCall(64392,"TimelineViewMode", DISPATCH_PROPERTYPUT,value.value);
  }
  public TimelineView() throws ComException {
    super("{00062001-0000-0000-C000-000000000046}", "{0006309C-0000-0000-C000-000000000046}");
  }
  protected TimelineView(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[TimelineView" + super.toString() + "]";
  }
}
