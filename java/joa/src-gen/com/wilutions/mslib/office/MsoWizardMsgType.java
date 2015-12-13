/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoWizardMsgType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoWizardMsgType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoWizardMsgType msoWizardMsgLocalStateOn = new MsoWizardMsgType(1);
  public final static MsoWizardMsgType msoWizardMsgLocalStateOff = new MsoWizardMsgType(2);
  public final static MsoWizardMsgType msoWizardMsgShowHelp = new MsoWizardMsgType(3);
  public final static MsoWizardMsgType msoWizardMsgSuspending = new MsoWizardMsgType(4);
  public final static MsoWizardMsgType msoWizardMsgResuming = new MsoWizardMsgType(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoWizardMsgLocalStateOn = 1;
  public final static int _msoWizardMsgLocalStateOff = 2;
  public final static int _msoWizardMsgShowHelp = 3;
  public final static int _msoWizardMsgSuspending = 4;
  public final static int _msoWizardMsgResuming = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoWizardMsgType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoWizardMsgType valueOf(int value) {
    switch(value) {
    case 1: return msoWizardMsgLocalStateOn;
    case 2: return msoWizardMsgLocalStateOff;
    case 3: return msoWizardMsgShowHelp;
    case 4: return msoWizardMsgSuspending;
    case 5: return msoWizardMsgResuming;
    default: return new MsoWizardMsgType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "msoWizardMsgLocalStateOn";
    case 2: return "msoWizardMsgLocalStateOff";
    case 3: return "msoWizardMsgShowHelp";
    case 4: return "msoWizardMsgSuspending";
    case 5: return "msoWizardMsgResuming";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|msoWizardMsgLocalStateOn");
      if ((value & 2) != 0) sbuf.append("|msoWizardMsgLocalStateOff");
      if ((value & 3) != 0) sbuf.append("|msoWizardMsgShowHelp");
      if ((value & 4) != 0) sbuf.append("|msoWizardMsgSuspending");
      if ((value & 5) != 0) sbuf.append("|msoWizardMsgResuming");
      return sbuf.toString();
      }
    }
  }
}
