/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * ImageEvents.
 * 
 */
@CoInterface(guid="{4C5992A5-6926-101B-9992-00000B65C6F9}")
public interface ImageEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(3)  public void onBeforeDragOver(final ReturnBoolean Cancel, final DataObject Data, final Float X, final Float Y, final fmDragState DragState, final ReturnEffect Effect, final Short Shift) throws ComException;
  @DeclDISPID(4)  public void onBeforeDropOrPaste(final ReturnBoolean Cancel, final fmAction Action, final DataObject Data, final Float X, final Float Y, final ReturnEffect Effect, final Short Shift) throws ComException;
  @DeclDISPID(-600)  public void onClick() throws ComException;
  @DeclDISPID(-601)  public void onDblClick(final ReturnBoolean Cancel) throws ComException;
  @DeclDISPID(-608)  public void onError(final Short Number, final ReturnString Description, final Integer SCode, final String Source, final String HelpFile, final Integer HelpContext, final ReturnBoolean CancelDisplay) throws ComException;
  @DeclDISPID(-605)  public void onMouseDown(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException;
  @DeclDISPID(-606)  public void onMouseMove(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException;
  @DeclDISPID(-607)  public void onMouseUp(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException;
}
