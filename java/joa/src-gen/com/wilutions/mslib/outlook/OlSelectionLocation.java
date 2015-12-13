/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSelectionLocation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlSelectionLocation implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlSelectionLocation olViewList = new OlSelectionLocation(0);
  public final static OlSelectionLocation olToDoBarTaskList = new OlSelectionLocation(1);
  public final static OlSelectionLocation olToDoBarAppointmentList = new OlSelectionLocation(2);
  public final static OlSelectionLocation olDailyTaskList = new OlSelectionLocation(3);
  public final static OlSelectionLocation olAttachmentWell = new OlSelectionLocation(4);

  // Integer constants for bitsets and switch statements
  public final static int _olViewList = 0;
  public final static int _olToDoBarTaskList = 1;
  public final static int _olToDoBarAppointmentList = 2;
  public final static int _olDailyTaskList = 3;
  public final static int _olAttachmentWell = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlSelectionLocation(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlSelectionLocation valueOf(int value) {
    switch(value) {
    case 0: return olViewList;
    case 1: return olToDoBarTaskList;
    case 2: return olToDoBarAppointmentList;
    case 3: return olDailyTaskList;
    case 4: return olAttachmentWell;
    default: return new OlSelectionLocation(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olViewList";
    case 1: return "olToDoBarTaskList";
    case 2: return "olToDoBarAppointmentList";
    case 3: return "olDailyTaskList";
    case 4: return "olAttachmentWell";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olViewList");
      if ((value & 1) != 0) sbuf.append("|olToDoBarTaskList");
      if ((value & 2) != 0) sbuf.append("|olToDoBarAppointmentList");
      if ((value & 3) != 0) sbuf.append("|olDailyTaskList");
      if ((value & 4) != 0) sbuf.append("|olAttachmentWell");
      return sbuf.toString();
      }
    }
  }
}
