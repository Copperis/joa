/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * BalloonLabel.
 * 
 */
@CoInterface(guid="{000C0330-0000-0000-C000-000000000046}")
public interface BalloonLabel extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public String getItem() throws ComException;
  @DeclDISPID(1610809345)  public String getName() throws ComException;
  @DeclDISPID(1610809346)  public IDispatch getParent() throws ComException;
  @DeclDISPID(1610809347)  public void setText(final String value) throws ComException;
  @DeclDISPID(1610809347)  public String getText() throws ComException;
}
