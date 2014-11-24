/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0013.
 * Enumerates actions of which IUCOfficeIntegrationHelper can notify. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0255_0013 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0255_0013 oiActionStartup = new __MIDL___MIDL_itf_uc_0001_0255_0013(0);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0013 oiActionShutdown = new __MIDL___MIDL_itf_uc_0001_0255_0013(1);

  // Integer constants for bitsets and switch statements
  public final static int _oiActionStartup = 0;
  public final static int _oiActionShutdown = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0255_0013(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0255_0013 valueOf(int value) {
    switch(value) {
    case 0: return oiActionStartup;
    case 1: return oiActionShutdown;
    default: return new __MIDL___MIDL_itf_uc_0001_0255_0013(value);
    }
  }
}
