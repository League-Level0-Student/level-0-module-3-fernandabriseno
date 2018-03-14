
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
Robot rob= new Robot();
		//3. ask the user what color they would like the robot to draw 
String color = JOptionPane.showInputDialog("What color would you like rob the robot to draw??? Pick a color, ANY color... :)");
		//4. use an if/else statement to set the pen color that the user requested
if (color.equals("red")) {
rob.setPenColor(255, 99, 99);
}  
if (color.equals("orange")) {
rob.setPenColor(255, 114, 0);
}  
if (color.equals("yellow")) {
rob.setPenColor(255, 246, 0);
}  
if (color.equals("green")) {
rob.setPenColor(115, 173, 88); 
}  
if (color.equals("blue")) {
rob.setPenColor(17, 147, 191);
}  
if (color.equals("cyan")) {
rob.setPenColor(Color.cyan); 
} 
if (color.equals("purple")) {
rob.setPenColor(184, 152, 249); 
}   



        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		rob.penDown(); 
		rob.setPenWidth(10); 
		rob.setSpeed(9000);
	    //1. make the robot draw a shape (this will take more than one line of code)
for (int i = 0; i < 4; i++) { 
rob.move(100); 
rob.turn(360/4);
	
}

	}
}
