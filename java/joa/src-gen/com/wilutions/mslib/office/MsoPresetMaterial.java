/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetMaterial.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoPresetMaterial implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoPresetMaterial msoPresetMaterialMixed = new MsoPresetMaterial(-2);
  public final static MsoPresetMaterial msoMaterialMatte = new MsoPresetMaterial(1);
  public final static MsoPresetMaterial msoMaterialPlastic = new MsoPresetMaterial(2);
  public final static MsoPresetMaterial msoMaterialMetal = new MsoPresetMaterial(3);
  public final static MsoPresetMaterial msoMaterialWireFrame = new MsoPresetMaterial(4);
  public final static MsoPresetMaterial msoMaterialMatte2 = new MsoPresetMaterial(5);
  public final static MsoPresetMaterial msoMaterialPlastic2 = new MsoPresetMaterial(6);
  public final static MsoPresetMaterial msoMaterialMetal2 = new MsoPresetMaterial(7);
  public final static MsoPresetMaterial msoMaterialWarmMatte = new MsoPresetMaterial(8);
  public final static MsoPresetMaterial msoMaterialTranslucentPowder = new MsoPresetMaterial(9);
  public final static MsoPresetMaterial msoMaterialPowder = new MsoPresetMaterial(10);
  public final static MsoPresetMaterial msoMaterialDarkEdge = new MsoPresetMaterial(11);
  public final static MsoPresetMaterial msoMaterialSoftEdge = new MsoPresetMaterial(12);
  public final static MsoPresetMaterial msoMaterialClear = new MsoPresetMaterial(13);
  public final static MsoPresetMaterial msoMaterialFlat = new MsoPresetMaterial(14);
  public final static MsoPresetMaterial msoMaterialSoftMetal = new MsoPresetMaterial(15);

  // Integer constants for bitsets and switch statements
  public final static int _msoPresetMaterialMixed = -2;
  public final static int _msoMaterialMatte = 1;
  public final static int _msoMaterialPlastic = 2;
  public final static int _msoMaterialMetal = 3;
  public final static int _msoMaterialWireFrame = 4;
  public final static int _msoMaterialMatte2 = 5;
  public final static int _msoMaterialPlastic2 = 6;
  public final static int _msoMaterialMetal2 = 7;
  public final static int _msoMaterialWarmMatte = 8;
  public final static int _msoMaterialTranslucentPowder = 9;
  public final static int _msoMaterialPowder = 10;
  public final static int _msoMaterialDarkEdge = 11;
  public final static int _msoMaterialSoftEdge = 12;
  public final static int _msoMaterialClear = 13;
  public final static int _msoMaterialFlat = 14;
  public final static int _msoMaterialSoftMetal = 15;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoPresetMaterial(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoPresetMaterial valueOf(int value) {
    switch(value) {
    case -2: return msoPresetMaterialMixed;
    case 1: return msoMaterialMatte;
    case 2: return msoMaterialPlastic;
    case 3: return msoMaterialMetal;
    case 4: return msoMaterialWireFrame;
    case 5: return msoMaterialMatte2;
    case 6: return msoMaterialPlastic2;
    case 7: return msoMaterialMetal2;
    case 8: return msoMaterialWarmMatte;
    case 9: return msoMaterialTranslucentPowder;
    case 10: return msoMaterialPowder;
    case 11: return msoMaterialDarkEdge;
    case 12: return msoMaterialSoftEdge;
    case 13: return msoMaterialClear;
    case 14: return msoMaterialFlat;
    case 15: return msoMaterialSoftMetal;
    default: return new MsoPresetMaterial(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "msoPresetMaterialMixed";
    case 2: return "msoMaterialPlastic";
    case 1: return "msoMaterialMatte";
    case 3: return "msoMaterialMetal";
    case 4: return "msoMaterialWireFrame";
    case 5: return "msoMaterialMatte2";
    case 6: return "msoMaterialPlastic2";
    case 7: return "msoMaterialMetal2";
    case 8: return "msoMaterialWarmMatte";
    case 9: return "msoMaterialTranslucentPowder";
    case 10: return "msoMaterialPowder";
    case 11: return "msoMaterialDarkEdge";
    case 12: return "msoMaterialSoftEdge";
    case 13: return "msoMaterialClear";
    case 14: return "msoMaterialFlat";
    case 15: return "msoMaterialSoftMetal";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoPresetMaterialMixed");
      if ((value & 2) != 0) sbuf.append("|msoMaterialPlastic");
      if ((value & 1) != 0) sbuf.append("|msoMaterialMatte");
      if ((value & 3) != 0) sbuf.append("|msoMaterialMetal");
      if ((value & 4) != 0) sbuf.append("|msoMaterialWireFrame");
      if ((value & 5) != 0) sbuf.append("|msoMaterialMatte2");
      if ((value & 6) != 0) sbuf.append("|msoMaterialPlastic2");
      if ((value & 7) != 0) sbuf.append("|msoMaterialMetal2");
      if ((value & 8) != 0) sbuf.append("|msoMaterialWarmMatte");
      if ((value & 9) != 0) sbuf.append("|msoMaterialTranslucentPowder");
      if ((value & 10) != 0) sbuf.append("|msoMaterialPowder");
      if ((value & 11) != 0) sbuf.append("|msoMaterialDarkEdge");
      if ((value & 12) != 0) sbuf.append("|msoMaterialSoftEdge");
      if ((value & 13) != 0) sbuf.append("|msoMaterialClear");
      if ((value & 14) != 0) sbuf.append("|msoMaterialFlat");
      if ((value & 15) != 0) sbuf.append("|msoMaterialSoftMetal");
      return sbuf.toString();
      }
    }
  }
}
