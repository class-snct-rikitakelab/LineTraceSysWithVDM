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

// ***** VDMTOOLS END Name=imports



public class LightValCtrl implements TimerTask{

// ***** VDMTOOLS START Name=lightVal KEEP=NO
  private LightVal lightVal = null;
// ***** VDMTOOLS END Name=lightVal

// ***** VDMTOOLS START Name=ctrlState KEEP=NO
  public Boolean ctrlState = null;
// ***** VDMTOOLS END Name=ctrlState

// ***** VDMTOOLS START Name=wheelMotor KEEP=NO
  private WheelMotor wheelMotor = null;
// ***** VDMTOOLS END Name=wheelMotor

// ***** VDMTOOLS START Name=ControlMethod KEEP=NO
  private PIDLightValCtrl ControlMethod = null;
// ***** VDMTOOLS END Name=ControlMethod
  
  private LightValTimer lightValTimer = null;

  // ***** VDMTOOLS START Name=vdm_init_LightValCtrl KEEP=NO
  private void vdm_init_LightValCtrl () {
    ctrlState = Boolean.FALSE;
  }
// ***** VDMTOOLS END Name=vdm_init_LightValCtrl


// ***** VDMTOOLS START Name=LightValCtrl KEEP=NO
  public LightValCtrl () /*throws CGException*/ {
    vdm_init_LightValCtrl();
  }
// ***** VDMTOOLS END Name=LightValCtrl


// ***** VDMTOOLS START Name=LightValCtrl#3|LightValEncoder|WheelMotor|PIDLightValCtrl KEEP=NO
  public LightValCtrl (final LightValEncoder LVE, final WheelMotor WM, final PIDLightValCtrl PLVC) /*throws CGException*/ {
    vdm_init_LightValCtrl();
    lightVal = new LightVal(LVE);
    wheelMotor = WM;
    ControlMethod = PLVC;
    lightValTimer = new LightValTimer(4);
  }
// ***** VDMTOOLS END Name=LightValCtrl#3|LightValEncoder|WheelMotor|PIDLightValCtrl


// ***** VDMTOOLS START Name=run KEEP=NO
  public void run () /*throws CGException*/ {
    this.doLightValCtrl();
  }
// ***** VDMTOOLS END Name=run


// ***** VDMTOOLS START Name=startCtrl KEEP=NO
  public void startCtrl () /*throws CGException*/ {
    if (!this.pre_startCtrl().booleanValue()) {
    //UTIL.RunTime("Precondition failure in startCtrl");
    }
    changeMode(Boolean.TRUE);
  }
// ***** VDMTOOLS END Name=startCtrl


// ***** VDMTOOLS START Name=pre_startCtrl KEEP=NO
  public Boolean pre_startCtrl () /*throws CGException*/ {
    return ctrlState == Boolean.FALSE;
  }
// ***** VDMTOOLS END Name=pre_startCtrl


// ***** VDMTOOLS START Name=stopCtrl KEEP=NO
  public void stopCtrl () /*throws CGException*/ {
    if (!this.pre_stopCtrl().booleanValue()){
//   UTIL.RunTime("Precondition failure in stopCtrl");
    }
    changeMode(Boolean.FALSE);
    wheelMotor.rotate(new Integer(0));
  }
// ***** VDMTOOLS END Name=stopCtrl


// ***** VDMTOOLS START Name=pre_stopCtrl KEEP=NO
  public Boolean pre_stopCtrl () /*throws CGException*/ {
    return ctrlState == Boolean.TRUE;
  }
// ***** VDMTOOLS END Name=pre_stopCtrl


// ***** VDMTOOLS START Name=getCtrlParm KEEP=NO
  public PIDLVCParm getCtrlParm () /*throws CGException*/ {
    return ControlMethod.getCtrlParm();
  }
// ***** VDMTOOLS END Name=getCtrlParm


// ***** VDMTOOLS START Name=doLightValCtrl KEEP=NO
  private void doLightValCtrl () /*throws CGException*/ {
    final Number targ = lightVal.getTargLightVal();
    final Number currentLightVal = lightVal.getLightVal();
    {
      final Number pwm = ControlMethod.calcLightValCtrlVal(targ, currentLightVal, new Double(0));
      wheelMotor.rotate(pwm);
    }
  }
// ***** VDMTOOLS END Name=doLightValCtrl


// ***** VDMTOOLS START Name=getTargLightVal KEEP=NO
  public Number getTargLightVal () /*throws CGException*/ {
    return lightVal.getTargLightVal();
  }
// ***** VDMTOOLS END Name=getTargLightVal


// ***** VDMTOOLS START Name=setTargLightVal#1|Number KEEP=NO
  public void setTargLightVal (final Number parm) /*throws CGException*/ {
    lightVal.setTargLightVal(parm);
  }
// ***** VDMTOOLS END Name=setTargLightVal#1|Number


// ***** VDMTOOLS START Name=changeMode#1|Boolean KEEP=NO
  public void changeMode (final Boolean state) /*throws CGException*/ {
    ctrlState = state;
  }
// ***** VDMTOOLS END Name=changeMode#1|Boolean


// ***** VDMTOOLS START Name=setLightValRange#1|LightValRange KEEP=NO
  public void setLightValRange (final LightValRange LVR) /*throws CGException*/ {
    lightVal.setLightValRange(LVR);
  }
// ***** VDMTOOLS END Name=setLightValRange#1|LightValRange


// ***** VDMTOOLS START Name=setCtrlParm#1|PIDLVCParm KEEP=NO
  public void setCtrlParm (final PIDLVCParm parm) /*throws CGException*/ {
    ControlMethod.setCtrlParm(parm);
  }
// ***** VDMTOOLS END Name=setCtrlParm#1|PIDLVCParm


// ***** VDMTOOLS START Name=setLightValListener#1|LightValListener KEEP=NO
  public void setLightValListener (final LightValListener LVL) /*throws CGException*/ {
    lightVal.setLightValListener(LVL);
  }
// ***** VDMTOOLS END Name=setLightValListener#1|LightValListener

}
;
