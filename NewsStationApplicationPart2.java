//CS201 Assignment2 Part2
//Nicole Fella

/**
* Initializes NewsStation instances, printing global breaking news story and versions of each locale
* This version of NewsStationApplication has an additional method for PigLatin
**/
public class NewsStationApplicationPart2
{
	/**
	* This local news source is for Mount Holyoke College News
	**/
	public static void globalBreakingNews()
	{
		//create a news station for holyokeNews
		NewsStation globalNews = new NewsStation("Global News presents: ");
		
		System.out.println(globalNews.getLocalBreakingNews());
	}
	/**
	* This local news source is for Mount Holyoke College News
	**/
	public static void mountHolyokeBreakingNews()
	{
		//create a news station for holyokeNews
		NewsStation holyokeNews = new NewsStation("Live from Mount Holyoke College: ");
		
		System.out.println(holyokeNews.getLocalBreakingNews());
	}	
	
	/**
	* This local news source is for Mount Holyoke College News
	**/
	public static void topSecretBreakingNews()
	{
		//create a news station for holyokeNews
		NewsStation topSecretNews= new NewsStation("Shhhh! Top secret files reveal: ");
		
		System.out.println(topSecretNews.getLocalBreakingNews());
	}
	
	/**
	* This is the news source for PigLatin
	**/
	public static void pigLatinBreakingNews()
	{
		//create news station for Pig Latin
		NewsStation pigLatinNews = new PigLatinStation();
		
		System.out.println(pigLatinNews.getLocalBreakingNews());
	}
		
	public static void main(String[] args)
	{
		globalBreakingNews();
		mountHolyokeBreakingNews();
		topSecretBreakingNews();
		pigLatinBreakingNews();
	}
}
