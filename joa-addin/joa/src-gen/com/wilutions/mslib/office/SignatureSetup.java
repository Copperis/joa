/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SignatureSetup.
 * 
 */
@CoInterface(guid="{000CD6A1-0000-0000-C000-000000000046}")
public interface SignatureSetup extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Boolean getReadOnly() throws ComException;
  @DeclDISPID(2)  public String getId() throws ComException;
  @DeclDISPID(3)  public String getSignatureProvider() throws ComException;
  @DeclDISPID(4)  public String getSuggestedSigner() throws ComException;
  @DeclDISPID(4)  public void setSuggestedSigner(final String value) throws ComException;
  @DeclDISPID(5)  public String getSuggestedSignerLine2() throws ComException;
  @DeclDISPID(5)  public void setSuggestedSignerLine2(final String value) throws ComException;
  @DeclDISPID(6)  public String getSuggestedSignerEmail() throws ComException;
  @DeclDISPID(6)  public void setSuggestedSignerEmail(final String value) throws ComException;
  @DeclDISPID(7)  public String getSigningInstructions() throws ComException;
  @DeclDISPID(7)  public void setSigningInstructions(final String value) throws ComException;
  @DeclDISPID(8)  public Boolean getAllowComments() throws ComException;
  @DeclDISPID(8)  public void setAllowComments(final Boolean value) throws ComException;
  @DeclDISPID(9)  public Boolean getShowSignDate() throws ComException;
  @DeclDISPID(9)  public void setShowSignDate(final Boolean value) throws ComException;
  @DeclDISPID(10)  public String getAdditionalXml() throws ComException;
  @DeclDISPID(10)  public void setAdditionalXml(final String value) throws ComException;
}
