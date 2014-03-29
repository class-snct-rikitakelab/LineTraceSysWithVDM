import jp.vdmtools.VDM.UTIL;
import junit.framework.TestCase;
import jp.vdmtools.VDM.CGException;
import lejos.nxt.BasicMotorPort;
import lejos.nxt.MotorPort;
import lejos.nxt.*;



public class TargMain{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		MotorPort.B.setPWMMode(BasicMotorPort.PWM_BRAKE);
		MotorPort.B.resetTachoCount();
		MotorPort.B.controlMotor(0, 0);

		MotorPort.C.setPWMMode(BasicMotorPort.PWM_BRAKE);
		MotorPort.C.resetTachoCount();
		MotorPort.C.controlMotor(0, 0);
		

		MotorPort.A.setPWMMode(BasicMotorPort.PWM_BRAKE);
		MotorPort.A.resetTachoCount();
		MotorPort.A.controlMotor(0, 0);
			
		LightValEncoder lightValEncoder = new LightValEncoderLejos();	    
		WheelMotor wheelMotor = new WheelMotorLejos();
		PIDLightValCtrl ControlMethod = new PIDLightValCtrl();

		PIDLVCParm p = null;
		LightValCtrl tc = null;
		p = new PIDLVCParm(new Double(0.3), new Integer(0), new Integer(0));
		ControlMethod.setCtrlParm(p);
		tc = new LightValCtrl(lightValEncoder, wheelMotor, ControlMethod);
		tc.setTargLightVal(new Integer(400));
		
		LightValTimer lightValTimer = new LightValTimer(4);
		
		lightValTimer.startLightValTimer(tc);	
		tc.startCtrl();
		while(!Button.ESCAPE.isPressed()){
			
		}
		System.exit(0);
		/*
		cannot call startLightValTimer in LightValCtrl Class Constractor
		*/
	}
}
