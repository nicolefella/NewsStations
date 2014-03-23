//CS 201 Assignment2 Part2
//Nicole Fella
import java.util.StringTokenizer;
/**
* This station will translate the global breaking news story into Pig Latin.
* Rules of Pig Latin include:
* (1) words beginning with a single consonant: take off consonant and add to end of word + ay to word
* (2) words beginning with multiple consonants: take off consonants, add to end of word + ay to word
* (3) words beginning with vowels: + yay to word
**/
public class PigLatinStation extends NewsStation
{
	/** 
	* This instance method will produce the Pig Latin translation of the breaking news story and return it
	**/
	public String pigLatin()
	{
		//create String for final Pig Latin translation
		String pigLatinTranslation = "";	
		
		//use StringTokenizer to break the news String into separate words 
		StringTokenizer stringTokenizer = new StringTokenizer(NewsStation.news);
		
		String currentToken;
		
		//while there are still tokens left
		while( stringTokenizer.hasMoreTokens() )
		{
			//get next word
			currentToken = stringTokenizer.nextToken();
			
			//pass current Token into pigLatinizer() method and add it to pigLatinTranslation
			pigLatinTranslation += pigLatinizer(currentToken);
		}
		
		//return pigLatinTranslation
		return pigLatinTranslation;
	}

	/**
	* This instance method will translate each word (each Token) into PigLatin using the rules.
	* It will start by searching for the where the first vowel is
	**/
	public String pigLatinizer(String word)
	{
		//initialize pigLatinWord
		String pigLatinWord = "";
		//initialize the start of the substring to be 0
		int substringStart = 0;
		//define a current character char to compare to different characters while iterating through each character of word
		char currentChar;
		
		for (int i=0; i<word.length(); i++)
		{
			currentChar = word.charAt(i);
			//if the character is a vowel, get out of for-loop
			if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u')
				break;
			//otherwise, update substringStart by updating it by +1 to indicate the character pace
			else
				substringStart += 1;
		}
		
		//start of pigLatin word
		pigLatinWord += word.substring(substringStart, word.length());
		
		//if the word begins with a vowel (substringStart == 0), add "yay" to end of string
		if (substringStart == 0)
			pigLatinWord += "yay ";
		else
			pigLatinWord += "ay ";
			
		//return pigLatinWord
		return pigLatinWord;		
	}
	
	/**
	* This instance method will override the getLocalBreakingNews() method from NewsStation class.
	* It will take the header input and 
	**/
	public String getLocalBreakingNews()
	{
		return "The Pig Latin Translation of the news is: " + pigLatin();
	}
	
}