//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2014-01-27 by the VDM++ to JAVA Code Generator
// (v9.0.3 - Fri 13-Dec-2013 09:24:01 +0900)
//
// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// This file was genereted from "C:/Users/HOMMA/Google ?.

// ***** VDMTOOLS START Name=package KEEP=NO
// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO
import jp.vdmtools.VDM.UTIL;
import jp.vdmtools.VDM.CGException;
// ***** VDMTOOLS END Name=imports



public class LightValRange {

// ***** VDMTOOLS START Name=lowerLimit KEEP=NO
  private Number lowerLimit = null;
// ***** VDMTOOLS END Name=lowerLimit

// ***** VDMTOOLS START Name=upperLimit KEEP=NO
  private Number upperLimit = null;
// ***** VDMTOOLS END Name=upperLimit


// ***** VDMTOOLS START Name=vdm_init_LightValRange KEEP=NO
  private void vdm_init_LightValRange () {}
// ***** VDMTOOLS END Name=vdm_init_LightValRange


// ***** VDMTOOLS START Name=inv_LightValRange KEEP=NO
  public Boolean inv_LightValRange () {
    Boolean rexpr_2 = null;
    if ((rexpr_2 = Boolean.valueOf(lowerLimit.intValue() >= 0)).booleanValue()) 
      rexpr_2 = Boolean.valueOf(upperLimit.intValue() < LightVal.MAX_LIGHT_VAL.intValue());
    return rexpr_2;
  }
// ***** VDMTOOLS END Name=inv_LightValRange


// ***** VDMTOOLS START Name=LightValRange KEEP=NO
  public LightValRange () throws CGException {
    vdm_init_LightValRange();
  }
// ***** VDMTOOLS END Name=LightValRange


// ***** VDMTOOLS START Name=LightValRange#2|Number|Number KEEP=NO
  public LightValRange (final Number lower, final Number upper) throws CGException {
    vdm_init_LightValRange();
    lowerLimit = UTIL.NumberToInt(UTIL.clone(lower));
    upperLimit = UTIL.NumberToInt(UTIL.clone(upper));
  }
// ***** VDMTOOLS END Name=LightValRange#2|Number|Number


// ***** VDMTOOLS START Name=checkRange#1|Number KEEP=NO
  public Boolean checkRange (final Number measuredLightVal) throws CGException {
    if (measuredLightVal.intValue() < lowerLimit.intValue()) 
      return Boolean.TRUE;
    else if (measuredLightVal.intValue() > upperLimit.intValue()) 
      return Boolean.TRUE;
    else 
      return Boolean.FALSE;
  }
// ***** VDMTOOLS END Name=checkRange#1|Number


// ***** VDMTOOLS START Name=getLowerLimit KEEP=NO
  public Number getLowerLimit () throws CGException {
    return lowerLimit;
  }
// ***** VDMTOOLS END Name=getLowerLimit


// ***** VDMTOOLS START Name=getUpperLimit KEEP=NO
  public Number getUpperLimit () throws CGException {
    return upperLimit;
  }
// ***** VDMTOOLS END Name=getUpperLimit


// ***** VDMTOOLS START Name=setLowerLimit#1|Number KEEP=NO
  public void setLowerLimit (final Number parm) throws CGException {
    lowerLimit = UTIL.NumberToInt(UTIL.clone(parm));
    if (!this.inv_LightValRange().booleanValue()) 
      UTIL.RunTime("Instance invariant failure in LightValRange");
  }
// ***** VDMTOOLS END Name=setLowerLimit#1|Number


// ***** VDMTOOLS START Name=setUpperLimit#1|Number KEEP=NO
  public void setUpperLimit (final Number parm) throws CGException {
    upperLimit = UTIL.NumberToInt(UTIL.clone(parm));
    if (!this.inv_LightValRange().booleanValue()) 
      UTIL.RunTime("Instance invariant failure in LightValRange");
  }
// ***** VDMTOOLS END Name=setUpperLimit#1|Number

}
;
