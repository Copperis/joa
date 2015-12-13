/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IInstantMessageModality.
 * IInstantMessageModality Interface 
 */
@CoInterface(guid="{62A75516-C79B-42D7-8B49-3BA492C2B385}")
public interface IInstantMessageModality extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ModalityTypes getType() throws ComException;
  @DeclDISPID(1610743809)  public ModalityState getState() throws ComException;
  @DeclDISPID(1610743810)  public IConversation getConversation() throws ComException;
  @DeclDISPID(1610743811)  public IParticipant getParticipant() throws ComException;
  @DeclDISPID(1610743812)  public IContactEndpoint getEndpoint() throws ComException;
  @DeclDISPID(1610743812)  public void setEndpoint(final IContactEndpoint value) throws ComException;
  @DeclDISPID(1610743814)  public IModalityPropertyDictionary getProperties() throws ComException;
  @DeclDISPID(1610743815)  public IAsynchronousOperation SetProperty(final ModalityProperty _propertyType, final Object _propertyValue, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743816)  public IAsynchronousOperation Connect(final ModalityConnectOptions _options, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743817)  public IAsynchronousOperation Disconnect(final ModalityDisconnectReason _reason, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743818)  public void Reject(final ModalityDisconnectReason _reason) throws ComException;
  @DeclDISPID(1610743819)  public void Accept() throws ComException;
  @DeclDISPID(1610743820)  public IAsynchronousOperation Hold(final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743821)  public IAsynchronousOperation Retrieve(final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743822)  public IAsynchronousOperation Forward(final IDispatch _contactOrCollaborationEndpoint, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743823)  public IAsynchronousOperation Transfer(final IDispatch _contactOrCollaborationEndpoint, final TransferOptions _options, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743824)  public IAsynchronousOperation ConsultativeTransfer(final IConversation _conversation, final TransferOptions _options, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743825)  public Boolean CanInvoke(final ModalityAction _action) throws ComException;
  @DeclDISPID(1610743826)  public Boolean CanSetProperty(final ModalityProperty _modalityProperty) throws ComException;
  @DeclDISPID(1610809344)  public IAsynchronousOperation SendMessage(final String _message, final INamedPropertyList _additionalFormats, final ModalityConnectOptions _options, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809345)  public IAsynchronousOperation SetComposing(final Boolean _isComposing, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809346)  public void SetCapabilities(final InstantMessageCapabilities _capabilities) throws ComException;
  @DeclDISPID(1610809347)  public Boolean getIsTyping() throws ComException;
  @DeclDISPID(1610809348)  public Integer getCapabilities() throws ComException;
}
