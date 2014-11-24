/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ColorFormat.
 * 
 */
@CoInterface(guid="{000C0312-0000-0000-C000-000000000046}")
public interface ColorFormat extends IDispatch {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(0)  public MsoRGBType getRGB() throws ComException;
  @DeclDISPID(0)  public void setRGB(MsoRGBType value) throws ComException;
  @DeclDISPID(100)  public Integer getSchemeColor() throws ComException;
  @DeclDISPID(100)  public void setSchemeColor(Integer value) throws ComException;
  @DeclDISPID(101)  public MsoColorType getType() throws ComException;
  @DeclDISPID(103)  public Float getTintAndShade() throws ComException;
  @DeclDISPID(103)  public void setTintAndShade(Float value) throws ComException;
  @DeclDISPID(104)  public MsoThemeColorIndex getObjectThemeColor() throws ComException;
  @DeclDISPID(104)  public void setObjectThemeColor(MsoThemeColorIndex value) throws ComException;
  @DeclDISPID(105)  public Float getBrightness() throws ComException;
  @DeclDISPID(105)  public void setBrightness(Float value) throws ComException;
}
