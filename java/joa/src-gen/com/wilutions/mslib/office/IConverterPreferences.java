/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IConverterPreferences.
 * 
 */
@CoInterface(guid="{000C03D4-0000-0000-C000-000000000046}")
public interface IConverterPreferences extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void HrGetMacroEnabled(final ByRef<Integer> pfMacroEnabled) throws ComException;
  @DeclDISPID(2)  public void HrCheckFormat(final ByRef<Integer> pFormat) throws ComException;
  @DeclDISPID(3)  public void HrGetLossySave(final ByRef<Integer> pfLossySave) throws ComException;
}
