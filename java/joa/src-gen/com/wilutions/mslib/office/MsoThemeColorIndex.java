/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoThemeColorIndex.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoThemeColorIndex {

  // Typed constants
  public final static MsoThemeColorIndex msoThemeColorMixed = new MsoThemeColorIndex(-2);
  public final static MsoThemeColorIndex msoNotThemeColor = new MsoThemeColorIndex(0);
  public final static MsoThemeColorIndex msoThemeColorDark1 = new MsoThemeColorIndex(1);
  public final static MsoThemeColorIndex msoThemeColorLight1 = new MsoThemeColorIndex(2);
  public final static MsoThemeColorIndex msoThemeColorDark2 = new MsoThemeColorIndex(3);
  public final static MsoThemeColorIndex msoThemeColorLight2 = new MsoThemeColorIndex(4);
  public final static MsoThemeColorIndex msoThemeColorAccent1 = new MsoThemeColorIndex(5);
  public final static MsoThemeColorIndex msoThemeColorAccent2 = new MsoThemeColorIndex(6);
  public final static MsoThemeColorIndex msoThemeColorAccent3 = new MsoThemeColorIndex(7);
  public final static MsoThemeColorIndex msoThemeColorAccent4 = new MsoThemeColorIndex(8);
  public final static MsoThemeColorIndex msoThemeColorAccent5 = new MsoThemeColorIndex(9);
  public final static MsoThemeColorIndex msoThemeColorAccent6 = new MsoThemeColorIndex(10);
  public final static MsoThemeColorIndex msoThemeColorHyperlink = new MsoThemeColorIndex(11);
  public final static MsoThemeColorIndex msoThemeColorFollowedHyperlink = new MsoThemeColorIndex(12);
  public final static MsoThemeColorIndex msoThemeColorText1 = new MsoThemeColorIndex(13);
  public final static MsoThemeColorIndex msoThemeColorBackground1 = new MsoThemeColorIndex(14);
  public final static MsoThemeColorIndex msoThemeColorText2 = new MsoThemeColorIndex(15);
  public final static MsoThemeColorIndex msoThemeColorBackground2 = new MsoThemeColorIndex(16);

  // Integer constants for bitsets and switch statements
  public final static int _msoThemeColorMixed = -2;
  public final static int _msoNotThemeColor = 0;
  public final static int _msoThemeColorDark1 = 1;
  public final static int _msoThemeColorLight1 = 2;
  public final static int _msoThemeColorDark2 = 3;
  public final static int _msoThemeColorLight2 = 4;
  public final static int _msoThemeColorAccent1 = 5;
  public final static int _msoThemeColorAccent2 = 6;
  public final static int _msoThemeColorAccent3 = 7;
  public final static int _msoThemeColorAccent4 = 8;
  public final static int _msoThemeColorAccent5 = 9;
  public final static int _msoThemeColorAccent6 = 10;
  public final static int _msoThemeColorHyperlink = 11;
  public final static int _msoThemeColorFollowedHyperlink = 12;
  public final static int _msoThemeColorText1 = 13;
  public final static int _msoThemeColorBackground1 = 14;
  public final static int _msoThemeColorText2 = 15;
  public final static int _msoThemeColorBackground2 = 16;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoThemeColorIndex(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoThemeColorIndex valueOf(int value) {
    switch(value) {
    case -2: return msoThemeColorMixed;
    case 0: return msoNotThemeColor;
    case 1: return msoThemeColorDark1;
    case 2: return msoThemeColorLight1;
    case 3: return msoThemeColorDark2;
    case 4: return msoThemeColorLight2;
    case 5: return msoThemeColorAccent1;
    case 6: return msoThemeColorAccent2;
    case 7: return msoThemeColorAccent3;
    case 8: return msoThemeColorAccent4;
    case 9: return msoThemeColorAccent5;
    case 10: return msoThemeColorAccent6;
    case 11: return msoThemeColorHyperlink;
    case 12: return msoThemeColorFollowedHyperlink;
    case 13: return msoThemeColorText1;
    case 14: return msoThemeColorBackground1;
    case 15: return msoThemeColorText2;
    case 16: return msoThemeColorBackground2;
    default: return new MsoThemeColorIndex(value);
    }
  }
}
