/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileValidationMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFileValidationMode {

  // Typed constants
  public final static MsoFileValidationMode msoFileValidationDefault = new MsoFileValidationMode(0);
  public final static MsoFileValidationMode msoFileValidationSkip = new MsoFileValidationMode(1);

  // Integer constants for bitsets and switch statements
  public final static int _msoFileValidationDefault = 0;
  public final static int _msoFileValidationSkip = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFileValidationMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFileValidationMode valueOf(int value) {
    switch(value) {
    case 0: return msoFileValidationDefault;
    case 1: return msoFileValidationSkip;
    default: return new MsoFileValidationMode(value);
    }
  }
}
