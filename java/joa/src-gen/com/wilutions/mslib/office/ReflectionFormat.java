/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ReflectionFormat.
 * 
 */
@CoInterface(guid="{000C03BE-0000-0000-C000-000000000046}")
public interface ReflectionFormat extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public MsoReflectionType getType() throws ComException;
  @DeclDISPID(1)  public void setType(final MsoReflectionType value) throws ComException;
  @DeclDISPID(2)  public Float getTransparency() throws ComException;
  @DeclDISPID(2)  public void setTransparency(final Float value) throws ComException;
  @DeclDISPID(3)  public Float getSize() throws ComException;
  @DeclDISPID(3)  public void setSize(final Float value) throws ComException;
  @DeclDISPID(4)  public Float getOffset() throws ComException;
  @DeclDISPID(4)  public void setOffset(final Float value) throws ComException;
  @DeclDISPID(5)  public Float getBlur() throws ComException;
  @DeclDISPID(5)  public void setBlur(final Float value) throws ComException;
}
