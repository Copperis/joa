/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Pages.
 * 
 */
@CoInterface(guid="{0006303F-0000-0000-C000-000000000046}")
public interface Pages extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public Dispatch Item(Object Index) throws ComException;
  @DeclDISPID(300)  public Dispatch Add(Object Name) throws ComException;
  @DeclDISPID(301)  public void Remove(Integer Index) throws ComException;
}
