/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMeetingStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlMeetingStatus {

  // Typed constants
  public final static OlMeetingStatus olNonMeeting = new OlMeetingStatus(0);
  public final static OlMeetingStatus olMeeting = new OlMeetingStatus(1);
  public final static OlMeetingStatus olMeetingReceived = new OlMeetingStatus(3);
  public final static OlMeetingStatus olMeetingCanceled = new OlMeetingStatus(5);
  public final static OlMeetingStatus olMeetingReceivedAndCanceled = new OlMeetingStatus(7);

  // Integer constants for bitsets and switch statements
  public final static int _olNonMeeting = 0;
  public final static int _olMeeting = 1;
  public final static int _olMeetingReceived = 3;
  public final static int _olMeetingCanceled = 5;
  public final static int _olMeetingReceivedAndCanceled = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlMeetingStatus(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlMeetingStatus valueOf(int value) {
    switch(value) {
    case 0: return olNonMeeting;
    case 1: return olMeeting;
    case 3: return olMeetingReceived;
    case 5: return olMeetingCanceled;
    case 7: return olMeetingReceivedAndCanceled;
    default: return new OlMeetingStatus(value);
    }
  }
}
