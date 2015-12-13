/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{16E571E0-040B-11CF-8283-00AA004BA6AE}")
public class fmOrientation implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmOrientation fmOrientationAuto = new fmOrientation(-1);
  public final static fmOrientation fmOrientationVertical = new fmOrientation(0);
  public final static fmOrientation fmOrientationHorizontal = new fmOrientation(1);

  // Integer constants for bitsets and switch statements
  public final static int _fmOrientationAuto = -1;
  public final static int _fmOrientationVertical = 0;
  public final static int _fmOrientationHorizontal = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmOrientation(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmOrientation valueOf(int value) {
    switch(value) {
    case -1: return fmOrientationAuto;
    case 0: return fmOrientationVertical;
    case 1: return fmOrientationHorizontal;
    default: return new fmOrientation(value);
    }
  }

  public String toString() {
    switch(value) {
    case -1: return "fmOrientationAuto";
    case 0: return "fmOrientationVertical";
    case 1: return "fmOrientationHorizontal";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -1) != 0) sbuf.append("|fmOrientationAuto");
      if ((value & 0) != 0) sbuf.append("|fmOrientationVertical");
      if ((value & 1) != 0) sbuf.append("|fmOrientationHorizontal");
      return sbuf.toString();
      }
    }
  }
}
