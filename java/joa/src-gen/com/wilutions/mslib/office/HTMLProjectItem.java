/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * HTMLProjectItem.
 * 
 */
@CoInterface(guid="{000C0358-0000-0000-C000-000000000046}")
public interface HTMLProjectItem extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getName() throws ComException;
  @DeclDISPID(4)  public Boolean getIsOpen() throws ComException;
  @DeclDISPID(5)  public void LoadFromFile(final String FileName) throws ComException;
  @DeclDISPID(6)  public void Open(final MsoHTMLProjectOpen OpenKind) throws ComException;
  @DeclDISPID(7)  public void SaveCopyAs(final String FileName) throws ComException;
  @DeclDISPID(8)  public String getText() throws ComException;
  @DeclDISPID(8)  public void setText(final String value) throws ComException;
  @DeclDISPID(10)  public IDispatch getParent() throws ComException;
}
