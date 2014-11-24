/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0002.
 * Enumerates the group actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0002 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0002 ucGroupAddContact = new __MIDL___MIDL_itf_uc_0001_0004_0002(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0002 ucGroupRemoveContact = new __MIDL___MIDL_itf_uc_0001_0004_0002(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0002 ucGroupDeleteGroup = new __MIDL___MIDL_itf_uc_0001_0004_0002(3);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0002 ucGroupRenameGroup = new __MIDL___MIDL_itf_uc_0001_0004_0002(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucGroupAddContact = 1;
  public final static int _ucGroupRemoveContact = 2;
  public final static int _ucGroupDeleteGroup = 3;
  public final static int _ucGroupRenameGroup = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0002(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0004_0002 valueOf(int value) {
    switch(value) {
    case 1: return ucGroupAddContact;
    case 2: return ucGroupRemoveContact;
    case 3: return ucGroupDeleteGroup;
    case 4: return ucGroupRenameGroup;
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0002(value);
    }
  }
}
