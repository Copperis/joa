/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * TextFrame.
 * 
 */
@CoInterface(guid="{000C0320-0000-0000-C000-000000000046}")
public interface TextFrame extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public Dispatch getParent() throws ComException;
  @DeclDISPID(100)  public Float getMarginBottom() throws ComException;
  @DeclDISPID(100)  public void setMarginBottom(Float value) throws ComException;
  @DeclDISPID(101)  public Float getMarginLeft() throws ComException;
  @DeclDISPID(101)  public void setMarginLeft(Float value) throws ComException;
  @DeclDISPID(102)  public Float getMarginRight() throws ComException;
  @DeclDISPID(102)  public void setMarginRight(Float value) throws ComException;
  @DeclDISPID(103)  public Float getMarginTop() throws ComException;
  @DeclDISPID(103)  public void setMarginTop(Float value) throws ComException;
  @DeclDISPID(104)  public MsoTextOrientation getOrientation() throws ComException;
  @DeclDISPID(104)  public void setOrientation(MsoTextOrientation value) throws ComException;
}
