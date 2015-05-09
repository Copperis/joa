/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{0FA80DCB-5125-CA8F-0660-694DA59772FB}")
public class OptionFrameEventsImpl extends Dispatch implements com.wilutions.mslib.msforms.OptionFrameEvents {
  @DeclDISPID(768)  public void onAddControl(final com.wilutions.mslib.msforms.Control Control) throws ComException {
    this._dispatchCall(768,"AddControl", DISPATCH_METHOD,null,Dispatch.param(Control));
  }
  @DeclDISPID(3)  public void onBeforeDragOver(final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.Control Control, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.fmDragState State, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(X != null);
    assert(Y != null);
    assert(State != null);
    assert(Shift != null);
    this._dispatchCall(3,"BeforeDragOver", DISPATCH_METHOD,null,Dispatch.param(Cancel),Dispatch.param(Control),Dispatch.param(Data),X,Y,State.value,Dispatch.param(Effect),Shift);
  }
  @DeclDISPID(4)  public void onBeforeDropOrPaste(final com.wilutions.mslib.msforms.ReturnBoolean Cancel, final com.wilutions.mslib.msforms.Control Control, final com.wilutions.mslib.msforms.fmAction Action, final com.wilutions.mslib.msforms.DataObject Data, final Float X, final Float Y, final com.wilutions.mslib.msforms.ReturnEffect Effect, final Short Shift) throws ComException {
    assert(Action != null);
    assert(X != null);
    assert(Y != null);
    assert(Shift != null);
    this._dispatchCall(4,"BeforeDropOrPaste", DISPATCH_METHOD,null,Dispatch.param(Cancel),Dispatch.param(Control),Action.value,Dispatch.param(Data),X,Y,Dispatch.param(Effect),Shift);
  }
  @DeclDISPID(-600)  public void onClick() throws ComException {
    this._dispatchCall(-600,"Click", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-601)  public void onDblClick(final com.wilutions.mslib.msforms.ReturnBoolean Cancel) throws ComException {
    this._dispatchCall(-601,"DblClick", DISPATCH_METHOD,null,Dispatch.param(Cancel));
  }
  @DeclDISPID(-608)  public void onError(final Short Number, final com.wilutions.mslib.msforms.ReturnString Description, final Integer SCode, final String Source, final String HelpFile, final Integer HelpContext, final com.wilutions.mslib.msforms.ReturnBoolean CancelDisplay) throws ComException {
    assert(Number != null);
    assert(SCode != null);
    assert(Source != null);
    assert(HelpFile != null);
    assert(HelpContext != null);
    this._dispatchCall(-608,"Error", DISPATCH_METHOD,null,Number,Dispatch.param(Description),SCode,Source,HelpFile,HelpContext,Dispatch.param(CancelDisplay));
  }
  @DeclDISPID(-602)  public void onKeyDown(final com.wilutions.mslib.msforms.ReturnInteger KeyCode, final Short Shift) throws ComException {
    assert(Shift != null);
    this._dispatchCall(-602,"KeyDown", DISPATCH_METHOD,null,Dispatch.param(KeyCode),Shift);
  }
  @DeclDISPID(-603)  public void onKeyPress(final com.wilutions.mslib.msforms.ReturnInteger KeyAscii) throws ComException {
    this._dispatchCall(-603,"KeyPress", DISPATCH_METHOD,null,Dispatch.param(KeyAscii));
  }
  @DeclDISPID(-604)  public void onKeyUp(final com.wilutions.mslib.msforms.ReturnInteger KeyCode, final Short Shift) throws ComException {
    assert(Shift != null);
    this._dispatchCall(-604,"KeyUp", DISPATCH_METHOD,null,Dispatch.param(KeyCode),Shift);
  }
  @DeclDISPID(770)  public void onLayout() throws ComException {
    this._dispatchCall(770,"Layout", DISPATCH_METHOD,null);
  }
  @DeclDISPID(-605)  public void onMouseDown(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-605,"MouseDown", DISPATCH_METHOD,null,Button,Shift,X,Y);
  }
  @DeclDISPID(-606)  public void onMouseMove(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-606,"MouseMove", DISPATCH_METHOD,null,Button,Shift,X,Y);
  }
  @DeclDISPID(-607)  public void onMouseUp(final Short Button, final Short Shift, final Float X, final Float Y) throws ComException {
    assert(Button != null);
    assert(Shift != null);
    assert(X != null);
    assert(Y != null);
    this._dispatchCall(-607,"MouseUp", DISPATCH_METHOD,null,Button,Shift,X,Y);
  }
  @DeclDISPID(771)  public void onRemoveControl(final com.wilutions.mslib.msforms.Control Control) throws ComException {
    this._dispatchCall(771,"RemoveControl", DISPATCH_METHOD,null,Dispatch.param(Control));
  }
  @DeclDISPID(772)  public void onScroll(final com.wilutions.mslib.msforms.fmScrollAction ActionX, final com.wilutions.mslib.msforms.fmScrollAction ActionY, final Float RequestDx, final Float RequestDy, final com.wilutions.mslib.msforms.ReturnSingle ActualDx, final com.wilutions.mslib.msforms.ReturnSingle ActualDy) throws ComException {
    assert(ActionX != null);
    assert(ActionY != null);
    assert(RequestDx != null);
    assert(RequestDy != null);
    this._dispatchCall(772,"Scroll", DISPATCH_METHOD,null,ActionX.value,ActionY.value,RequestDx,RequestDy,Dispatch.param(ActualDx),Dispatch.param(ActualDy));
  }
  @DeclDISPID(773)  public void onZoom(final ByRef<Short> Percent) throws ComException {
    assert(Percent != null);
    this._dispatchCall(773,"Zoom", DISPATCH_METHOD,null,Percent);
  }
  public OptionFrameEventsImpl(String progId) throws ComException {
    super(progId, "{CF3F94A0-F546-11CE-9BCE-00AA00608E01}");
  }
  protected OptionFrameEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OptionFrameEventsImpl" + super.toString() + "]";
  }
}
