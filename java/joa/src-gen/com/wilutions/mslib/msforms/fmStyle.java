/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{9C37F9D0-FDE5-11CE-9560-00AA004B9DFA}")
public class fmStyle implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmStyle fmStyleDropDownCombo = new fmStyle(0);
  public final static fmStyle fmStyleDropDownList = new fmStyle(2);

  // Integer constants for bitsets and switch statements
  public final static int _fmStyleDropDownCombo = 0;
  public final static int _fmStyleDropDownList = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmStyle valueOf(int value) {
    switch(value) {
    case 0: return fmStyleDropDownCombo;
    case 2: return fmStyleDropDownList;
    default: return new fmStyle(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "fmStyleDropDownCombo";
    case 2: return "fmStyleDropDownList";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|fmStyleDropDownCombo");
      if ((value & 2) != 0) sbuf.append("|fmStyleDropDownList");
      return sbuf.toString();
      }
    }
  }
}
