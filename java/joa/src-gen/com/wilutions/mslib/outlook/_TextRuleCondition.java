/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _TextRuleCondition.
 * 
 */
@CoInterface(guid="{000630E0-0000-0000-C000-000000000046}")
public interface _TextRuleCondition extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(103)  public void setEnabled(Boolean value) throws ComException;
  @DeclDISPID(64298)  public OlRuleConditionType getConditionType() throws ComException;
  @DeclDISPID(64295)  public Object getText() throws ComException;
  @DeclDISPID(64295)  public void setText(Object value) throws ComException;
}
