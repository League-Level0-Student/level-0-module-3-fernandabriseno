//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot rob = new Robot();

	public static void main(String[] args) {

		// 2. Ask the user how dizzy you want the robot from 1-10, then spin that number
		// of times.
		String numberOfSpins = JOptionPane
				.showInputDialog("HoW dIzZy dO yOu WaNt roB ThE RobOT tO bE!?(RanGE FrOm ONe tO tEN)");
		// 1. Use the dance method to make the robot spin.	 
		int number=Integer.parseInt(numberOfSpins);
		dance(number); 
		rob.setSpeed(50);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			rob.turn(360);
		}
	}
}
