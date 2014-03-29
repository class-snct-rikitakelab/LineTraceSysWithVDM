import lejos.nxt.MotorPort;


public class WheelMotorLejos implements WheelMotor {

// ***** VDMTOOLS START Name=turn KEEP=NO
  private Number turn = null;
// ***** VDMTOOLS END Name=turn

  public WheelMotorLejos ()  {
    turn = new Integer(0);
  }

  public void rotate (final Number parm){
    turn = parm.intValue();
    MotorPort.B.controlMotor(20 + parm.intValue(), 1);
    MotorPort.C.controlMotor(20 - parm.intValue(), 1);
  }

  public Number getRotate ()  {
    return turn;
  }

}
;
