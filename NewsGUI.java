//CS201 Assignment2 Part4
//Nicole Fella

// resources watched and used before starting GUI work listed below
// https://www.youtube.com/watch?v=dsq2Tjs5xWU
// http://docs.oracle.com/javase/tutorial/uiswing/start/index.html
// http://docs.oracle.com/javase/tutorial/uiswing/components/

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;

/**
* This class will create the GUI for the different news sources
**/

public class NewsGUI extends JPanel implements ActionListener
{
	JTextArea textArea;
	NewsStation chosenNews;
	
	/**
	* Constructor
	**/
	public NewsGUI(NewsStation news)
	{
		chosenNews = news;
		
		setLayout(new BorderLayout());
		add(createTextArea(), "Center");
		add(createButton(), "East");
	}
	
	/**
	*  This method is responsible for creating a Text area which will be used on the Panel
	**/
	public JTextArea createTextArea()
	{
			textArea = new JTextArea();
			return textArea;
	}
	
	/**
	* This method is responsible for created a button which will be placed on the panel
	**/
	public JButton createButton()
	{
		JButton button = new JButton("CLICK ME");
		button.addActionListener( this);
		return button;
	}
	
	/**
	* This method is performed when the button is clicked
	**/
	public void actionPerformed( ActionEvent e )
	{
		//create string representation of station
		String stationNews = chosenNews.getLocalBreakingNews();
		//display string representation
		textArea.setText(stationNews);
	}

}

