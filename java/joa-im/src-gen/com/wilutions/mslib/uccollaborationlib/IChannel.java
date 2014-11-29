/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IChannel.
 * IChannel Interface 
 */
@CoInterface(guid="{61C747F6-157C-4CAE-A37C-EC4352175860}")
public interface IChannel extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ChannelType getType() throws ComException;
  @DeclDISPID(1610743809)  public ChannelState getState() throws ComException;
  @DeclDISPID(1610743810)  public IModality getModality() throws ComException;
  @DeclDISPID(1610743811)  public Boolean getIsContributing() throws ComException;
  @DeclDISPID(1610743812)  public IAsynchronousOperation Start(final Object _mediaChannelCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation Stop(final Object _mediaChannelCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743814)  public Boolean CanInvoke(final ChannelAction _action) throws ComException;
}
