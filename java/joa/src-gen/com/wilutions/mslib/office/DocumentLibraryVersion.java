/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * DocumentLibraryVersion.
 * 
 */
@CoInterface(guid="{000C0387-0000-0000-C000-000000000046}")
public interface DocumentLibraryVersion extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public Object getModified() throws ComException;
  @DeclDISPID(1)  public Integer getIndex() throws ComException;
  @DeclDISPID(2)  public Dispatch getParent() throws ComException;
  @DeclDISPID(3)  public String getModifiedBy() throws ComException;
  @DeclDISPID(4)  public String getComments() throws ComException;
  @DeclDISPID(5)  public void Delete() throws ComException;
  @DeclDISPID(6)  public Dispatch Open() throws ComException;
  @DeclDISPID(7)  public Dispatch Restore() throws ComException;
}
