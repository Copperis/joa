/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlPermissionService.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlPermissionService implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlPermissionService olUnknown = new OlPermissionService(0);
  public final static OlPermissionService olWindows = new OlPermissionService(1);
  public final static OlPermissionService olPassport = new OlPermissionService(2);

  // Integer constants for bitsets and switch statements
  public final static int _olUnknown = 0;
  public final static int _olWindows = 1;
  public final static int _olPassport = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlPermissionService(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlPermissionService valueOf(int value) {
    switch(value) {
    case 0: return olUnknown;
    case 1: return olWindows;
    case 2: return olPassport;
    default: return new OlPermissionService(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olUnknown";
    case 1: return "olWindows";
    case 2: return "olPassport";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olUnknown");
      if ((value & 1) != 0) sbuf.append("|olWindows");
      if ((value & 2) != 0) sbuf.append("|olPassport");
      return sbuf.toString();
      }
    }
  }
}
