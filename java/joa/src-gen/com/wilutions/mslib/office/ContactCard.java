/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ContactCard.
 * 
 */
@CoInterface(guid="{000C03F1-0000-0000-C000-000000000046}")
public interface ContactCard extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public void Close() throws ComException;
  @DeclDISPID(2)  public void Show(final MsoContactCardStyle CardStyle, final Integer RectangleLeft, final Integer RectangleRight, final Integer RectangleTop, final Integer RectangleBottom, final Integer HorizontalPosition, final Boolean ShowWithDelay) throws ComException;
}
