//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String cat=JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
int cats= Integer.parseInt(cat);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if (cats>2) {
	JOptionPane.showMessageDialog(null, "You are a CRAZY cat lady!!! or man... !!!!");
}
		// 4. If they have 3 or less, call the method below to show them a cat video
else if (cats<3){ playVideo("www.youtube.com/xySLS90");

}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
else if (cats<0) { playVideo("www.youtube.com/watch?v=SKRgkt");
	
}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

