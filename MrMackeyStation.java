//CS 201 Assignment 2 Part 3
//Nicole Fella

import java.util.StringTokenizer;
/**
* This station will translate the global breaking news story into news inspired by South Park's Mr. Mackey.
* This adds the word "mmkay" after every word.
* Idea: courtesy of Chris Garry
**/
public class MrMackeyStation extends NewsStation
{
	/** 
	* This instance method will produce the Pig Latin translation of the breaking news story and return it
	**/
	public String mackeyNews()
	{
		//create String for final Pig Latin translation
		String mackeySays = "";	
		
		//use StringTokenizer to break the news String into separate words 
		StringTokenizer stringTokenizer = new StringTokenizer(NewsStation.news);
		
		String currentToken;
		
		//while there are still tokens left
		while( stringTokenizer.hasMoreTokens() )
		{
			//get next word
			currentToken = stringTokenizer.nextToken();
			
			//pass current Token into pigLatinizer() method and add it to pigLatinTranslation
			mackeySays += (currentToken + " mmkay ");
		}
		
		//return pigLatinTranslation
		return mackeySays;
	}

	
	/**
	* This instance method will override the getLocalBreakingNews() method from NewsStation class.
	* It will take the header input and 
	**/
	public String getLocalBreakingNews()
	{
		return "Mr. Mackey thinks the news is: " + mackeyNews();
	}
	
}