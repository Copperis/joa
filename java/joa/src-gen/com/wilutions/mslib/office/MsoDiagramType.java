/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDiagramType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoDiagramType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoDiagramType msoDiagramMixed = new MsoDiagramType(-2);
  public final static MsoDiagramType msoDiagramOrgChart = new MsoDiagramType(1);
  public final static MsoDiagramType msoDiagramCycle = new MsoDiagramType(2);
  public final static MsoDiagramType msoDiagramRadial = new MsoDiagramType(3);
  public final static MsoDiagramType msoDiagramPyramid = new MsoDiagramType(4);
  public final static MsoDiagramType msoDiagramVenn = new MsoDiagramType(5);
  public final static MsoDiagramType msoDiagramTarget = new MsoDiagramType(6);

  // Integer constants for bitsets and switch statements
  public final static int _msoDiagramMixed = -2;
  public final static int _msoDiagramOrgChart = 1;
  public final static int _msoDiagramCycle = 2;
  public final static int _msoDiagramRadial = 3;
  public final static int _msoDiagramPyramid = 4;
  public final static int _msoDiagramVenn = 5;
  public final static int _msoDiagramTarget = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoDiagramType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoDiagramType valueOf(int value) {
    switch(value) {
    case -2: return msoDiagramMixed;
    case 1: return msoDiagramOrgChart;
    case 2: return msoDiagramCycle;
    case 3: return msoDiagramRadial;
    case 4: return msoDiagramPyramid;
    case 5: return msoDiagramVenn;
    case 6: return msoDiagramTarget;
    default: return new MsoDiagramType(value);
    }
  }
}
