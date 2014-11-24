/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0213_0005.
 * Enumerates supported ConversationWindow actions 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0213_0005 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0213_0005 ucConversationWindowActionAddOfficePowerPoint = new __MIDL___MIDL_itf_uc_0001_0213_0005(0);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0005 ucConversationWindowActionAddOfficeOneNote = new __MIDL___MIDL_itf_uc_0001_0213_0005(1);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0005 ucConversationWindowFullScreen = new __MIDL___MIDL_itf_uc_0001_0213_0005(2);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0005 ucConversationWindowActionMAX = new __MIDL___MIDL_itf_uc_0001_0213_0005(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationWindowActionAddOfficePowerPoint = 0;
  public final static int _ucConversationWindowActionAddOfficeOneNote = 1;
  public final static int _ucConversationWindowFullScreen = 2;
  public final static int _ucConversationWindowActionMAX = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0213_0005(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0213_0005 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationWindowActionAddOfficePowerPoint;
    case 1: return ucConversationWindowActionAddOfficeOneNote;
    case 2: return ucConversationWindowFullScreen;
    case 3: return ucConversationWindowActionMAX;
    default: return new __MIDL___MIDL_itf_uc_0001_0213_0005(value);
    }
  }
}
