/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * PropertyAccessor.
 * 
 */
@CoClass(guid="{0006102D-0000-0000-C000-000000000046}")
public class PropertyAccessor extends Dispatch implements _PropertyAccessor {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(64251)  public Object GetProperty(final String SchemaName) throws ComException {
    assert(SchemaName != null);
    final Object obj = this._dispatchCall(64251,"GetProperty", DISPATCH_METHOD,null,SchemaName);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64252)  public void SetProperty(final String SchemaName, final Object Value) throws ComException {
    assert(SchemaName != null);
    assert(Value != null);
    this._dispatchCall(64252,"SetProperty", DISPATCH_METHOD,null,SchemaName,Value);
  }
  @DeclDISPID(64254)  public Object GetProperties(final Object SchemaNames) throws ComException {
    assert(SchemaNames != null);
    final Object obj = this._dispatchCall(64254,"GetProperties", DISPATCH_METHOD,null,SchemaNames);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64255)  public Object SetProperties(final Object SchemaNames, final Object Values) throws ComException {
    assert(SchemaNames != null);
    assert(Values != null);
    final Object obj = this._dispatchCall(64255,"SetProperties", DISPATCH_METHOD,null,SchemaNames,Values);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64256)  public java.util.Date UTCToLocalTime(final java.util.Date Value) throws ComException {
    assert(Value != null);
    final Object obj = this._dispatchCall(64256,"UTCToLocalTime", DISPATCH_METHOD,null,Value);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64257)  public java.util.Date LocalTimeToUTC(final java.util.Date Value) throws ComException {
    assert(Value != null);
    final Object obj = this._dispatchCall(64257,"LocalTimeToUTC", DISPATCH_METHOD,null,Value);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64258)  public Object StringToBinary(final String Value) throws ComException {
    assert(Value != null);
    final Object obj = this._dispatchCall(64258,"StringToBinary", DISPATCH_METHOD,null,Value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64259)  public String BinaryToString(final Object Value) throws ComException {
    assert(Value != null);
    final Object obj = this._dispatchCall(64259,"BinaryToString", DISPATCH_METHOD,null,Value);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64401)  public void DeleteProperty(final String SchemaName) throws ComException {
    assert(SchemaName != null);
    this._dispatchCall(64401,"DeleteProperty", DISPATCH_METHOD,null,SchemaName);
  }
  @DeclDISPID(64402)  public Object DeleteProperties(final Object SchemaNames) throws ComException {
    assert(SchemaNames != null);
    final Object obj = this._dispatchCall(64402,"DeleteProperties", DISPATCH_METHOD,null,SchemaNames);
    if (obj == null) return null;
    return (Object)obj;
  }
  public PropertyAccessor() throws ComException {
    super("{0006102D-0000-0000-C000-000000000046}", "{0006302D-0000-0000-C000-000000000046}");
  }
  protected PropertyAccessor(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PropertyAccessor" + super.toString() + "]";
  }
}
