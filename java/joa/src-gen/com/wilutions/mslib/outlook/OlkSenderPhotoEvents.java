/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlkSenderPhotoEvents.
 * 
 */
@CoInterface(guid="{00067356-0000-0000-C000-000000000046}")
public interface OlkSenderPhotoEvents extends IDispatch {
  @DeclDISPID(-600)  public void onClick() throws ComException;
  @DeclDISPID(-601)  public void onDoubleClick() throws ComException;
  @DeclDISPID(-605)  public void onMouseDown(OlMouseButton Button, OlShiftState Shift, com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException;
  @DeclDISPID(-606)  public void onMouseMove(OlMouseButton Button, OlShiftState Shift, com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException;
  @DeclDISPID(-607)  public void onMouseUp(OlMouseButton Button, OlShiftState Shift, com.wilutions.mslib.stdole.OLE_XPOS_CONTAINER X, com.wilutions.mslib.stdole.OLE_YPOS_CONTAINER Y) throws ComException;
  @DeclDISPID(2)  public void onChange() throws ComException;
}
