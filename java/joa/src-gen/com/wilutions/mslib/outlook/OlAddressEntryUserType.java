/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAddressEntryUserType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlAddressEntryUserType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlAddressEntryUserType olExchangeUserAddressEntry = new OlAddressEntryUserType(0);
  public final static OlAddressEntryUserType olExchangeDistributionListAddressEntry = new OlAddressEntryUserType(1);
  public final static OlAddressEntryUserType olExchangePublicFolderAddressEntry = new OlAddressEntryUserType(2);
  public final static OlAddressEntryUserType olExchangeAgentAddressEntry = new OlAddressEntryUserType(3);
  public final static OlAddressEntryUserType olExchangeOrganizationAddressEntry = new OlAddressEntryUserType(4);
  public final static OlAddressEntryUserType olExchangeRemoteUserAddressEntry = new OlAddressEntryUserType(5);
  public final static OlAddressEntryUserType olOutlookContactAddressEntry = new OlAddressEntryUserType(10);
  public final static OlAddressEntryUserType olOutlookDistributionListAddressEntry = new OlAddressEntryUserType(11);
  public final static OlAddressEntryUserType olLdapAddressEntry = new OlAddressEntryUserType(20);
  public final static OlAddressEntryUserType olSmtpAddressEntry = new OlAddressEntryUserType(30);
  public final static OlAddressEntryUserType olOtherAddressEntry = new OlAddressEntryUserType(40);

  // Integer constants for bitsets and switch statements
  public final static int _olExchangeUserAddressEntry = 0;
  public final static int _olExchangeDistributionListAddressEntry = 1;
  public final static int _olExchangePublicFolderAddressEntry = 2;
  public final static int _olExchangeAgentAddressEntry = 3;
  public final static int _olExchangeOrganizationAddressEntry = 4;
  public final static int _olExchangeRemoteUserAddressEntry = 5;
  public final static int _olOutlookContactAddressEntry = 10;
  public final static int _olOutlookDistributionListAddressEntry = 11;
  public final static int _olLdapAddressEntry = 20;
  public final static int _olSmtpAddressEntry = 30;
  public final static int _olOtherAddressEntry = 40;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlAddressEntryUserType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlAddressEntryUserType valueOf(int value) {
    switch(value) {
    case 0: return olExchangeUserAddressEntry;
    case 1: return olExchangeDistributionListAddressEntry;
    case 2: return olExchangePublicFolderAddressEntry;
    case 3: return olExchangeAgentAddressEntry;
    case 4: return olExchangeOrganizationAddressEntry;
    case 5: return olExchangeRemoteUserAddressEntry;
    case 10: return olOutlookContactAddressEntry;
    case 11: return olOutlookDistributionListAddressEntry;
    case 20: return olLdapAddressEntry;
    case 30: return olSmtpAddressEntry;
    case 40: return olOtherAddressEntry;
    default: return new OlAddressEntryUserType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olExchangeUserAddressEntry";
    case 10: return "olOutlookContactAddressEntry";
    case 20: return "olLdapAddressEntry";
    case 11: return "olOutlookDistributionListAddressEntry";
    case 1: return "olExchangeDistributionListAddressEntry";
    case 2: return "olExchangePublicFolderAddressEntry";
    case 3: return "olExchangeAgentAddressEntry";
    case 4: return "olExchangeOrganizationAddressEntry";
    case 5: return "olExchangeRemoteUserAddressEntry";
    case 30: return "olSmtpAddressEntry";
    case 40: return "olOtherAddressEntry";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olExchangeUserAddressEntry");
      if ((value & 10) != 0) sbuf.append("|olOutlookContactAddressEntry");
      if ((value & 20) != 0) sbuf.append("|olLdapAddressEntry");
      if ((value & 11) != 0) sbuf.append("|olOutlookDistributionListAddressEntry");
      if ((value & 1) != 0) sbuf.append("|olExchangeDistributionListAddressEntry");
      if ((value & 2) != 0) sbuf.append("|olExchangePublicFolderAddressEntry");
      if ((value & 3) != 0) sbuf.append("|olExchangeAgentAddressEntry");
      if ((value & 4) != 0) sbuf.append("|olExchangeOrganizationAddressEntry");
      if ((value & 5) != 0) sbuf.append("|olExchangeRemoteUserAddressEntry");
      if ((value & 30) != 0) sbuf.append("|olSmtpAddressEntry");
      if ((value & 40) != 0) sbuf.append("|olOtherAddressEntry");
      return sbuf.toString();
      }
    }
  }
}
