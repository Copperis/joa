/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * GradientStops.
 * 
 */
@CoInterface(guid="{000C03C0-0000-0000-C000-000000000046}")
public interface GradientStops extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public GradientStop getItem(final Integer Index) throws ComException;
  @DeclDISPID(2)  public Integer getCount() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(10)  public void Delete(final Integer Index) throws ComException;
  @DeclDISPID(11)  public void Insert(final MsoRGBType RGB, final Float Position, final Float Transparency, final Integer Index) throws ComException;
  @DeclDISPID(12)  public void Insert2(final MsoRGBType RGB, final Float Position, final Float Transparency, final Integer Index, final Float Brightness) throws ComException;
}
