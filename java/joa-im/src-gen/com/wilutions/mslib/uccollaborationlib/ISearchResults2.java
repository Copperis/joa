/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ISearchResults2.
 * ISearchResults2 Interface 
 */
@CoInterface(guid="{7CD92461-CA4F-4BEB-A636-8BBCC192E60F}")
public interface ISearchResults2 extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(268435457)  public Object[] getFastResults() throws ComException;
  @DeclDISPID(268435458)  public void GetPartialResults(final ByRef<ISearchResult[]> _results, final ByRef<Boolean> insert, final ByRef<Integer> index) throws ComException;
}
