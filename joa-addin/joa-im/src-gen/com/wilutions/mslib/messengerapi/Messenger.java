/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * Messenger.
 * Messenger Object 
 */
@CoClass(guid="{B69003B3-C55E-4B48-836C-BC5946FC3B28}")
public class Messenger extends Dispatch implements IMessenger4 {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1283)  public IDispatch getWindow() throws ComException {
    final Object obj = this._dispatchCall(1283,"Window", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1285)  public void ViewProfile(final Object vContact) throws ComException {
    assert(vContact != null);
    this._dispatchCall(1285,"ViewProfile", DISPATCH_METHOD,null,vContact);
  }
  @DeclDISPID(1280)  public String getReceiveFileDirectory() throws ComException {
    final Object obj = this._dispatchCall(1280,"ReceiveFileDirectory", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1281)  public IDispatch StartVoice(final Object vContact) throws ComException {
    assert(vContact != null);
    final Object obj = this._dispatchCall(1281,"StartVoice", DISPATCH_METHOD,null,vContact);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1295)  public IDispatch InviteApp(final Object vContact, final String bstrAppID) throws ComException {
    assert(vContact != null);
    assert(bstrAppID != null);
    final Object obj = this._dispatchCall(1295,"InviteApp", DISPATCH_METHOD,null,vContact,bstrAppID);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1298)  public void SendMail(final Object vContact) throws ComException {
    assert(vContact != null);
    this._dispatchCall(1298,"SendMail", DISPATCH_METHOD,null,vContact);
  }
  @DeclDISPID(1293)  public void OpenInbox() throws ComException {
    this._dispatchCall(1293,"OpenInbox", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1292)  public IDispatch SendFile(final Object vContact, final String bstrFileName) throws ComException {
    assert(vContact != null);
    assert(bstrFileName != null);
    final Object obj = this._dispatchCall(1292,"SendFile", DISPATCH_METHOD,null,vContact,bstrFileName);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1291)  public void Signout() throws ComException {
    this._dispatchCall(1291,"Signout", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1297)  public void Signin(final Integer hwndParent, final String bstrSigninName, final String bstrPassword) throws ComException {
    assert(hwndParent != null);
    assert(bstrSigninName != null);
    assert(bstrPassword != null);
    this._dispatchCall(1297,"Signin", DISPATCH_METHOD,null,hwndParent,bstrSigninName,bstrPassword);
  }
  @DeclDISPID(1286)  public IDispatch GetContact(final String bstrSigninName, final String bstrServiceId) throws ComException {
    assert(bstrSigninName != null);
    assert(bstrServiceId != null);
    final Object obj = this._dispatchCall(1286,"GetContact", DISPATCH_METHOD,null,bstrSigninName,bstrServiceId);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1287)  public void OptionsPages(final Integer hwndParent, final MOPTIONPAGE MOPTIONPAGE) throws ComException {
    assert(hwndParent != null);
    assert(MOPTIONPAGE != null);
    this._dispatchCall(1287,"OptionsPages", DISPATCH_METHOD,null,hwndParent,MOPTIONPAGE.value);
  }
  @DeclDISPID(1288)  public void AddContact(final Integer hwndParent, final String bstrEMail) throws ComException {
    assert(hwndParent != null);
    assert(bstrEMail != null);
    this._dispatchCall(1288,"AddContact", DISPATCH_METHOD,null,hwndParent,bstrEMail);
  }
  @DeclDISPID(1289)  public void FindContact(final Integer hwndParent, final String bstrFirstName, final String bstrLastName, final Object vbstrCity, final Object vbstrState, final Object vbstrCountry) throws ComException {
    assert(hwndParent != null);
    assert(bstrFirstName != null);
    assert(bstrLastName != null);
    assert(vbstrCity != null);
    assert(vbstrState != null);
    assert(vbstrCountry != null);
    this._dispatchCall(1289,"FindContact", DISPATCH_METHOD,null,hwndParent,bstrFirstName,bstrLastName,vbstrCity,vbstrState,vbstrCountry);
  }
  @DeclDISPID(1290)  public IDispatch InstantMessage(final Object vContact) throws ComException {
    assert(vContact != null);
    final Object obj = this._dispatchCall(1290,"InstantMessage", DISPATCH_METHOD,null,vContact);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1300)  public IDispatch Phone(final Object vContact, final MPHONE_TYPE ePhoneNumber, final String bstrNumber) throws ComException {
    assert(vContact != null);
    assert(ePhoneNumber != null);
    assert(bstrNumber != null);
    final Object obj = this._dispatchCall(1300,"Phone", DISPATCH_METHOD,null,vContact,ePhoneNumber.value,bstrNumber);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1301)  public void MediaWizard(final Integer hwndParent) throws ComException {
    assert(hwndParent != null);
    this._dispatchCall(1301,"MediaWizard", DISPATCH_METHOD,null,hwndParent);
  }
  @DeclDISPID(1302)  public IDispatch Page(final Object vContact) throws ComException {
    assert(vContact != null);
    final Object obj = this._dispatchCall(1302,"Page", DISPATCH_METHOD,null,vContact);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1299)  public void AutoSignin() throws ComException {
    this._dispatchCall(1299,"AutoSignin", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1303)  public IDispatch getMyContacts() throws ComException {
    final Object obj = this._dispatchCall(1303,"MyContacts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1304)  public String getMySigninName() throws ComException {
    final Object obj = this._dispatchCall(1304,"MySigninName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1282)  public String getMyFriendlyName() throws ComException {
    final Object obj = this._dispatchCall(1282,"MyFriendlyName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1305)  public void setMyStatus(final MISTATUS value) throws ComException {
    assert(value != null);
    this._dispatchCall(1305,"MyStatus", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1305)  public MISTATUS getMyStatus() throws ComException {
    final Object obj = this._dispatchCall(1305,"MyStatus", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return MISTATUS.valueOf((Integer)obj);
  }
  @DeclDISPID(1284)  public Integer getUnreadEmailCount(final MUAFOLDER mFolder) throws ComException {
    assert(mFolder != null);
    final Object obj = this._dispatchCall(1284,"UnreadEmailCount", DISPATCH_PROPERTYGET,null,mFolder.value);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1294)  public String getMyServiceName() throws ComException {
    final Object obj = this._dispatchCall(1294,"MyServiceName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1296)  public String getMyPhoneNumber(final MPHONE_TYPE PhoneType) throws ComException {
    assert(PhoneType != null);
    final Object obj = this._dispatchCall(1296,"MyPhoneNumber", DISPATCH_PROPERTYGET,null,PhoneType.value);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1306)  public Object getMyProperty(final MCONTACTPROPERTY ePropType) throws ComException {
    assert(ePropType != null);
    final Object obj = this._dispatchCall(1306,"MyProperty", DISPATCH_PROPERTYGET,null,ePropType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1306)  public void setMyProperty(final MCONTACTPROPERTY ePropType, final Object value2) throws ComException {
    assert(value2 != null);
    assert(ePropType != null);
    this._dispatchCall(1306,"MyProperty", DISPATCH_PROPERTYPUT,value2,ePropType.value);
  }
  @DeclDISPID(1307)  public String getMyServiceId() throws ComException {
    final Object obj = this._dispatchCall(1307,"MyServiceId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1308)  public IDispatch getServices() throws ComException {
    final Object obj = this._dispatchCall(1308,"Services", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1313)  public MUASORT getContactsSortOrder() throws ComException {
    final Object obj = this._dispatchCall(1313,"ContactsSortOrder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return MUASORT.valueOf((Integer)obj);
  }
  @DeclDISPID(1313)  public void setContactsSortOrder(final MUASORT value) throws ComException {
    assert(value != null);
    this._dispatchCall(1313,"ContactsSortOrder", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1310)  public IDispatch StartVideo(final Object vContact) throws ComException {
    assert(vContact != null);
    final Object obj = this._dispatchCall(1310,"StartVideo", DISPATCH_METHOD,null,vContact);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1311)  public IDispatch getMyGroups() throws ComException {
    final Object obj = this._dispatchCall(1311,"MyGroups", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1312)  public IDispatch CreateGroup(final String bstrName, final Object vService) throws ComException {
    assert(bstrName != null);
    assert(vService != null);
    final Object obj = this._dispatchCall(1312,"CreateGroup", DISPATCH_METHOD,null,bstrName,vService);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1314)  public Object getProperty(final MMESSENGERPROPERTY ePropType) throws ComException {
    assert(ePropType != null);
    final Object obj = this._dispatchCall(1314,"Property", DISPATCH_PROPERTYGET,null,ePropType.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1314)  public void setProperty(final MMESSENGERPROPERTY ePropType, final Object value2) throws ComException {
    assert(value2 != null);
    assert(ePropType != null);
    this._dispatchCall(1314,"Property", DISPATCH_PROPERTYPUT,value2,ePropType.value);
  }
  @DeclDISPID(1317)  public void ShowContactCard(final Object vContactId, final Integer hwndParentWindow, final Integer top, final Integer left, final Integer bottom, final Integer right, final Integer options) throws ComException {
    assert(vContactId != null);
    assert(hwndParentWindow != null);
    assert(top != null);
    assert(left != null);
    assert(bottom != null);
    assert(right != null);
    assert(options != null);
    this._dispatchCall(1317,"ShowContactCard", DISPATCH_METHOD,null,vContactId,hwndParentWindow,top,left,bottom,right,options);
  }
  @DeclDISPID(1318)  public void HideContactCard(final Integer hwndParentWindow) throws ComException {
    assert(hwndParentWindow != null);
    this._dispatchCall(1318,"HideContactCard", DISPATCH_METHOD,null,hwndParentWindow);
  }
  @DeclDISPID(1319)  public void FetchUserTile(final Object vContactId, final Integer applicationId, final Integer options) throws ComException {
    assert(vContactId != null);
    assert(applicationId != null);
    assert(options != null);
    this._dispatchCall(1319,"FetchUserTile", DISPATCH_METHOD,null,vContactId,applicationId,options);
  }
  public Messenger() throws ComException {
    super("{B69003B3-C55E-4B48-836C-BC5946FC3B28}", "{D50C3486-0F89-48F8-B204-3604629DEE10}");
  }
  protected Messenger(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Messenger" + super.toString() + "]";
  }
}
