import lejos.hardware.motor.Motor;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.navigation.DifferentialPilot;

public class RobotBase {

	public static void main(String[] args) {
		RegulatedMotor leftMotor = Motor.C;
		RegulatedMotor rightMotor = Motor.D;
		DifferentialPilot robot = new DifferentialPilot(55, 120, leftMotor, rightMotor);
		
		robot.setAcceleration(250);

		robot.travel(100);

	}

}
