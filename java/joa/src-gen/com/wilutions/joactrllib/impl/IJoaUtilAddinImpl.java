/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.joactrllib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{80A3DD82-83F0-9F11-368F-65FA1182B3C5}")
public class IJoaUtilAddinImpl extends Dispatch implements com.wilutions.joactrllib.IJoaUtilAddin {
  @DeclDISPID(1)  public com.wilutions.joactrllib.IJoaBridgeDialog CreateBridgeDialog() throws ComException {
    final Object obj = this._dispatchCall(1,"CreateBridgeDialog", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.joactrllib.impl.IJoaBridgeDialogImpl.class);
  }
  public IJoaUtilAddinImpl(String progId) throws ComException {
    super(progId, "{403444E9-2793-4450-AB21-0C1DB4754F3F}");
  }
  protected IJoaUtilAddinImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IJoaUtilAddinImpl" + super.toString() + "]";
  }
}
