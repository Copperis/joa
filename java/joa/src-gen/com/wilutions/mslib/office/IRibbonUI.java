/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * IRibbonUI.
 * 
 */
@CoInterface(guid="{000C03A7-0000-0000-C000-000000000046}")
public interface IRibbonUI extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void Invalidate() throws ComException;
  @DeclDISPID(2)  public void InvalidateControl(String ControlID) throws ComException;
  @DeclDISPID(3)  public void InvalidateControlMso(String ControlID) throws ComException;
  @DeclDISPID(4)  public void ActivateTab(String ControlID) throws ComException;
  @DeclDISPID(5)  public void ActivateTabMso(String ControlID) throws ComException;
  @DeclDISPID(6)  public void ActivateTabQ(String ControlID, String Namespace) throws ComException;
}
