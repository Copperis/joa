/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B4261-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ICustomXMLPartsEventsImpl extends Dispatch implements com.wilutions.mslib.office.ICustomXMLPartsEvents {
  @DeclDISPID(1)  public void onPartAfterAdd(final com.wilutions.mslib.office.CustomXMLPart NewPart) throws ComException {
    this._dispatchCall(1,"PartAfterAdd", DISPATCH_METHOD,null,(NewPart!=null?NewPart:Dispatch.NULL));
  }
  @DeclDISPID(2)  public void onPartBeforeDelete(final com.wilutions.mslib.office.CustomXMLPart OldPart) throws ComException {
    this._dispatchCall(2,"PartBeforeDelete", DISPATCH_METHOD,null,(OldPart!=null?OldPart:Dispatch.NULL));
  }
  @DeclDISPID(3)  public void onPartAfterLoad(final com.wilutions.mslib.office.CustomXMLPart Part) throws ComException {
    this._dispatchCall(3,"PartAfterLoad", DISPATCH_METHOD,null,(Part!=null?Part:Dispatch.NULL));
  }
  public ICustomXMLPartsEventsImpl(String progId) throws ComException {
    super(progId, "{000CDB0A-0000-0000-C000-000000000046}");
  }
  protected ICustomXMLPartsEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ICustomXMLPartsEventsImpl" + super.toString() + "]";
  }
}
