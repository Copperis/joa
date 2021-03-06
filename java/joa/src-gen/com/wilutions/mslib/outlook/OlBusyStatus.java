/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlBusyStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlBusyStatus implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlBusyStatus olFree = new OlBusyStatus(0);
  public final static OlBusyStatus olTentative = new OlBusyStatus(1);
  public final static OlBusyStatus olBusy = new OlBusyStatus(2);
  public final static OlBusyStatus olOutOfOffice = new OlBusyStatus(3);
  public final static OlBusyStatus olWorkingElsewhere = new OlBusyStatus(4);

  // Integer constants for bitsets and switch statements
  public final static int _olFree = 0;
  public final static int _olTentative = 1;
  public final static int _olBusy = 2;
  public final static int _olOutOfOffice = 3;
  public final static int _olWorkingElsewhere = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlBusyStatus(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlBusyStatus valueOf(int value) {
    switch(value) {
    case 0: return olFree;
    case 1: return olTentative;
    case 2: return olBusy;
    case 3: return olOutOfOffice;
    case 4: return olWorkingElsewhere;
    default: return new OlBusyStatus(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olFree";
    case 1: return "olTentative";
    case 2: return "olBusy";
    case 3: return "olOutOfOffice";
    case 4: return "olWorkingElsewhere";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olFree");
      if ((value & 1) != 0) sbuf.append("|olTentative");
      if ((value & 2) != 0) sbuf.append("|olBusy");
      if ((value & 3) != 0) sbuf.append("|olOutOfOffice");
      if ((value & 4) != 0) sbuf.append("|olWorkingElsewhere");
      return sbuf.toString();
      }
    }
  }
}
