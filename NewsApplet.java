//CS 201 Assignment2 Part4
//Nicole Fella

import javax.swing.JApplet;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;

/**
* Here is the code for the Applet.
* I'm still having a lot of trouble with applets.
* I used this link as a reference
* http://docs.oracle.com/javase/tutorial/uiswing/components/applet.html 
* but still got very lost
**/
public class NewsApplet extends JApplet 
{
	public void init()
	{
		createGUI();
	}
	
	public void createGUI()
	{
		add(new JTextArea("Welcome to your News Stations!! Click the Buttons to see the News!"));
		add(new NewsGUI(new NewsStation("Global News presents: ")));
		add(new NewsGUI(new NewsStation("Live from Mount Holyoke College: ")));
		add(new NewsGUI(new NewsStation("Shhhh! Top secret files reveal: ")));
		add(new NewsGUI(new MrMackeyStation()));
		add(new NewsGUI(new PigLatinStation()));
	}
}
