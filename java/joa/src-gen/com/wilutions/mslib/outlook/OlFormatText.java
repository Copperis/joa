/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatText.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormatText implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFormatText olFormatTextText = new OlFormatText(1);

  // Integer constants for bitsets and switch statements
  public final static int _olFormatTextText = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormatText(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFormatText valueOf(int value) {
    switch(value) {
    case 1: return olFormatTextText;
    default: return new OlFormatText(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "olFormatTextText";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|olFormatTextText");
      return sbuf.toString();
      }
    }
  }
}
