//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas 
JOptionPane.showInputDialog("Hi! :) Do you like bananas???");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz  
JOptionPane.showMessageDialog( null, "You are CRAAAZZZZYYY!!!! :)");
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
String hobby=JOptionPane.showInputDialog("Hmmm... okay.... What is your favorite hobby???:)"); 
JOptionPane.showMessageDialog(null,hobby + " would be MUCH better with bananas!!!! :)");
		//4. OPTIONAL: if they say something other than yes or no
		//	show a pop up that says You are bananas!
	
	}

}
