/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * PickerFields.
 * 
 */
@CoInterface(guid="{000C03E1-0000-0000-C000-000000000046}")
public interface PickerFields extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public PickerField getItem(final Integer Index) throws ComException;
  @DeclDISPID(1)  public Integer getCount() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
