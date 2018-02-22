
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 1st";
		String dadsBirthday = "September 8th";
		String myBirthday = "November 19th";
        String brothersBirthday = "March 23rd"; 
        String sistersBirthday = "August 5th";
		// 2. Find out which birthday the user wants and and store their response in a variable
	String Bday = JOptionPane.showInputDialog("Enter whose B-day that you need to remember...");
		// 3. Print out what the user typed
		
	
	
	// 4. if user asked for "mom"
			//print mom's birthday 
	if(Bday.equals("mom")) {
		JOptionPane.showMessageDialog(null, momsBirthday);
	}
	
		// 5. if user asked for "dad"
			// print dad's birthday 
	else if(Bday.equals("dad")) {  
		JOptionPane.showMessageDialog(null, dadsBirthday);} 
	
		// 6. if user asked for your name
			// print myBirthday 
	else if(Bday.equals("me")) { 
		
		JOptionPane.showMessageDialog(null, myBirthday);
	}
		//7. otherwise print "Sorry, i don't remember that person's birthday!" 
	else { 
		JOptionPane.showMessageDialog(null, "Sorry I do not remember that person's birthday... Maybe you should get a better brain so you can memorize your OWN birthday!!! HA!!! :) ");
	}
} } 

