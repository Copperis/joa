/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{FFF7569C-1A5C-9F45-1E3B-A9CAA92ACD74}")
public class _IModalityCallbackImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IModalityCallback {
  @DeclDISPID(1230)  public void OnConnect(final com.wilutions.mslib.uccollaborationlib.IModality _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1230,"OnConnect", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1231)  public void OnDisconnect(final com.wilutions.mslib.uccollaborationlib.IModality _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1231,"OnDisconnect", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1232)  public void OnHold(final com.wilutions.mslib.uccollaborationlib.IModality _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1232,"OnHold", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1233)  public void OnRetrieve(final com.wilutions.mslib.uccollaborationlib.IModality _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1233,"OnRetrieve", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1234)  public void OnForward(final com.wilutions.mslib.uccollaborationlib.IModality _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1234,"OnForward", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1235)  public void OnSetComposing(final com.wilutions.mslib.uccollaborationlib.IModality _source, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    this._dispatchCall(1235,"OnSetComposing", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1236)  public void OnTransfer(final com.wilutions.mslib.uccollaborationlib.IModality _source, final com.wilutions.mslib.uccollaborationlib.ModalityState _targetState, final String[] contextProperties, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    assert(_targetState != null);
    assert(contextProperties != null);
    this._dispatchCall(1236,"OnTransfer", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),_targetState.value,contextProperties,(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1237)  public void OnConsultativeTransfer(final com.wilutions.mslib.uccollaborationlib.IModality _source, final com.wilutions.mslib.uccollaborationlib.ModalityState _targetState, final String[] _contextProperties, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    assert(_targetState != null);
    assert(_contextProperties != null);
    this._dispatchCall(1237,"OnConsultativeTransfer", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),_targetState.value,_contextProperties,(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1238)  public void OnSetProperty(final com.wilutions.mslib.uccollaborationlib.IModality _source, final com.wilutions.mslib.uccollaborationlib.ModalityProperty _propertyType, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    assert(_propertyType != null);
    this._dispatchCall(1238,"OnSetProperty", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),_propertyType.value,(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  @DeclDISPID(1239)  public void OnSendMessage(final com.wilutions.mslib.uccollaborationlib.IModality _source, final String _message, final com.wilutions.mslib.uccollaborationlib.INamedPropertyList _formats, final com.wilutions.mslib.uccollaborationlib.IParticipantCollection _participants, final com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation _asyncOperation) throws ComException {
    assert(_message != null);
    this._dispatchCall(1239,"OnSendMessage", DISPATCH_METHOD,null,(_source!=null?_source:Dispatch.NULL),_message,(_formats!=null?_formats:Dispatch.NULL),(_participants!=null?_participants:Dispatch.NULL),(_asyncOperation!=null?_asyncOperation:Dispatch.NULL));
  }
  public _IModalityCallbackImpl(String progId) throws ComException {
    super(progId, "{3F60CFF7-BE3F-4404-8395-C02D0CDD318E}");
  }
  protected _IModalityCallbackImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IModalityCallbackImpl" + super.toString() + "]";
  }
}
