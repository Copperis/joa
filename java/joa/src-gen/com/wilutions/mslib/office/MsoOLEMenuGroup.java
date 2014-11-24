/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoOLEMenuGroup.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoOLEMenuGroup {

  // Typed constants
  public final static MsoOLEMenuGroup msoOLEMenuGroupNone = new MsoOLEMenuGroup(-1);
  public final static MsoOLEMenuGroup msoOLEMenuGroupFile = new MsoOLEMenuGroup(0);
  public final static MsoOLEMenuGroup msoOLEMenuGroupEdit = new MsoOLEMenuGroup(1);
  public final static MsoOLEMenuGroup msoOLEMenuGroupContainer = new MsoOLEMenuGroup(2);
  public final static MsoOLEMenuGroup msoOLEMenuGroupObject = new MsoOLEMenuGroup(3);
  public final static MsoOLEMenuGroup msoOLEMenuGroupWindow = new MsoOLEMenuGroup(4);
  public final static MsoOLEMenuGroup msoOLEMenuGroupHelp = new MsoOLEMenuGroup(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoOLEMenuGroupNone = -1;
  public final static int _msoOLEMenuGroupFile = 0;
  public final static int _msoOLEMenuGroupEdit = 1;
  public final static int _msoOLEMenuGroupContainer = 2;
  public final static int _msoOLEMenuGroupObject = 3;
  public final static int _msoOLEMenuGroupWindow = 4;
  public final static int _msoOLEMenuGroupHelp = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoOLEMenuGroup(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoOLEMenuGroup valueOf(int value) {
    switch(value) {
    case -1: return msoOLEMenuGroupNone;
    case 0: return msoOLEMenuGroupFile;
    case 1: return msoOLEMenuGroupEdit;
    case 2: return msoOLEMenuGroupContainer;
    case 3: return msoOLEMenuGroupObject;
    case 4: return msoOLEMenuGroupWindow;
    case 5: return msoOLEMenuGroupHelp;
    default: return new MsoOLEMenuGroup(value);
    }
  }
}
