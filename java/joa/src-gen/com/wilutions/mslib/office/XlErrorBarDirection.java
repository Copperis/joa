/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlErrorBarDirection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlErrorBarDirection {

  // Typed constants
  public final static XlErrorBarDirection xlChartX = new XlErrorBarDirection(-4168);
  public final static XlErrorBarDirection xlChartY = new XlErrorBarDirection(1);

  // Integer constants for bitsets and switch statements
  public final static int _xlChartX = -4168;
  public final static int _xlChartY = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlErrorBarDirection(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlErrorBarDirection valueOf(int value) {
    switch(value) {
    case -4168: return xlChartX;
    case 1: return xlChartY;
    default: return new XlErrorBarDirection(value);
    }
  }
}
