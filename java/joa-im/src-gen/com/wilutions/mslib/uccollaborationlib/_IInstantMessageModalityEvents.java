/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IInstantMessageModalityEvents.
 * _IInstantMessageModalityEvents Interface 
 */
@CoInterface(guid="{4FE44049-4E44-4109-B234-4E4EFC135A86}")
public interface _IInstantMessageModalityEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1201)  public void onOnModalityStateChanged(IModality _eventSource, IModalityStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(1200)  public void onOnInstantMessagePropertyChanged(IInstantMessageModality _eventSource, IModalityPropertyChangedEventData _eventData) throws ComException;
  @DeclDISPID(1202)  public void onOnInstantMessageReceived(IInstantMessageModality _eventSource, IMessageSentEventData _eventData) throws ComException;
  @DeclDISPID(1203)  public void onOnIsTypingChanged(IInstantMessageModality _eventSource, IIsTypingChangedEventData _eventData) throws ComException;
  @DeclDISPID(1204)  public void onOnActionAvailabilityChanged(IModality _eventSource, IModalityActionAvailabilityChangedEventData _eventData) throws ComException;
}
