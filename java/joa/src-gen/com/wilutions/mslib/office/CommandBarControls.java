/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CommandBarControls.
 * 
 */
@CoInterface(guid="{000C0306-0000-0000-C000-000000000046}")
public interface CommandBarControls extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1610809344)  public CommandBarControl Add(final Object Type, final Object Id, final Object Parameter, final Object Before, final Object Temporary) throws ComException;
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public CommandBarControl getItem(final Object Index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610809348)  public CommandBar getParent() throws ComException;
}
