/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTaskStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlTaskStatus implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlTaskStatus olTaskNotStarted = new OlTaskStatus(0);
  public final static OlTaskStatus olTaskInProgress = new OlTaskStatus(1);
  public final static OlTaskStatus olTaskComplete = new OlTaskStatus(2);
  public final static OlTaskStatus olTaskWaiting = new OlTaskStatus(3);
  public final static OlTaskStatus olTaskDeferred = new OlTaskStatus(4);

  // Integer constants for bitsets and switch statements
  public final static int _olTaskNotStarted = 0;
  public final static int _olTaskInProgress = 1;
  public final static int _olTaskComplete = 2;
  public final static int _olTaskWaiting = 3;
  public final static int _olTaskDeferred = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlTaskStatus(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlTaskStatus valueOf(int value) {
    switch(value) {
    case 0: return olTaskNotStarted;
    case 1: return olTaskInProgress;
    case 2: return olTaskComplete;
    case 3: return olTaskWaiting;
    case 4: return olTaskDeferred;
    default: return new OlTaskStatus(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olTaskNotStarted";
    case 1: return "olTaskInProgress";
    case 2: return "olTaskComplete";
    case 3: return "olTaskWaiting";
    case 4: return "olTaskDeferred";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olTaskNotStarted");
      if ((value & 1) != 0) sbuf.append("|olTaskInProgress");
      if ((value & 2) != 0) sbuf.append("|olTaskComplete");
      if ((value & 3) != 0) sbuf.append("|olTaskWaiting");
      if ((value & 4) != 0) sbuf.append("|olTaskDeferred");
      return sbuf.toString();
      }
    }
  }
}
