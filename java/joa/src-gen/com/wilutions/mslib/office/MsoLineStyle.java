/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLineStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoLineStyle {

  // Typed constants
  public final static MsoLineStyle msoLineStyleMixed = new MsoLineStyle(-2);
  public final static MsoLineStyle msoLineSingle = new MsoLineStyle(1);
  public final static MsoLineStyle msoLineThinThin = new MsoLineStyle(2);
  public final static MsoLineStyle msoLineThinThick = new MsoLineStyle(3);
  public final static MsoLineStyle msoLineThickThin = new MsoLineStyle(4);
  public final static MsoLineStyle msoLineThickBetweenThin = new MsoLineStyle(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoLineStyleMixed = -2;
  public final static int _msoLineSingle = 1;
  public final static int _msoLineThinThin = 2;
  public final static int _msoLineThinThick = 3;
  public final static int _msoLineThickThin = 4;
  public final static int _msoLineThickBetweenThin = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoLineStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoLineStyle valueOf(int value) {
    switch(value) {
    case -2: return msoLineStyleMixed;
    case 1: return msoLineSingle;
    case 2: return msoLineThinThin;
    case 3: return msoLineThinThick;
    case 4: return msoLineThickThin;
    case 5: return msoLineThickBetweenThin;
    default: return new MsoLineStyle(value);
    }
  }
}
