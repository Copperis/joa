/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * TextEffectFormat.
 * 
 */
@CoInterface(guid="{000C031F-0000-0000-C000-000000000046}")
public interface TextEffectFormat extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(10)  public void ToggleVerticalText() throws ComException;
  @DeclDISPID(100)  public MsoTextEffectAlignment getAlignment() throws ComException;
  @DeclDISPID(100)  public void setAlignment(final MsoTextEffectAlignment value) throws ComException;
  @DeclDISPID(101)  public MsoTriState getFontBold() throws ComException;
  @DeclDISPID(101)  public void setFontBold(final MsoTriState value) throws ComException;
  @DeclDISPID(102)  public MsoTriState getFontItalic() throws ComException;
  @DeclDISPID(102)  public void setFontItalic(final MsoTriState value) throws ComException;
  @DeclDISPID(103)  public String getFontName() throws ComException;
  @DeclDISPID(103)  public void setFontName(final String value) throws ComException;
  @DeclDISPID(104)  public Float getFontSize() throws ComException;
  @DeclDISPID(104)  public void setFontSize(final Float value) throws ComException;
  @DeclDISPID(105)  public MsoTriState getKernedPairs() throws ComException;
  @DeclDISPID(105)  public void setKernedPairs(final MsoTriState value) throws ComException;
  @DeclDISPID(106)  public MsoTriState getNormalizedHeight() throws ComException;
  @DeclDISPID(106)  public void setNormalizedHeight(final MsoTriState value) throws ComException;
  @DeclDISPID(107)  public MsoPresetTextEffectShape getPresetShape() throws ComException;
  @DeclDISPID(107)  public void setPresetShape(final MsoPresetTextEffectShape value) throws ComException;
  @DeclDISPID(108)  public MsoPresetTextEffect getPresetTextEffect() throws ComException;
  @DeclDISPID(108)  public void setPresetTextEffect(final MsoPresetTextEffect value) throws ComException;
  @DeclDISPID(109)  public MsoTriState getRotatedChars() throws ComException;
  @DeclDISPID(109)  public void setRotatedChars(final MsoTriState value) throws ComException;
  @DeclDISPID(110)  public String getText() throws ComException;
  @DeclDISPID(110)  public void setText(final String value) throws ComException;
  @DeclDISPID(111)  public Float getTracking() throws ComException;
  @DeclDISPID(111)  public void setTracking(final Float value) throws ComException;
}
