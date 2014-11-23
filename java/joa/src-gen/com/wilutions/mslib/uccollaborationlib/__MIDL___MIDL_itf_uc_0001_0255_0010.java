/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0010.
 * Enumerates the capabilities that for preferred client. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0255_0010 {
  ucCapabilityUserActivity(1),
  ucCapabilityText(2),
  ucCapabilityGifInk(4),
  ucCapabilityIsfInk(8),
  ucCapabilityAudio(16),
  ucCapabilityVideo(32),
  ucCapabilityCccp(64),
  ucCapabilityCalendar(128),
  ucCapabilityRemoteCallControl(256),
  ucCapabilityBreakthrough(512),
  ucCapabilityApplicationSharing(1024);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0255_0010(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0255_0010 valueOf(int value) {
    switch(value) {
    case 1: return ucCapabilityUserActivity;
    case 2: return ucCapabilityText;
    case 4: return ucCapabilityGifInk;
    case 8: return ucCapabilityIsfInk;
    case 16: return ucCapabilityAudio;
    case 32: return ucCapabilityVideo;
    case 64: return ucCapabilityCccp;
    case 128: return ucCapabilityCalendar;
    case 256: return ucCapabilityRemoteCallControl;
    case 512: return ucCapabilityBreakthrough;
    case 1024: return ucCapabilityApplicationSharing;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0255_0010.class);
    }
  }
}
