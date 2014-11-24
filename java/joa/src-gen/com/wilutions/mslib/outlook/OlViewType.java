/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlViewType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlViewType {

  // Typed constants
  public final static OlViewType olTableView = new OlViewType(0);
  public final static OlViewType olCardView = new OlViewType(1);
  public final static OlViewType olCalendarView = new OlViewType(2);
  public final static OlViewType olIconView = new OlViewType(3);
  public final static OlViewType olTimelineView = new OlViewType(4);
  public final static OlViewType olBusinessCardView = new OlViewType(5);
  public final static OlViewType olDailyTaskListView = new OlViewType(6);
  public final static OlViewType olPeopleView = new OlViewType(7);

  // Integer constants for bitsets and switch statements
  public final static int _olTableView = 0;
  public final static int _olCardView = 1;
  public final static int _olCalendarView = 2;
  public final static int _olIconView = 3;
  public final static int _olTimelineView = 4;
  public final static int _olBusinessCardView = 5;
  public final static int _olDailyTaskListView = 6;
  public final static int _olPeopleView = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlViewType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlViewType valueOf(int value) {
    switch(value) {
    case 0: return olTableView;
    case 1: return olCardView;
    case 2: return olCalendarView;
    case 3: return olIconView;
    case 4: return olTimelineView;
    case 5: return olBusinessCardView;
    case 6: return olDailyTaskListView;
    case 7: return olPeopleView;
    default: return new OlViewType(value);
    }
  }
}
