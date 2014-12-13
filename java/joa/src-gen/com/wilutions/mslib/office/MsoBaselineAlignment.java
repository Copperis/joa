/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBaselineAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBaselineAlignment implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoBaselineAlignment msoBaselineAlignMixed = new MsoBaselineAlignment(-2);
  public final static MsoBaselineAlignment msoBaselineAlignBaseline = new MsoBaselineAlignment(1);
  public final static MsoBaselineAlignment msoBaselineAlignTop = new MsoBaselineAlignment(2);
  public final static MsoBaselineAlignment msoBaselineAlignCenter = new MsoBaselineAlignment(3);
  public final static MsoBaselineAlignment msoBaselineAlignFarEast50 = new MsoBaselineAlignment(4);
  public final static MsoBaselineAlignment msoBaselineAlignAuto = new MsoBaselineAlignment(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoBaselineAlignMixed = -2;
  public final static int _msoBaselineAlignBaseline = 1;
  public final static int _msoBaselineAlignTop = 2;
  public final static int _msoBaselineAlignCenter = 3;
  public final static int _msoBaselineAlignFarEast50 = 4;
  public final static int _msoBaselineAlignAuto = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBaselineAlignment(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBaselineAlignment valueOf(int value) {
    switch(value) {
    case -2: return msoBaselineAlignMixed;
    case 1: return msoBaselineAlignBaseline;
    case 2: return msoBaselineAlignTop;
    case 3: return msoBaselineAlignCenter;
    case 4: return msoBaselineAlignFarEast50;
    case 5: return msoBaselineAlignAuto;
    default: return new MsoBaselineAlignment(value);
    }
  }

  public String toString() {
    switch(value) {
    case 2: return "msoBaselineAlignTop";
    case -2: return "msoBaselineAlignMixed";
    case 1: return "msoBaselineAlignBaseline";
    case 3: return "msoBaselineAlignCenter";
    case 4: return "msoBaselineAlignFarEast50";
    case 5: return "msoBaselineAlignAuto";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 2) != 0) sbuf.append("|msoBaselineAlignTop");
      if ((value & -2) != 0) sbuf.append("|msoBaselineAlignMixed");
      if ((value & 1) != 0) sbuf.append("|msoBaselineAlignBaseline");
      if ((value & 3) != 0) sbuf.append("|msoBaselineAlignCenter");
      if ((value & 4) != 0) sbuf.append("|msoBaselineAlignFarEast50");
      if ((value & 5) != 0) sbuf.append("|msoBaselineAlignAuto");
      return sbuf.toString();
      }
    }
  }
}
