import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;
import java.util.Random;
public class RobotHouses {

	//Joey.moveTo(100, 100);
	public static void main(String[] args) {
		Robot Joey= new Robot();
		Random Matt= new Random();
		Robot.setWindowColor(Color.black);
		Joey.moveTo(10,585);
		Joey.miniaturize();
		Joey.penDown();
		Joey.setSpeed(1000);
		for (int i = 0; i < 15; i++) {
	int Doug =Matt.nextInt(401) + 100;
			Joey.setRandomPenColor();;
			Joey.move(Doug);
			if (Doug > 300){
			Joey.turn(90);
			Joey.move(30);
			Joey.turn(90);
			}
			else {
				Joey.turn(45);
				Joey.move(30);
				Joey.turn(90);
				Joey.move(30);
				Joey.turn(30);
			}
			Joey.move(Doug);
			Joey.turn(-90);
			Joey.setPenColor(Color.green);
			Joey.move(5);
			Joey.turn(-90);
		}
		
	}
}
