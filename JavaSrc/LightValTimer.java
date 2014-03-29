
import lejos.nxt.*;

public class LightValTimer extends Thread{
	private int cycle;
	TimerTask timer;

	public LightValTimer(int time){
		this.cycle = time;
	}

	public void startLightValTimer(TimerTask timer){
		this.timer = timer;		
		this.start();
	}
	

	public void stopLightValTimer(){
//		this.stop();
/*		while (true) {
			if (Button.ESCAPE.isPressed() == true)
				break;
		}*/
	}

	public void run(){
		while(true){
			timer.run();
		/*	try {
				this.wait(cycle);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
			}*/
		}
	}	
}
