/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmMousePointer.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{593104F8-16BA-101B-989C-00006B82871A}")
public class fmMousePointer implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmMousePointer fmMousePointerDefault = new fmMousePointer(0);
  public final static fmMousePointer fmMousePointerArrow = new fmMousePointer(1);
  public final static fmMousePointer fmMousePointerCross = new fmMousePointer(2);
  public final static fmMousePointer fmMousePointerIBeam = new fmMousePointer(3);
  public final static fmMousePointer fmMousePointerSizeNESW = new fmMousePointer(6);
  public final static fmMousePointer fmMousePointerSizeNS = new fmMousePointer(7);
  public final static fmMousePointer fmMousePointerSizeNWSE = new fmMousePointer(8);
  public final static fmMousePointer fmMousePointerSizeWE = new fmMousePointer(9);
  public final static fmMousePointer fmMousePointerUpArrow = new fmMousePointer(10);
  public final static fmMousePointer fmMousePointerHourGlass = new fmMousePointer(11);
  public final static fmMousePointer fmMousePointerNoDrop = new fmMousePointer(12);
  public final static fmMousePointer fmMousePointerAppStarting = new fmMousePointer(13);
  public final static fmMousePointer fmMousePointerHelp = new fmMousePointer(14);
  public final static fmMousePointer fmMousePointerSizeAll = new fmMousePointer(15);
  public final static fmMousePointer fmMousePointerCustom = new fmMousePointer(99);

  // Integer constants for bitsets and switch statements
  public final static int _fmMousePointerDefault = 0;
  public final static int _fmMousePointerArrow = 1;
  public final static int _fmMousePointerCross = 2;
  public final static int _fmMousePointerIBeam = 3;
  public final static int _fmMousePointerSizeNESW = 6;
  public final static int _fmMousePointerSizeNS = 7;
  public final static int _fmMousePointerSizeNWSE = 8;
  public final static int _fmMousePointerSizeWE = 9;
  public final static int _fmMousePointerUpArrow = 10;
  public final static int _fmMousePointerHourGlass = 11;
  public final static int _fmMousePointerNoDrop = 12;
  public final static int _fmMousePointerAppStarting = 13;
  public final static int _fmMousePointerHelp = 14;
  public final static int _fmMousePointerSizeAll = 15;
  public final static int _fmMousePointerCustom = 99;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmMousePointer(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmMousePointer valueOf(int value) {
    switch(value) {
    case 0: return fmMousePointerDefault;
    case 1: return fmMousePointerArrow;
    case 2: return fmMousePointerCross;
    case 3: return fmMousePointerIBeam;
    case 6: return fmMousePointerSizeNESW;
    case 7: return fmMousePointerSizeNS;
    case 8: return fmMousePointerSizeNWSE;
    case 9: return fmMousePointerSizeWE;
    case 10: return fmMousePointerUpArrow;
    case 11: return fmMousePointerHourGlass;
    case 12: return fmMousePointerNoDrop;
    case 13: return fmMousePointerAppStarting;
    case 14: return fmMousePointerHelp;
    case 15: return fmMousePointerSizeAll;
    case 99: return fmMousePointerCustom;
    default: return new fmMousePointer(value);
    }
  }

  public String toString() {
    switch(value) {
    case 8: return "fmMousePointerSizeNWSE";
    case 0: return "fmMousePointerDefault";
    case 10: return "fmMousePointerUpArrow";
    case 9: return "fmMousePointerSizeWE";
    case 1: return "fmMousePointerArrow";
    case 2: return "fmMousePointerCross";
    case 3: return "fmMousePointerIBeam";
    case 6: return "fmMousePointerSizeNESW";
    case 7: return "fmMousePointerSizeNS";
    case 11: return "fmMousePointerHourGlass";
    case 12: return "fmMousePointerNoDrop";
    case 13: return "fmMousePointerAppStarting";
    case 14: return "fmMousePointerHelp";
    case 15: return "fmMousePointerSizeAll";
    case 99: return "fmMousePointerCustom";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 8) != 0) sbuf.append("|fmMousePointerSizeNWSE");
      if ((value & 0) != 0) sbuf.append("|fmMousePointerDefault");
      if ((value & 10) != 0) sbuf.append("|fmMousePointerUpArrow");
      if ((value & 9) != 0) sbuf.append("|fmMousePointerSizeWE");
      if ((value & 1) != 0) sbuf.append("|fmMousePointerArrow");
      if ((value & 2) != 0) sbuf.append("|fmMousePointerCross");
      if ((value & 3) != 0) sbuf.append("|fmMousePointerIBeam");
      if ((value & 6) != 0) sbuf.append("|fmMousePointerSizeNESW");
      if ((value & 7) != 0) sbuf.append("|fmMousePointerSizeNS");
      if ((value & 11) != 0) sbuf.append("|fmMousePointerHourGlass");
      if ((value & 12) != 0) sbuf.append("|fmMousePointerNoDrop");
      if ((value & 13) != 0) sbuf.append("|fmMousePointerAppStarting");
      if ((value & 14) != 0) sbuf.append("|fmMousePointerHelp");
      if ((value & 15) != 0) sbuf.append("|fmMousePointerSizeAll");
      if ((value & 99) != 0) sbuf.append("|fmMousePointerCustom");
      return sbuf.toString();
      }
    }
  }
}
