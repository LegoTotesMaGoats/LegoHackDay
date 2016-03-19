package one;
import common.Robot;
import lejos.hardware.lcd.LCD;

public class One extends Robot {

	@Override
	public void main() {
		LCD.drawString("ROBOT ONE", 0, 0);
		chassis.setVelocity(100, 0);
		chassis.travel(100);
		chassis.waitComplete();
	}
	
}
