/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0013.
 * Enumerates source network (network of origin) types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0013 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0013 ucSourceNetworkUnknown = new __MIDL___MIDL_itf_uc_0001_0004_0013(0);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0013 ucSourceNetworkEnterprise = new __MIDL___MIDL_itf_uc_0001_0004_0013(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0013 ucSourceNetworkFederatedEnterprise = new __MIDL___MIDL_itf_uc_0001_0004_0013(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0013 ucSourceNetworkFederatedPublic = new __MIDL___MIDL_itf_uc_0001_0004_0013(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucSourceNetworkUnknown = 0;
  public final static int _ucSourceNetworkEnterprise = 1;
  public final static int _ucSourceNetworkFederatedEnterprise = 2;
  public final static int _ucSourceNetworkFederatedPublic = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0013(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0004_0013 valueOf(int value) {
    switch(value) {
    case 0: return ucSourceNetworkUnknown;
    case 1: return ucSourceNetworkEnterprise;
    case 2: return ucSourceNetworkFederatedEnterprise;
    case 3: return ucSourceNetworkFederatedPublic;
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0013(value);
    }
  }
}
