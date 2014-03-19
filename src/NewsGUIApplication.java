//CS201 Assignment 2 Part 4
//Nicole Fella

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextArea;

/**
* This class is the application which will invoke the functions made in NewsGUI.
* A GUI will be created here to allow the news to be displayed.
**/
public class NewsGUIApplication
{
	public static void main(String[] args)
	{
		//create a frame and set default close operation 
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		
		//create frame size
		frame.setSize( 1400, 300);
		
		//set layout so horoscopes are layed out in vertical fashion
		frame.setLayout(new GridLayout(6,1));
		
		//add panels for the News
		frame.add(new JTextArea("Welcome to your News Stations!! Click the Buttons to see the News!"));
		frame.add(new NewsGUI(new NewsStation("Global News presents: ")));
		frame.add(new NewsGUI(new NewsStation("Live from Mount Holyoke College: ")));
		frame.add(new NewsGUI(new NewsStation("Shhhh! Top secret files reveal: ")));
		frame.add(new NewsGUI(new MrMackeyStation()));
		frame.add(new NewsGUI(new PigLatinStation()));
		
		//make frame visible so GUI can be seen
		frame.setVisible(true);
	}
}