//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2014-01-27 by the VDM++ to JAVA Code Generator
// (v9.0.3 - Fri 13-Dec-2013 09:24:01 +0900)
//
// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// This file was genereted from "C:\\Users\\HOMMA\\Google ?.

// ***** VDMTOOLS START Name=package KEEP=NO
// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO

// ***** VDMTOOLS END Name=imports



public class PIDLVCParm {

// ***** VDMTOOLS START Name=lKd KEEP=NO
  private Number lKd = null;
// ***** VDMTOOLS END Name=lKd

// ***** VDMTOOLS START Name=lKi KEEP=NO
  private Number lKi = null;
// ***** VDMTOOLS END Name=lKi

// ***** VDMTOOLS START Name=lKp KEEP=NO
  private Number lKp = null;
// ***** VDMTOOLS END Name=lKp


// ***** VDMTOOLS START Name=vdm_init_PIDLVCParm KEEP=NO
  private void vdm_init_PIDLVCParm () {}
// ***** VDMTOOLS END Name=vdm_init_PIDLVCParm


// ***** VDMTOOLS START Name=PIDLVCParm KEEP=NO
  public PIDLVCParm () /*throws CGException*/ {
    vdm_init_PIDLVCParm();
  }
// ***** VDMTOOLS END Name=PIDLVCParm


// ***** VDMTOOLS START Name=PIDLVCParm#3|Number|Number|Number KEEP=NO
  public PIDLVCParm (final Number Kp, final Number Ki, final Number Kd) /*throws CGException*/ {
    vdm_init_PIDLVCParm();
    lKd = Kd;
    lKi =Ki;
    lKp = Kp.doubleValue();
  }
// ***** VDMTOOLS END Name=PIDLVCParm#3|Number|Number|Number


// ***** VDMTOOLS START Name=getLKd KEEP=NO
  public Number getLKd () /*throws CGException*/ {
    return lKd;
  }
// ***** VDMTOOLS END Name=getLKd


// ***** VDMTOOLS START Name=getLKi KEEP=NO
  public Number getLKi () /*throws CGException*/ {
    return lKi;
  }
// ***** VDMTOOLS END Name=getLKi


// ***** VDMTOOLS START Name=getLKp KEEP=NO
  public Number getLKp () /*throws CGException*/ {
    return lKp;
  }
// ***** VDMTOOLS END Name=getLKp


// ***** VDMTOOLS START Name=setLKd#1|Number KEEP=NO
  public void setLKd (final Number parm) /*throws CGException*/ {
    lKd = parm;
  }
// ***** VDMTOOLS END Name=setLKd#1|Number


// ***** VDMTOOLS START Name=setLKi#1|Number KEEP=NO
  public void setLKi (final Number parm) /*throws CGException*/ {
    lKi = parm;
  }
// ***** VDMTOOLS END Name=setLKi#1|Number


// ***** VDMTOOLS START Name=setLKp#1|Number KEEP=NO
  public void setLKp (final Number parm) /*throws CGException*/ {
    lKp =parm;
  }
// ***** VDMTOOLS END Name=setLKp#1|Number

}
;
