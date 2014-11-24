/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMultiLine.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlMultiLine {

  // Typed constants
  public final static OlMultiLine olWidthMultiLine = new OlMultiLine(0);
  public final static OlMultiLine olAlwaysSingleLine = new OlMultiLine(1);
  public final static OlMultiLine olAlwaysMultiLine = new OlMultiLine(2);

  // Integer constants for bitsets and switch statements
  public final static int _olWidthMultiLine = 0;
  public final static int _olAlwaysSingleLine = 1;
  public final static int _olAlwaysMultiLine = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlMultiLine(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlMultiLine valueOf(int value) {
    switch(value) {
    case 0: return olWidthMultiLine;
    case 1: return olAlwaysSingleLine;
    case 2: return olAlwaysMultiLine;
    default: return new OlMultiLine(value);
    }
  }
}
