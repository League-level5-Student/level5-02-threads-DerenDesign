package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot timmy = new Robot(400, 700);
		Robot tammy = new Robot(800, 700);
		Robot sammy = new Robot(1200, 700);
		Robot dammy = new Robot(200, 700);
		
		timmy.setSpeed(10);
		tammy.setSpeed(10);
		sammy.setSpeed(10);
		dammy.setSpeed(10);
		
		for(int i =0; i < 360; i++) {
			tammy.penDown();
			tammy.turn(1);
			tammy.move(5);
			tammy.penUp();
		}
		for(int i =0; i < 360; i++) {
			sammy.penDown();
			sammy.turn(1);
			sammy.move(5);
			sammy.penUp();
		}
		for(int i =0; i < 360; i++) {
			timmy.penDown();
			timmy.turn(1);
			timmy.move(5);
			timmy.penUp();
		}
		for(int i =0; i < 360; i++) {
			dammy.penDown();
			dammy.turn(1);
			dammy.move(5);
			dammy.penUp();
		}
		
}
}

