/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IPreviousConversationsManagerCallback.
 * _IPreviousConversationsManagerCallback Interface 
 */
@CoInterface(guid="{4BACB4B8-1236-42B8-BDA1-D1533148780D}")
public interface _IPreviousConversationsManagerCallback extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(4120)  public void OnGetUnreadItems(final IPreviousConversationsManager _source, final IPreviousConversationCollection _items, final IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(4121)  public void OnGetAllItems(final IPreviousConversationsManager _source, final IPreviousConversationCollection _items, final IAsynchronousOperation _asyncOperation) throws ComException;
}
