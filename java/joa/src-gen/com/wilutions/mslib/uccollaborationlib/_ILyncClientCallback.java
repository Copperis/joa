/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _ILyncClientCallback.
 * _ILyncClientCallback Interface 
 */
@CoInterface(guid="{B26F6403-761E-48D4-84E2-619C17EAEB13}")
public interface _ILyncClientCallback extends IDispatch {
  @DeclDISPID(150)  public void OnSignIn(ILyncClient _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(151)  public void OnSignOut(ILyncClient _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(152)  public void OnInitialize(ILyncClient _source, IAsynchronousOperation _asyncOperation) throws ComException;
  @DeclDISPID(153)  public void OnShutdown(ILyncClient _source, IAsynchronousOperation _asyncOperation) throws ComException;
}
