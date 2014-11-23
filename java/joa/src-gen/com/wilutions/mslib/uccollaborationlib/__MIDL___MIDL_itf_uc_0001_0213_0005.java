/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0213_0005.
 * Enumerates supported ConversationWindow actions 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0213_0005 {
  ucConversationWindowActionAddOfficePowerPoint(0),
  ucConversationWindowActionAddOfficeOneNote(1),
  ucConversationWindowFullScreen(2),
  ucConversationWindowActionMAX(3);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0213_0005(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0213_0005 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationWindowActionAddOfficePowerPoint;
    case 1: return ucConversationWindowActionAddOfficeOneNote;
    case 2: return ucConversationWindowFullScreen;
    case 3: return ucConversationWindowActionMAX;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0213_0005.class);
    }
  }
}
