/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{7098BC4B-A6FF-9C91-2946-E659518B5684}")
public class IVideoViewInformationDictionaryImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IVideoViewInformationDictionary {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public Object getItem(com.wilutions.mslib.uccollaborationlib.VideoViewInformationType _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,_key.value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.VideoViewInformationType[] getKeys() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Keys", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.VideoViewInformationType[])obj;
  }
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Values", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object[])obj;
  }
  @DeclDISPID(1610743812)  public Boolean TryGetValue(com.wilutions.mslib.uccollaborationlib.VideoViewInformationType _key, ByRef<Object> _itemValue) throws ComException {
    assert(_key != null);
    assert(_itemValue != null);
    final Object obj = this._dispatchCall(1610743812,"TryGetValue", DISPATCH_METHOD,null,_key.value,_itemValue);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.VideoViewInformationType GetKeyAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743813,"GetKeyAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.VideoViewInformationType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException {
    assert(_index != null);
    final Object obj = this._dispatchCall(1610743814,"GetValueAt", DISPATCH_METHOD,null,_index);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1610743815)  public Boolean ContainsKey(com.wilutions.mslib.uccollaborationlib.VideoViewInformationType _key) throws ComException {
    assert(_key != null);
    final Object obj = this._dispatchCall(1610743815,"ContainsKey", DISPATCH_METHOD,null,_key.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IVideoViewInformationDictionaryImpl(String progId) throws ComException {
    super(progId, "{B00F2520-029C-47D0-B4E8-8FBEF47CAA7E}");
  }
  protected IVideoViewInformationDictionaryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IVideoViewInformationDictionaryImpl" + super.toString() + "]";
  }
}
