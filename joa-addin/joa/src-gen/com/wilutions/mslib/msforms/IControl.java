/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * IControl.
 * 
 */
@CoInterface(guid="{04598FC6-866C-11CF-AB7C-00AA00C08FCF}")
public interface IControl extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(-2147418056)  public void setCancel(final Boolean value) throws ComException;
  @DeclDISPID(-2147418056)  public Boolean getCancel() throws ComException;
  @DeclDISPID(-2147385343)  public void setControlSource(final String value) throws ComException;
  @DeclDISPID(-2147385343)  public String getControlSource() throws ComException;
  @DeclDISPID(-2147418043)  public void setControlTipText(final String value) throws ComException;
  @DeclDISPID(-2147418043)  public String getControlTipText() throws ComException;
  @DeclDISPID(-2147418057)  public void setDefault(final Boolean value) throws ComException;
  @DeclDISPID(-2147418057)  public Boolean getDefault() throws ComException;
  @DeclDISPID(1610743816)  public void _SetHeight(final Integer Height) throws ComException;
  @DeclDISPID(1610743817)  public void _GetHeight(final ByRef<Integer> Height) throws ComException;
  @DeclDISPID(-2147418106)  public void setHeight(final Float value) throws ComException;
  @DeclDISPID(-2147418106)  public Float getHeight() throws ComException;
  @DeclDISPID(-2147418062)  public void setHelpContextID(final Integer value) throws ComException;
  @DeclDISPID(-2147418062)  public Integer getHelpContextID() throws ComException;
  @DeclDISPID(-2147385340)  public fmLayoutEffect getLayoutEffect() throws ComException;
  @DeclDISPID(1610743825)  public void _SetLeft(final Integer Left) throws ComException;
  @DeclDISPID(1610743826)  public void _GetLeft(final ByRef<Integer> Left) throws ComException;
  @DeclDISPID(-2147418109)  public void setLeft(final Float value) throws ComException;
  @DeclDISPID(-2147418109)  public Float getLeft() throws ComException;
  @DeclDISPID(-2147418112)  public void setName(final String value) throws ComException;
  @DeclDISPID(-2147418112)  public String getName() throws ComException;
  @DeclDISPID(1610743831)  public void _GetOldHeight(final ByRef<Integer> OldHeight) throws ComException;
  @DeclDISPID(-2147385339)  public Float getOldHeight() throws ComException;
  @DeclDISPID(1610743833)  public void _GetOldLeft(final ByRef<Integer> OldLeft) throws ComException;
  @DeclDISPID(-2147385338)  public Float getOldLeft() throws ComException;
  @DeclDISPID(1610743835)  public void _GetOldTop(final ByRef<Integer> OldTop) throws ComException;
  @DeclDISPID(-2147385337)  public Float getOldTop() throws ComException;
  @DeclDISPID(1610743837)  public void _GetOldWidth(final ByRef<Integer> OldWidth) throws ComException;
  @DeclDISPID(-2147385336)  public Float getOldWidth() throws ComException;
  @DeclDISPID(-2147385335)  public IDispatch getObject() throws ComException;
  @DeclDISPID(-2147418104)  public IDispatch getParent() throws ComException;
  @DeclDISPID(-2147385330)  public void setRowSource(final String value) throws ComException;
  @DeclDISPID(-2147385330)  public String getRowSource() throws ComException;
  @DeclDISPID(-2147385329)  public void setRowSourceType(final Short value) throws ComException;
  @DeclDISPID(-2147385329)  public Short getRowSourceType() throws ComException;
  @DeclDISPID(-2147418097)  public void setTabIndex(final Short value) throws ComException;
  @DeclDISPID(-2147418097)  public Short getTabIndex() throws ComException;
  @DeclDISPID(-2147418098)  public void setTabStop(final Boolean value) throws ComException;
  @DeclDISPID(-2147418098)  public Boolean getTabStop() throws ComException;
  @DeclDISPID(-2147418101)  public void setTag(final String value) throws ComException;
  @DeclDISPID(-2147418101)  public String getTag() throws ComException;
  @DeclDISPID(1610743851)  public void _SetTop(final Integer Top) throws ComException;
  @DeclDISPID(1610743852)  public void _GetTop(final ByRef<Integer> Top) throws ComException;
  @DeclDISPID(-2147418108)  public void setTop(final Float value) throws ComException;
  @DeclDISPID(-2147418108)  public Float getTop() throws ComException;
  @DeclDISPID(-2147418105)  public void setVisible(final Boolean value) throws ComException;
  @DeclDISPID(-2147418105)  public Boolean getVisible() throws ComException;
  @DeclDISPID(1610743859)  public void _SetWidth(final Integer Width) throws ComException;
  @DeclDISPID(1610743860)  public void _GetWidth(final ByRef<Integer> Width) throws ComException;
  @DeclDISPID(-2147418107)  public void setWidth(final Float value) throws ComException;
  @DeclDISPID(-2147418107)  public Float getWidth() throws ComException;
  @DeclDISPID(-2147385088)  public void Move(final Object Left, final Object Top, final Object Width, final Object Height, final Object Layout) throws ComException;
  @DeclDISPID(-2147385083)  public void ZOrder(final Object zPosition) throws ComException;
  @DeclDISPID(-2147385085)  public void SetFocus() throws ComException;
  @DeclDISPID(1610743867)  public Integer _GethWnd() throws ComException;
  @DeclDISPID(1610743868)  public Integer _GetID() throws ComException;
  @DeclDISPID(1610743869)  public void _Move(final Integer Left, final Integer Top, final Integer Width, final Integer Height) throws ComException;
  @DeclDISPID(1610743870)  public void _ZOrder(final fmZOrder zPosition) throws ComException;
}
