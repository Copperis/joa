/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * HTMLSelect.
 * 
 */
@CoClass(guid="{5512D122-5CC6-11CF-8D67-00AA00BDCE1D}")
public class HTMLSelect extends Dispatch implements IWHTMLSelect {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-541)  public void setHTMLName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(-541)  public String getHTMLName() throws ComException {
    final Object obj = this._dispatchCall(-541,"HTMLName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(611)  public void setValues(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(611,"Values", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(611)  public Object getValues() throws ComException {
    final Object obj = this._dispatchCall(611,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(612)  public void setDisplayValues(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(612,"DisplayValues", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(612)  public Object getDisplayValues() throws ComException {
    final Object obj = this._dispatchCall(612,"DisplayValues", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(613)  public void setSelected(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(613,"Selected", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(613)  public String getSelected() throws ComException {
    final Object obj = this._dispatchCall(613,"Selected", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(614)  public void setMultiSelect(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(614,"MultiSelect", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(614)  public Boolean getMultiSelect() throws ComException {
    final Object obj = this._dispatchCall(614,"MultiSelect", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(619)  public void setSize(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(619,"Size", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(619)  public Integer getSize() throws ComException {
    final Object obj = this._dispatchCall(619,"Size", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public HTMLSelect() throws ComException {
    super("{5512D122-5CC6-11CF-8D67-00AA00BDCE1D}", "{5512D123-5CC6-11CF-8D67-00AA00BDCE1D}");
  }
  protected HTMLSelect(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[HTMLSelect" + super.toString() + "]";
  }
}
