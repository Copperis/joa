/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ICustomXMLPartEvents.
 * 
 */
@CoInterface(guid="{000CDB06-0000-0000-C000-000000000046}")
public interface ICustomXMLPartEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1)  public void onNodeAfterInsert(CustomXMLNode NewNode, Boolean InUndoRedo) throws ComException;
  @DeclDISPID(2)  public void onNodeAfterDelete(CustomXMLNode OldNode, CustomXMLNode OldParentNode, CustomXMLNode OldNextSibling, Boolean InUndoRedo) throws ComException;
  @DeclDISPID(3)  public void onNodeAfterReplace(CustomXMLNode OldNode, CustomXMLNode NewNode, Boolean InUndoRedo) throws ComException;
}
