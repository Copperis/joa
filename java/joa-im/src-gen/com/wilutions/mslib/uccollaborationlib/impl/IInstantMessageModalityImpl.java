/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{A230CC7D-63F8-9996-16E7-524337354F7F}")
public class IInstantMessageModalityImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IInstantMessageModality {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ModalityTypes getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ModalityTypes.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ModalityState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ModalityState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IConversation getConversation() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Conversation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IParticipant getParticipant() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Participant", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantImpl.class);
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IContactEndpoint getEndpoint() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Endpoint", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactEndpointImpl.class);
  }
  @DeclDISPID(1610743812)  public void setEndpoint(com.wilutions.mslib.uccollaborationlib.IContactEndpoint value) throws ComException {
    this._dispatchCall(1610743812,"Endpoint", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.uccollaborationlib.IModalityPropertyDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IModalityPropertyDictionaryImpl.class);
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation SetProperty(com.wilutions.mslib.uccollaborationlib.ModalityProperty _propertyType, Object _propertyValue, Object _modalityCallback, Object _state) throws ComException {
    assert(_propertyType != null);
    assert(_propertyValue != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743815,"SetProperty", DISPATCH_METHOD,null,_propertyType.value,_propertyValue,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Connect(com.wilutions.mslib.uccollaborationlib.ModalityConnectOptions _options, Object _modalityCallback, Object _state) throws ComException {
    assert(_options != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743816,"Connect", DISPATCH_METHOD,null,_options.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743817)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Disconnect(com.wilutions.mslib.uccollaborationlib.ModalityDisconnectReason _reason, Object _modalityCallback, Object _state) throws ComException {
    assert(_reason != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743817,"Disconnect", DISPATCH_METHOD,null,_reason.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743818)  public void Reject(com.wilutions.mslib.uccollaborationlib.ModalityDisconnectReason _reason) throws ComException {
    assert(_reason != null);
    this._dispatchCall(1610743818,"Reject", DISPATCH_METHOD,null,_reason.value);
  }
  @DeclDISPID(1610743819)  public void Accept() throws ComException {
    this._dispatchCall(1610743819,"Accept", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743820)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Hold(Object _modalityCallback, Object _state) throws ComException {
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743820,"Hold", DISPATCH_METHOD,null,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743821)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Retrieve(Object _modalityCallback, Object _state) throws ComException {
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743821,"Retrieve", DISPATCH_METHOD,null,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743822)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Forward(Dispatch _contactOrCollaborationEndpoint, Object _modalityCallback, Object _state) throws ComException {
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743822,"Forward", DISPATCH_METHOD,null,(_contactOrCollaborationEndpoint!=null?_contactOrCollaborationEndpoint:Dispatch.NULL),_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743823)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Transfer(Dispatch _contactOrCollaborationEndpoint, com.wilutions.mslib.uccollaborationlib.TransferOptions _options, Object _modalityCallback, Object _state) throws ComException {
    assert(_options != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743823,"Transfer", DISPATCH_METHOD,null,(_contactOrCollaborationEndpoint!=null?_contactOrCollaborationEndpoint:Dispatch.NULL),_options.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743824)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation ConsultativeTransfer(com.wilutions.mslib.uccollaborationlib.IConversation _conversation, com.wilutions.mslib.uccollaborationlib.TransferOptions _options, Object _modalityCallback, Object _state) throws ComException {
    assert(_options != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743824,"ConsultativeTransfer", DISPATCH_METHOD,null,(_conversation!=null?_conversation:Dispatch.NULL),_options.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743825)  public Boolean CanInvoke(com.wilutions.mslib.uccollaborationlib.ModalityAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610743825,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743826)  public Boolean CanSetProperty(com.wilutions.mslib.uccollaborationlib.ModalityProperty _modalityProperty) throws ComException {
    assert(_modalityProperty != null);
    final Object obj = this._dispatchCall(1610743826,"CanSetProperty", DISPATCH_METHOD,null,_modalityProperty.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809344)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation SendMessage(String _message, com.wilutions.mslib.uccollaborationlib.INamedPropertyList _additionalFormats, com.wilutions.mslib.uccollaborationlib.ModalityConnectOptions _options, Object _modalityCallback, Object _state) throws ComException {
    assert(_message != null);
    assert(_options != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809344,"SendMessage", DISPATCH_METHOD,null,_message,(_additionalFormats!=null?_additionalFormats:Dispatch.NULL),_options.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610809345)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation SetComposing(Boolean _isComposing, Object _modalityCallback, Object _state) throws ComException {
    assert(_isComposing != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809345,"SetComposing", DISPATCH_METHOD,null,_isComposing,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610809346)  public void SetCapabilities(com.wilutions.mslib.uccollaborationlib.InstantMessageCapabilities _capabilities) throws ComException {
    assert(_capabilities != null);
    this._dispatchCall(1610809346,"SetCapabilities", DISPATCH_METHOD,null,_capabilities.value);
  }
  @DeclDISPID(1610809347)  public Boolean getIsTyping() throws ComException {
    final Object obj = this._dispatchCall(1610809347,"IsTyping", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809348)  public Integer getCapabilities() throws ComException {
    final Object obj = this._dispatchCall(1610809348,"Capabilities", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IInstantMessageModalityImpl(String progId) throws ComException {
    super(progId, "{62A75516-C79B-42D7-8B49-3BA492C2B385}");
  }
  protected IInstantMessageModalityImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IInstantMessageModalityImpl" + super.toString() + "]";
  }
}
