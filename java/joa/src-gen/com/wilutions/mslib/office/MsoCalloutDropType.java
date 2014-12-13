/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCalloutDropType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoCalloutDropType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoCalloutDropType msoCalloutDropMixed = new MsoCalloutDropType(-2);
  public final static MsoCalloutDropType msoCalloutDropCustom = new MsoCalloutDropType(1);
  public final static MsoCalloutDropType msoCalloutDropTop = new MsoCalloutDropType(2);
  public final static MsoCalloutDropType msoCalloutDropCenter = new MsoCalloutDropType(3);
  public final static MsoCalloutDropType msoCalloutDropBottom = new MsoCalloutDropType(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoCalloutDropMixed = -2;
  public final static int _msoCalloutDropCustom = 1;
  public final static int _msoCalloutDropTop = 2;
  public final static int _msoCalloutDropCenter = 3;
  public final static int _msoCalloutDropBottom = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoCalloutDropType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoCalloutDropType valueOf(int value) {
    switch(value) {
    case -2: return msoCalloutDropMixed;
    case 1: return msoCalloutDropCustom;
    case 2: return msoCalloutDropTop;
    case 3: return msoCalloutDropCenter;
    case 4: return msoCalloutDropBottom;
    default: return new MsoCalloutDropType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 2: return "msoCalloutDropTop";
    case -2: return "msoCalloutDropMixed";
    case 1: return "msoCalloutDropCustom";
    case 3: return "msoCalloutDropCenter";
    case 4: return "msoCalloutDropBottom";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 2) != 0) sbuf.append("|msoCalloutDropTop");
      if ((value & -2) != 0) sbuf.append("|msoCalloutDropMixed");
      if ((value & 1) != 0) sbuf.append("|msoCalloutDropCustom");
      if ((value & 3) != 0) sbuf.append("|msoCalloutDropCenter");
      if ((value & 4) != 0) sbuf.append("|msoCalloutDropBottom");
      return sbuf.toString();
      }
    }
  }
}
