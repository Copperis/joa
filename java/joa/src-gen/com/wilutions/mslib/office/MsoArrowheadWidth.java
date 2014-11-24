/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoArrowheadWidth.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoArrowheadWidth {

  // Typed constants
  public final static MsoArrowheadWidth msoArrowheadWidthMixed = new MsoArrowheadWidth(-2);
  public final static MsoArrowheadWidth msoArrowheadNarrow = new MsoArrowheadWidth(1);
  public final static MsoArrowheadWidth msoArrowheadWidthMedium = new MsoArrowheadWidth(2);
  public final static MsoArrowheadWidth msoArrowheadWide = new MsoArrowheadWidth(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoArrowheadWidthMixed = -2;
  public final static int _msoArrowheadNarrow = 1;
  public final static int _msoArrowheadWidthMedium = 2;
  public final static int _msoArrowheadWide = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoArrowheadWidth(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoArrowheadWidth valueOf(int value) {
    switch(value) {
    case -2: return msoArrowheadWidthMixed;
    case 1: return msoArrowheadNarrow;
    case 2: return msoArrowheadWidthMedium;
    case 3: return msoArrowheadWide;
    default: return new MsoArrowheadWidth(value);
    }
  }
}
