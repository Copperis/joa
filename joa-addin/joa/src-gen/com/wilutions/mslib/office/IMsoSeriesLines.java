/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IMsoSeriesLines.
 * 
 */
@CoInterface(guid="{000C1729-0000-0000-C000-000000000046}")
public interface IMsoSeriesLines extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(110)  public String getName() throws ComException;
  @DeclDISPID(235)  public Object Select() throws ComException;
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(128)  public IMsoBorder getBorder() throws ComException;
  @DeclDISPID(117)  public Object Delete() throws ComException;
  @DeclDISPID(1610743813)  public IMsoChartFormat getFormat() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
}
