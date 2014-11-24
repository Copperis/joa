/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextUnderlineType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTextUnderlineType {

  // Typed constants
  public final static MsoTextUnderlineType msoUnderlineMixed = new MsoTextUnderlineType(-2);
  public final static MsoTextUnderlineType msoNoUnderline = new MsoTextUnderlineType(0);
  public final static MsoTextUnderlineType msoUnderlineWords = new MsoTextUnderlineType(1);
  public final static MsoTextUnderlineType msoUnderlineSingleLine = new MsoTextUnderlineType(2);
  public final static MsoTextUnderlineType msoUnderlineDoubleLine = new MsoTextUnderlineType(3);
  public final static MsoTextUnderlineType msoUnderlineHeavyLine = new MsoTextUnderlineType(4);
  public final static MsoTextUnderlineType msoUnderlineDottedLine = new MsoTextUnderlineType(5);
  public final static MsoTextUnderlineType msoUnderlineDottedHeavyLine = new MsoTextUnderlineType(6);
  public final static MsoTextUnderlineType msoUnderlineDashLine = new MsoTextUnderlineType(7);
  public final static MsoTextUnderlineType msoUnderlineDashHeavyLine = new MsoTextUnderlineType(8);
  public final static MsoTextUnderlineType msoUnderlineDashLongLine = new MsoTextUnderlineType(9);
  public final static MsoTextUnderlineType msoUnderlineDashLongHeavyLine = new MsoTextUnderlineType(10);
  public final static MsoTextUnderlineType msoUnderlineDotDashLine = new MsoTextUnderlineType(11);
  public final static MsoTextUnderlineType msoUnderlineDotDashHeavyLine = new MsoTextUnderlineType(12);
  public final static MsoTextUnderlineType msoUnderlineDotDotDashLine = new MsoTextUnderlineType(13);
  public final static MsoTextUnderlineType msoUnderlineDotDotDashHeavyLine = new MsoTextUnderlineType(14);
  public final static MsoTextUnderlineType msoUnderlineWavyLine = new MsoTextUnderlineType(15);
  public final static MsoTextUnderlineType msoUnderlineWavyHeavyLine = new MsoTextUnderlineType(16);
  public final static MsoTextUnderlineType msoUnderlineWavyDoubleLine = new MsoTextUnderlineType(17);

  // Integer constants for bitsets and switch statements
  public final static int _msoUnderlineMixed = -2;
  public final static int _msoNoUnderline = 0;
  public final static int _msoUnderlineWords = 1;
  public final static int _msoUnderlineSingleLine = 2;
  public final static int _msoUnderlineDoubleLine = 3;
  public final static int _msoUnderlineHeavyLine = 4;
  public final static int _msoUnderlineDottedLine = 5;
  public final static int _msoUnderlineDottedHeavyLine = 6;
  public final static int _msoUnderlineDashLine = 7;
  public final static int _msoUnderlineDashHeavyLine = 8;
  public final static int _msoUnderlineDashLongLine = 9;
  public final static int _msoUnderlineDashLongHeavyLine = 10;
  public final static int _msoUnderlineDotDashLine = 11;
  public final static int _msoUnderlineDotDashHeavyLine = 12;
  public final static int _msoUnderlineDotDotDashLine = 13;
  public final static int _msoUnderlineDotDotDashHeavyLine = 14;
  public final static int _msoUnderlineWavyLine = 15;
  public final static int _msoUnderlineWavyHeavyLine = 16;
  public final static int _msoUnderlineWavyDoubleLine = 17;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTextUnderlineType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTextUnderlineType valueOf(int value) {
    switch(value) {
    case -2: return msoUnderlineMixed;
    case 0: return msoNoUnderline;
    case 1: return msoUnderlineWords;
    case 2: return msoUnderlineSingleLine;
    case 3: return msoUnderlineDoubleLine;
    case 4: return msoUnderlineHeavyLine;
    case 5: return msoUnderlineDottedLine;
    case 6: return msoUnderlineDottedHeavyLine;
    case 7: return msoUnderlineDashLine;
    case 8: return msoUnderlineDashHeavyLine;
    case 9: return msoUnderlineDashLongLine;
    case 10: return msoUnderlineDashLongHeavyLine;
    case 11: return msoUnderlineDotDashLine;
    case 12: return msoUnderlineDotDashHeavyLine;
    case 13: return msoUnderlineDotDotDashLine;
    case 14: return msoUnderlineDotDotDashHeavyLine;
    case 15: return msoUnderlineWavyLine;
    case 16: return msoUnderlineWavyHeavyLine;
    case 17: return msoUnderlineWavyDoubleLine;
    default: return new MsoTextUnderlineType(value);
    }
  }
}
