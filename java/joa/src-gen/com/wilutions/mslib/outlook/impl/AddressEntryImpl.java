/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A920-A463-DB41-5DAE-69E7A5F7FCBC}")
public class AddressEntryImpl extends Dispatch implements com.wilutions.mslib.outlook.AddressEntry {
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
  @DeclDISPID(12291)  public String getAddress() throws ComException {
    final Object obj = this._dispatchCall(12291,"Address", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12291)  public void setAddress(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12291,"Address", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14592)  public com.wilutions.mslib.outlook.OlDisplayType getDisplayType() throws ComException {
    final Object obj = this._dispatchCall(14592,"DisplayType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlDisplayType.valueOf((Integer)obj);
  }
  @DeclDISPID(61470)  public String getID() throws ComException {
    final Object obj = this._dispatchCall(61470,"ID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12289)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(12289,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12289)  public void setName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12289,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12290)  public String getType() throws ComException {
    final Object obj = this._dispatchCall(12290,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12290)  public void setType(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12290,"Type", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(770)  public void Delete() throws ComException {
    this._dispatchCall(770,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(769)  public void Details(final Object HWnd) throws ComException {
    assert(HWnd != null);
    this._dispatchCall(769,"Details", DISPATCH_METHOD,null,HWnd);
  }
  @DeclDISPID(774)  public String GetFreeBusy(final java.util.Date Start, final Integer MinPerChar, final Object CompleteFormat) throws ComException {
    assert(Start != null);
    assert(MinPerChar != null);
    assert(CompleteFormat != null);
    final Object obj = this._dispatchCall(774,"GetFreeBusy", DISPATCH_METHOD,null,Start,MinPerChar,CompleteFormat);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(768)  public void Update(final Object MakePermanent, final Object Refresh) throws ComException {
    assert(MakePermanent != null);
    assert(Refresh != null);
    this._dispatchCall(768,"Update", DISPATCH_METHOD,null,MakePermanent,Refresh);
  }
  @DeclDISPID(64240)  public com.wilutions.mslib.outlook._ContactItem GetContact() throws ComException {
    final Object obj = this._dispatchCall(64240,"GetContact", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ContactItemImpl.class);
  }
  @DeclDISPID(64241)  public com.wilutions.mslib.outlook.ExchangeUser GetExchangeUser() throws ComException {
    final Object obj = this._dispatchCall(64241,"GetExchangeUser", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.ExchangeUser.class);
  }
  @DeclDISPID(64242)  public com.wilutions.mslib.outlook.OlAddressEntryUserType getAddressEntryUserType() throws ComException {
    final Object obj = this._dispatchCall(64242,"AddressEntryUserType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlAddressEntryUserType.valueOf((Integer)obj);
  }
  @DeclDISPID(64239)  public com.wilutions.mslib.outlook.ExchangeDistributionList GetExchangeDistributionList() throws ComException {
    final Object obj = this._dispatchCall(64239,"GetExchangeDistributionList", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.ExchangeDistributionList.class);
  }
  @DeclDISPID(64253)  public com.wilutions.mslib.outlook.PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.PropertyAccessor.class);
  }
  public AddressEntryImpl(String progId) throws ComException {
    super(progId, "{0006304B-0000-0000-C000-000000000046}");
  }
  protected AddressEntryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AddressEntryImpl" + super.toString() + "]";
  }
}
