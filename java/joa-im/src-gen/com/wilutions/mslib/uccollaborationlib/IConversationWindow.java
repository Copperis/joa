/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationWindow.
 * IConversationWindow Interface 
 */
@CoInterface(guid="{B1F5BCD8-69A6-4FC3-9EF0-9BD4AD999061}")
public interface IConversationWindow extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IConversation getConversation() throws ComException;
  @DeclDISPID(1610743809)  public Integer getLeft() throws ComException;
  @DeclDISPID(1610743810)  public Integer getTop() throws ComException;
  @DeclDISPID(1610743811)  public Integer getWidth() throws ComException;
  @DeclDISPID(1610743812)  public Integer getHeight() throws ComException;
  @DeclDISPID(1610743813)  public void Move(final Integer _left, final Integer _top) throws ComException;
  @DeclDISPID(1610743814)  public void Resize(final Integer _width, final Integer _height) throws ComException;
  @DeclDISPID(1610743815)  public void MoveAndResize(final Integer _left, final Integer _top, final Integer _width, final Integer _height) throws ComException;
  @DeclDISPID(1610743816)  public void Close() throws ComException;
  @DeclDISPID(1610743817)  public void Dock(final Integer _parentHWND) throws ComException;
  @DeclDISPID(1610743818)  public void Undock() throws ComException;
  @DeclDISPID(1610743819)  public Boolean getIsDocked() throws ComException;
  @DeclDISPID(1610743820)  public Boolean getIsFullScreen() throws ComException;
  @DeclDISPID(1610743821)  public Integer getHandle() throws ComException;
  @DeclDISPID(1610743822)  public Integer getParentWindow() throws ComException;
  @DeclDISPID(1610743823)  public IAsynchronousOperation OpenExtensibilityWindow(final String _applicationId, final Object _callback, final Object _state) throws ComException;
  @DeclDISPID(1610743824)  public void CloseExtensibilityWindow(final String _applicationId) throws ComException;
  @DeclDISPID(1610743825)  public void FlashExtensibilityWindow(final String _applicationId, final Boolean _flash) throws ComException;
}
