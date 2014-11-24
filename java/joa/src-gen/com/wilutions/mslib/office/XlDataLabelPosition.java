/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlDataLabelPosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlDataLabelPosition {

  // Typed constants
  public final static XlDataLabelPosition xlLabelPositionCenter = new XlDataLabelPosition(-4108);
  public final static XlDataLabelPosition xlLabelPositionAbove = new XlDataLabelPosition(0);
  public final static XlDataLabelPosition xlLabelPositionBelow = new XlDataLabelPosition(1);
  public final static XlDataLabelPosition xlLabelPositionLeft = new XlDataLabelPosition(-4131);
  public final static XlDataLabelPosition xlLabelPositionRight = new XlDataLabelPosition(-4152);
  public final static XlDataLabelPosition xlLabelPositionOutsideEnd = new XlDataLabelPosition(2);
  public final static XlDataLabelPosition xlLabelPositionInsideEnd = new XlDataLabelPosition(3);
  public final static XlDataLabelPosition xlLabelPositionInsideBase = new XlDataLabelPosition(4);
  public final static XlDataLabelPosition xlLabelPositionBestFit = new XlDataLabelPosition(5);
  public final static XlDataLabelPosition xlLabelPositionMixed = new XlDataLabelPosition(6);
  public final static XlDataLabelPosition xlLabelPositionCustom = new XlDataLabelPosition(7);

  // Integer constants for bitsets and switch statements
  public final static int _xlLabelPositionCenter = -4108;
  public final static int _xlLabelPositionAbove = 0;
  public final static int _xlLabelPositionBelow = 1;
  public final static int _xlLabelPositionLeft = -4131;
  public final static int _xlLabelPositionRight = -4152;
  public final static int _xlLabelPositionOutsideEnd = 2;
  public final static int _xlLabelPositionInsideEnd = 3;
  public final static int _xlLabelPositionInsideBase = 4;
  public final static int _xlLabelPositionBestFit = 5;
  public final static int _xlLabelPositionMixed = 6;
  public final static int _xlLabelPositionCustom = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlDataLabelPosition(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlDataLabelPosition valueOf(int value) {
    switch(value) {
    case -4108: return xlLabelPositionCenter;
    case 0: return xlLabelPositionAbove;
    case 1: return xlLabelPositionBelow;
    case -4131: return xlLabelPositionLeft;
    case -4152: return xlLabelPositionRight;
    case 2: return xlLabelPositionOutsideEnd;
    case 3: return xlLabelPositionInsideEnd;
    case 4: return xlLabelPositionInsideBase;
    case 5: return xlLabelPositionBestFit;
    case 6: return xlLabelPositionMixed;
    case 7: return xlLabelPositionCustom;
    default: return new XlDataLabelPosition(value);
    }
  }
}
