package common;

import lejos.hardware.ev3.LocalEV3;
import one.One;
import twentytwo.TwentyTwo;

public class Main {

	public static void main(String[] args) {
		String name = LocalEV3.get().getName();
		Robot robot = null;
		if(name.equalsIgnoreCase("gompie")) {
			robot = new One();
		} else if(name.equalsIgnoreCase("ev22")) {
			robot = new TwentyTwo();
		}
		if(robot != null) {
			robot.main();
		}
	}

}
