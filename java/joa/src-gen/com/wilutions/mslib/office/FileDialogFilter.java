/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * FileDialogFilter.
 * 
 */
@CoInterface(guid="{000C0364-0000-0000-C000-000000000046}")
public interface FileDialogFilter extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public Dispatch getParent() throws ComException;
  @DeclDISPID(1610809345)  public String getExtensions() throws ComException;
  @DeclDISPID(1610809346)  public String getDescription() throws ComException;
}
