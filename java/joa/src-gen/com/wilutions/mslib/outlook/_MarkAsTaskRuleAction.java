/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _MarkAsTaskRuleAction.
 * 
 */
@CoInterface(guid="{000630D6-0000-0000-C000-000000000046}")
public interface _MarkAsTaskRuleAction extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(103)  public void setEnabled(Boolean value) throws ComException;
  @DeclDISPID(64271)  public OlRuleActionType getActionType() throws ComException;
  @DeclDISPID(64292)  public String getFlagTo() throws ComException;
  @DeclDISPID(64292)  public void setFlagTo(String value) throws ComException;
  @DeclDISPID(64293)  public OlMarkInterval getMarkInterval() throws ComException;
  @DeclDISPID(64293)  public void setMarkInterval(OlMarkInterval value) throws ComException;
}
