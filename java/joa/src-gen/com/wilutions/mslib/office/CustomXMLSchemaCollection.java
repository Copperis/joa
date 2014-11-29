/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CustomXMLSchemaCollection.
 * 
 */
@CoClass(guid="{000CDB0D-0000-0000-C000-000000000046}")
public class CustomXMLSchemaCollection extends Dispatch implements _CustomXMLSchemaCollection {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public CustomXMLSchema getItem(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLSchemaImpl.class);
  }
  @DeclDISPID(1610809347)  public String getNamespaceURI(final Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(1610809347,"NamespaceURI", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809348)  public CustomXMLSchema Add(final String NamespaceURI, final String Alias, final String FileName, final Boolean InstallForAllUsers) throws ComException {
    assert(NamespaceURI != null);
    assert(Alias != null);
    assert(FileName != null);
    assert(InstallForAllUsers != null);
    final Object obj = this._dispatchCall(1610809348,"Add", DISPATCH_METHOD,null,NamespaceURI,Alias,FileName,InstallForAllUsers);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.CustomXMLSchemaImpl.class);
  }
  @DeclDISPID(1610809349)  public void AddCollection(final CustomXMLSchemaCollection SchemaCollection) throws ComException {
    this._dispatchCall(1610809349,"AddCollection", DISPATCH_METHOD,null,(SchemaCollection!=null?SchemaCollection:Dispatch.NULL));
  }
  @DeclDISPID(1610809350)  public Boolean Validate() throws ComException {
    final Object obj = this._dispatchCall(1610809350,"Validate", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public CustomXMLSchemaCollection() throws ComException {
    super("{000CDB0D-0000-0000-C000-000000000046}", "{000CDB02-0000-0000-C000-000000000046}");
  }
  protected CustomXMLSchemaCollection(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CustomXMLSchemaCollection" + super.toString() + "]";
  }
}
