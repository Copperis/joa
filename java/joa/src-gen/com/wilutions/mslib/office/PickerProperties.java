/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * PickerProperties.
 * 
 */
@CoInterface(guid="{000C03E3-0000-0000-C000-000000000046}")
public interface PickerProperties extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public PickerProperty getItem(final Integer Index) throws ComException;
  @DeclDISPID(1)  public Integer getCount() throws ComException;
  @DeclDISPID(2)  public PickerProperty Add(final String Id, final String Value, final MsoPickerField Type) throws ComException;
  @DeclDISPID(3)  public void Remove(final String Id) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
