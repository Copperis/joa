/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * TabStops2.
 * 
 */
@CoInterface(guid="{000C03BA-0000-0000-C000-000000000046}")
public interface TabStops2 extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public TabStop2 Item(Object Index) throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public TabStop2 Add(MsoTabStopType Type, Float Position) throws ComException;
  @DeclDISPID(3)  public Integer getCount() throws ComException;
  @DeclDISPID(4)  public Float getDefaultSpacing() throws ComException;
  @DeclDISPID(4)  public void setDefaultSpacing(Float value) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
