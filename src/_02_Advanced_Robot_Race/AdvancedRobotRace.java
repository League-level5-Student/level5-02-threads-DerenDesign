package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	public static void main(String[] args) {
		
	
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	Robot timmy = new Robot(400, 700);
	Robot tammy = new Robot(800, 700);
	Robot sammy = new Robot(1200, 700);
	
	Random ran = new Random();
	int speed = ran.nextInt(10);
	int speed2 = ran.nextInt(10);
	int speed3 = ran.nextInt(10);
	timmy.setSpeed(speed);
	tammy.setSpeed(speed2);
	sammy.setSpeed(speed3);
	
	
	Thread r1 = new Thread(()->timmy.move(400));
	Thread r2 = new Thread(()->tammy.move(400));
	Thread r3 = new Thread(()->sammy.move(400));
	
	r1.start();
	r2.start();
	r3.start();
}
}
