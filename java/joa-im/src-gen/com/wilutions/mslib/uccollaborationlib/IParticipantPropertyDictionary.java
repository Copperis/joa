/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IParticipantPropertyDictionary.
 * IParticipantPropertyDictionary Interface 
 */
@CoInterface(guid="{8665FD95-7720-4F9E-B605-6ABCBD7EDFF4}")
public interface IParticipantPropertyDictionary extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Object getItem(ParticipantProperty _propertyType) throws ComException;
  @DeclDISPID(1610743810)  public ParticipantProperty[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public Object[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public Boolean TryGetValue(ParticipantProperty _propertyType, ByRef<Object> _itemValue) throws ComException;
  @DeclDISPID(1610743813)  public ParticipantProperty GetKeyAt(Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Object GetValueAt(Integer _index) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(ParticipantProperty _propertyType) throws ComException;
}
