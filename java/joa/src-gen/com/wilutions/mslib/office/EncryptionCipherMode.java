/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * EncryptionCipherMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class EncryptionCipherMode {

  // Typed constants
  public final static EncryptionCipherMode cipherModeECB = new EncryptionCipherMode(0);
  public final static EncryptionCipherMode cipherModeCBC = new EncryptionCipherMode(1);

  // Integer constants for bitsets and switch statements
  public final static int _cipherModeECB = 0;
  public final static int _cipherModeCBC = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private EncryptionCipherMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  EncryptionCipherMode valueOf(int value) {
    switch(value) {
    case 0: return cipherModeECB;
    case 1: return cipherModeCBC;
    default: return new EncryptionCipherMode(value);
    }
  }
}
