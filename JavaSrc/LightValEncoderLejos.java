import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;

public class LightValEncoderLejos implements LightValEncoder {

  private LightSensor lightSensor = new LightSensor(SensorPort.S3);
  
  public Number getLightVal ()  {
	  return lightSensor.getNormalizedLightValue();
  }

  public LightValEncoderLejos ()  {
	
  }
}
;
