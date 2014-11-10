/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * CustomXMLParts.
 * 
 */
@CoClass(guid="{000CDB0C-0000-0000-C000-000000000046}")
public class CustomXMLParts extends Dispatch implements _CustomXMLParts {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809344)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610809345)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public CustomXMLPart getItem(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(CustomXMLPart.class);
  }
  @DeclDISPID(1610809347)  public CustomXMLPart Add(String XML, Object SchemaCollection) throws ComException {
    assert(XML != null);
    assert(SchemaCollection != null);
    final Object obj = this._dispatchCall(1610809347,"Add", DISPATCH_METHOD,null,XML,SchemaCollection);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(CustomXMLPart.class);
  }
  @DeclDISPID(1610809348)  public CustomXMLPart SelectByID(String Id) throws ComException {
    assert(Id != null);
    final Object obj = this._dispatchCall(1610809348,"SelectByID", DISPATCH_METHOD,null,Id);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(CustomXMLPart.class);
  }
  @DeclDISPID(1610809349)  public CustomXMLParts SelectByNamespace(String NamespaceURI) throws ComException {
    assert(NamespaceURI != null);
    final Object obj = this._dispatchCall(1610809349,"SelectByNamespace", DISPATCH_METHOD,null,NamespaceURI);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(CustomXMLParts.class);
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public CustomXMLParts() throws ComException {
    super("{000CDB0C-0000-0000-C000-000000000046}");
  }
  protected CustomXMLParts(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CustomXMLParts" + super.toString() + "]";
  }
}
