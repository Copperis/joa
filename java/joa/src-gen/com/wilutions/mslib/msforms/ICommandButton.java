/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * ICommandButton.
 * 
 */
@CoInterface(guid="{04598FC4-866C-11CF-AB7C-00AA00C08FCF}")
public interface ICommandButton extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-500)  public void setAutoSize(final Boolean value) throws ComException;
  @DeclDISPID(-500)  public Boolean getAutoSize() throws ComException;
  @DeclDISPID(-501)  public void setBackColor(final OLE_COLOR value) throws ComException;
  @DeclDISPID(-501)  public OLE_COLOR getBackColor() throws ComException;
  @DeclDISPID(-502)  public void setBackStyle(final fmBackStyle value) throws ComException;
  @DeclDISPID(-502)  public fmBackStyle getBackStyle() throws ComException;
  @DeclDISPID(-518)  public void setCaption(final String value) throws ComException;
  @DeclDISPID(-518)  public String getCaption() throws ComException;
  @DeclDISPID(-514)  public void setEnabled(final Boolean value) throws ComException;
  @DeclDISPID(-514)  public Boolean getEnabled() throws ComException;
  @DeclDISPID(-512)  public void setFont(final Font value) throws ComException;
  @DeclDISPID(-512)  public Font getFont() throws ComException;
  @DeclDISPID(-513)  public void setForeColor(final OLE_COLOR value) throws ComException;
  @DeclDISPID(-513)  public OLE_COLOR getForeColor() throws ComException;
  @DeclDISPID(203)  public void setTakeFocusOnClick(final Boolean value) throws ComException;
  @DeclDISPID(203)  public Boolean getTakeFocusOnClick() throws ComException;
  @DeclDISPID(10)  public void setLocked(final Boolean value) throws ComException;
  @DeclDISPID(10)  public Boolean getLocked() throws ComException;
  @DeclDISPID(-522)  public void setMouseIcon(final com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-522)  public com.wilutions.mslib.stdole.Picture getMouseIcon() throws ComException;
  @DeclDISPID(-521)  public void setMousePointer(final fmMousePointer value) throws ComException;
  @DeclDISPID(-521)  public fmMousePointer getMousePointer() throws ComException;
  @DeclDISPID(-523)  public void setPicture(final com.wilutions.mslib.stdole.Picture value) throws ComException;
  @DeclDISPID(-523)  public com.wilutions.mslib.stdole.Picture getPicture() throws ComException;
  @DeclDISPID(11)  public void setPicturePosition(final fmPicturePosition value) throws ComException;
  @DeclDISPID(11)  public fmPicturePosition getPicturePosition() throws ComException;
  @DeclDISPID(-543)  public void setAccelerator(final String value) throws ComException;
  @DeclDISPID(-543)  public String getAccelerator() throws ComException;
  @DeclDISPID(-536)  public void setWordWrap(final Boolean value) throws ComException;
  @DeclDISPID(-536)  public Boolean getWordWrap() throws ComException;
}
