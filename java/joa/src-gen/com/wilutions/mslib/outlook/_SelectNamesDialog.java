/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _SelectNamesDialog.
 * 
 */
@CoInterface(guid="{000630C8-0000-0000-C000-000000000046}")
public interface _SelectNamesDialog extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(64226)  public String getCaption() throws ComException;
  @DeclDISPID(64226)  public void setCaption(final String value) throws ComException;
  @DeclDISPID(61473)  public Boolean Display() throws ComException;
  @DeclDISPID(63508)  public Recipients getRecipients() throws ComException;
  @DeclDISPID(63508)  public void setRecipients(final Recipients value) throws ComException;
  @DeclDISPID(64227)  public String getBccLabel() throws ComException;
  @DeclDISPID(64227)  public void setBccLabel(final String value) throws ComException;
  @DeclDISPID(64228)  public String getCcLabel() throws ComException;
  @DeclDISPID(64228)  public void setCcLabel(final String value) throws ComException;
  @DeclDISPID(64229)  public String getToLabel() throws ComException;
  @DeclDISPID(64229)  public void setToLabel(final String value) throws ComException;
  @DeclDISPID(64230)  public Boolean getAllowMultipleSelection() throws ComException;
  @DeclDISPID(64230)  public void setAllowMultipleSelection(final Boolean value) throws ComException;
  @DeclDISPID(64231)  public Boolean getForceResolution() throws ComException;
  @DeclDISPID(64231)  public void setForceResolution(final Boolean value) throws ComException;
  @DeclDISPID(64232)  public Boolean getShowOnlyInitialAddressList() throws ComException;
  @DeclDISPID(64232)  public void setShowOnlyInitialAddressList(final Boolean value) throws ComException;
  @DeclDISPID(64233)  public OlRecipientSelectors getNumberOfRecipientSelectors() throws ComException;
  @DeclDISPID(64233)  public void setNumberOfRecipientSelectors(final OlRecipientSelectors value) throws ComException;
  @DeclDISPID(64234)  public AddressList getInitialAddressList() throws ComException;
  @DeclDISPID(64234)  public void setInitialAddressList(final AddressList value) throws ComException;
  @DeclDISPID(64235)  public void SetDefaultDisplayMode(final OlDefaultSelectNamesDisplayMode defaultMode) throws ComException;
}
