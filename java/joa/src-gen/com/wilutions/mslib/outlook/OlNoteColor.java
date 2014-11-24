/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlNoteColor.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlNoteColor {

  // Typed constants
  public final static OlNoteColor olBlue = new OlNoteColor(0);
  public final static OlNoteColor olGreen = new OlNoteColor(1);
  public final static OlNoteColor olPink = new OlNoteColor(2);
  public final static OlNoteColor olYellow = new OlNoteColor(3);
  public final static OlNoteColor olWhite = new OlNoteColor(4);

  // Integer constants for bitsets and switch statements
  public final static int _olBlue = 0;
  public final static int _olGreen = 1;
  public final static int _olPink = 2;
  public final static int _olYellow = 3;
  public final static int _olWhite = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlNoteColor(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlNoteColor valueOf(int value) {
    switch(value) {
    case 0: return olBlue;
    case 1: return olGreen;
    case 2: return olPink;
    case 3: return olYellow;
    case 4: return olWhite;
    default: return new OlNoteColor(value);
    }
  }
}
