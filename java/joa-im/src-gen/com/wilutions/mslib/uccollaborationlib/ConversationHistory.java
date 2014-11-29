/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationHistory.
 * ConversationHistory class defines a conversation history.This class handles events 
 * defined in the interface IConversationHistoryEvents. 
 */
@CoClass(guid="{00B1F05C-924F-4A74-AED2-8EDE3D08DE8B}")
public class ConversationHistory extends Dispatch implements IConversationHistory {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IConversation getConversation() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Conversation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743809)  public Boolean getIsPastHistoryRetrieved() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"IsPastHistoryRetrieved", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743810)  public String[] getCurrentHistory() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"CurrentHistory", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String[])obj;
  }
  @DeclDISPID(1610743811)  public Object[] getAllHistory() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"AllHistory", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743812)  public Object[] getPastHistory() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"PastHistory", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743813)  public IAsynchronousOperation RetrievePastHistory(final Object _conversationHistoryCallback, final Object _state) throws ComException {
    assert(_conversationHistoryCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743813,"RetrievePastHistory", DISPATCH_METHOD,null,_conversationHistoryCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743814)  public IAsynchronousOperation RetrievePastHistoryByEntryId(final String _entryId, final Object _conversationHistoryCallback, final Object _state) throws ComException {
    assert(_entryId != null);
    assert(_conversationHistoryCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743814,"RetrievePastHistoryByEntryId", DISPATCH_METHOD,null,_entryId,_conversationHistoryCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743815)  public IAsynchronousOperation SaveAllHistory(final Object _conversationHistoryCallback, final Object _state) throws ComException {
    assert(_conversationHistoryCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743815,"SaveAllHistory", DISPATCH_METHOD,null,_conversationHistoryCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743816)  public Boolean CanInvoke(final ConversationHistoryAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610743816,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public ConversationHistory() throws ComException {
    super("{00B1F05C-924F-4A74-AED2-8EDE3D08DE8B}", "{F5996C71-77AB-4020-9776-C2C270FEF2AE}");
  }
  protected ConversationHistory(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConversationHistory" + super.toString() + "]";
  }
}
