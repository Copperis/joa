/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAttachmentBlockLevel.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlAttachmentBlockLevel {

  // Typed constants
  public final static OlAttachmentBlockLevel olAttachmentBlockLevelNone = new OlAttachmentBlockLevel(0);
  public final static OlAttachmentBlockLevel olAttachmentBlockLevelOpen = new OlAttachmentBlockLevel(1);

  // Integer constants for bitsets and switch statements
  public final static int _olAttachmentBlockLevelNone = 0;
  public final static int _olAttachmentBlockLevelOpen = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlAttachmentBlockLevel(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlAttachmentBlockLevel valueOf(int value) {
    switch(value) {
    case 0: return olAttachmentBlockLevelNone;
    case 1: return olAttachmentBlockLevelOpen;
    default: return new OlAttachmentBlockLevel(value);
    }
  }
}
