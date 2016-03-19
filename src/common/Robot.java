package common;
import lejos.hardware.motor.Motor;
import lejos.robotics.chassis.Chassis;
import lejos.robotics.chassis.Wheel;
import lejos.robotics.chassis.WheeledChassis;

public abstract class Robot {

	private Wheel wheel1;
	private Wheel wheel2;
	public Chassis chassis;

	public Robot() {
		wheel1 = WheeledChassis.modelWheel(Motor.C, 55).offset(-60);
		wheel2 = WheeledChassis.modelWheel(Motor.D, 55).offset(60);
		chassis = new WheeledChassis(new Wheel[] { wheel1, wheel2 }, WheeledChassis.TYPE_DIFFERENTIAL);
		chassis.setAcceleration(100, 100);
	}
	
	public abstract void main();
}
