/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Conversation.
 * 
 */
@CoInterface(guid="{00063101-0000-0000-C000-000000000046}")
public interface _Conversation extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(64591)  public Table GetTable() throws ComException;
  @DeclDISPID(64592)  public SimpleItems GetChildren(final IDispatch Item) throws ComException;
  @DeclDISPID(64594)  public IDispatch GetParent(final IDispatch Item) throws ComException;
  @DeclDISPID(64595)  public SimpleItems GetRootItems() throws ComException;
  @DeclDISPID(64602)  public String GetAlwaysAssignCategories(final _Store Store) throws ComException;
  @DeclDISPID(64603)  public OlAlwaysDeleteConversation GetAlwaysDelete(final _Store Store) throws ComException;
  @DeclDISPID(64604)  public MAPIFolder GetAlwaysMoveToFolder(final _Store Store) throws ComException;
  @DeclDISPID(64605)  public void MarkAsRead() throws ComException;
  @DeclDISPID(64606)  public void MarkAsUnread() throws ComException;
  @DeclDISPID(64607)  public void SetAlwaysAssignCategories(final String Categories, final _Store Store) throws ComException;
  @DeclDISPID(64608)  public void SetAlwaysDelete(final OlAlwaysDeleteConversation AlwaysDelete, final _Store Store) throws ComException;
  @DeclDISPID(64609)  public void SetAlwaysMoveToFolder(final MAPIFolder MoveToFolder, final _Store Store) throws ComException;
  @DeclDISPID(64610)  public void ClearAlwaysAssignCategories(final _Store Store) throws ComException;
  @DeclDISPID(64611)  public void StopAlwaysDelete(final _Store Store) throws ComException;
  @DeclDISPID(64612)  public void StopAlwaysMoveToFolder(final _Store Store) throws ComException;
  @DeclDISPID(64629)  public String getConversationID() throws ComException;
}
