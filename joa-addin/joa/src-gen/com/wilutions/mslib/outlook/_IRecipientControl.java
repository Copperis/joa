/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _IRecipientControl.
 * 
 */
@CoInterface(guid="{D87E7E16-6897-11CE-A6C0-00AA00608FAA}")
public interface _IRecipientControl extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-514)  public Byte getEnabled() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(final Byte Enabled) throws ComException;
  @DeclDISPID(-501)  public Integer getBackColor() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(final Integer BackColor) throws ComException;
  @DeclDISPID(-513)  public Integer getForeColor() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(final Integer ForeColor) throws ComException;
  @DeclDISPID(-2147356664)  public Byte getReadOnly() throws ComException;
  @DeclDISPID(-2147356664)  public void setReadOnly(final Byte ReadOnly) throws ComException;
  @DeclDISPID(-512)  public IDispatch getFont() throws ComException;
  @DeclDISPID(-512)  public void setFont(final IDispatch Font) throws ComException;
  @DeclDISPID(12)  public Integer getSpecialEffect() throws ComException;
  @DeclDISPID(12)  public void setSpecialEffect(final Integer Effect) throws ComException;
}
