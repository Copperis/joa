/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _OlkTimeControl.
 * 
 */
@CoInterface(guid="{000672EF-0000-0000-C000-000000000046}")
public interface _OlkTimeControl extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-500)  public Boolean getAutoSize() throws ComException;
  @DeclDISPID(-500)  public void setAutoSize(final Boolean value) throws ComException;
  @DeclDISPID(218)  public Boolean getAutoWordSelect() throws ComException;
  @DeclDISPID(218)  public void setAutoWordSelect(final Boolean value) throws ComException;
  @DeclDISPID(-501)  public com.wilutions.mslib.stdole.OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(final com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException;
  @DeclDISPID(-502)  public OlBackStyle getBackStyle() throws ComException;
  @DeclDISPID(-502)  public void setBackStyle(final OlBackStyle value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(224)  public OlEnterFieldBehavior getEnterFieldBehavior() throws ComException;
  @DeclDISPID(224)  public void setEnterFieldBehavior(final OlEnterFieldBehavior value) throws ComException;
  @DeclDISPID(-512)  public com.wilutions.mslib.stdole.Font getFont() throws ComException;
  @DeclDISPID(-513)  public com.wilutions.mslib.stdole.OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(final com.wilutions.mslib.stdole.OLE_COLOR value) throws ComException;
  @DeclDISPID(207)  public Boolean getHideSelection() throws ComException;
  @DeclDISPID(207)  public void setHideSelection(final Boolean value) throws ComException;
  @DeclDISPID(10)  public Boolean getLocked() throws ComException;
  @DeclDISPID(10)  public void setLocked(final Boolean value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-521)  public OlMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(final OlMousePointer value) throws ComException;
  @DeclDISPID(64468)  public java.util.Date getReferenceTime() throws ComException;
  @DeclDISPID(64468)  public void setReferenceTime(final java.util.Date value) throws ComException;
  @DeclDISPID(64469)  public OlTimeStyle getStyle() throws ComException;
  @DeclDISPID(64469)  public void setStyle(final OlTimeStyle value) throws ComException;
  @DeclDISPID(64466)  public java.util.Date getTime() throws ComException;
  @DeclDISPID(64466)  public void setTime(final java.util.Date value) throws ComException;
  @DeclDISPID(-517)  public String getText() throws ComException;
  @DeclDISPID(-517)  public void setText(final String value) throws ComException;
  @DeclDISPID(10004)  public OlTextAlign getTextAlign() throws ComException;
  @DeclDISPID(10004)  public void setTextAlign(final OlTextAlign value) throws ComException;
  @DeclDISPID(0)  public Object getValue() throws ComException;
  @DeclDISPID(0)  public void setValue(final Object value) throws ComException;
  @DeclDISPID(64475)  public java.util.Date getIntervalTime() throws ComException;
  @DeclDISPID(64475)  public void setIntervalTime(final java.util.Date value) throws ComException;
  @DeclDISPID(1001)  public void DropDown() throws ComException;
}
