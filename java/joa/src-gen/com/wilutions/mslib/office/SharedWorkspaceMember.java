/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SharedWorkspaceMember.
 * 
 */
@CoInterface(guid="{000C0381-0000-0000-C000-000000000046}")
public interface SharedWorkspaceMember extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getDomainName() throws ComException;
  @DeclDISPID(1)  public String getName() throws ComException;
  @DeclDISPID(2)  public String getEmail() throws ComException;
  @DeclDISPID(3)  public void Delete() throws ComException;
  @DeclDISPID(5)  public IDispatch getParent() throws ComException;
}
