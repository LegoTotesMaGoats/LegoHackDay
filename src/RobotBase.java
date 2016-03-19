import lejos.hardware.motor.Motor;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.robotics.navigation.MovePilot;

public class RobotBase {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		RegulatedMotor leftMotor = Motor.C;
		RegulatedMotor rightMotor = Motor.D;
		//MovePilot robot = new MovePilot(55, 120, leftMotor, rightMotor);
		MovePilot robot = new MovePilot(55, 120, leftMotor, rightMotor);

		robot.setLinearAcceleration(250);

		robot.travel(100);

	}

}
