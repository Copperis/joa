/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Axes.
 * 
 */
@CoInterface(guid="{000C1712-0000-0000-C000-000000000046}")
public interface Axes extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(1610743809)  public IMsoAxis getItem(final XlAxisType Type, final XlAxisGroup AxisGroup) throws ComException;
  @DeclDISPID(1610743810)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public IMsoAxis get_Default(final XlAxisType Type, final XlAxisGroup AxisGroup) throws ComException;
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
}
