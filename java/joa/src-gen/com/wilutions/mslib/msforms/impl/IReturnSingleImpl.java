/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{4AFFA5FB-1EE7-CA8E-1CBE-69476CF4FC8E}")
public class IReturnSingleImpl extends Dispatch implements com.wilutions.mslib.msforms.IReturnSingle {
  @DeclDISPID(0)  public void setValue(final Float value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Float getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Float)obj;
  }
  public IReturnSingleImpl(String progId) throws ComException {
    super(progId, "{8A683C90-BA84-11CF-8110-00A0C9030074}");
  }
  protected IReturnSingleImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IReturnSingleImpl" + super.toString() + "]";
  }
}
