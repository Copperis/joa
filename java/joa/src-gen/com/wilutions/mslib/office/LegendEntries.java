/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * LegendEntries.
 * 
 */
@CoInterface(guid="{000C1719-0000-0000-C000-000000000046}")
public interface LegendEntries extends IDispatch {
  @DeclDISPID(150)  public IDispatch getParent() throws ComException;
  @DeclDISPID(118)  public Integer getCount() throws ComException;
  @DeclDISPID(170)  public LegendEntry Item(Object Index) throws ComException;
  @DeclDISPID(-4)  public Object _NewEnum() throws ComException;
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(149)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public LegendEntry get_Default(Object Index) throws ComException;
}
