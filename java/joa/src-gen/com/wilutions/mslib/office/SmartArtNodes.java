/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SmartArtNodes.
 * 
 */
@CoInterface(guid="{000C03C7-0000-0000-C000-000000000046}")
public interface SmartArtNodes extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(0)  public SmartArtNode Item(Object Index) throws ComException;
  @DeclDISPID(1)  public Dispatch getParent() throws ComException;
  @DeclDISPID(2)  public Integer getCount() throws ComException;
  @DeclDISPID(3)  public SmartArtNode Add() throws ComException;
}
