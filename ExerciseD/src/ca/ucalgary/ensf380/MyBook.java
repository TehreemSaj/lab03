package ca.ucalgary.ensf380;

public class MyBook {
	
	public static void main(String[] args) {
		// Create Publisher Eagle Crest Books 
		Publisher eagleCrest = new Publisher("Eagle Crest Books", "123 Willow Lane, Apt 4B Springfield, IL 62704, United States"); 
		
		//Create Author Harper Lee
		Author harperLee = new Author("Harper Lee", "125 Willow Lane, Apt 4B Springfield, IL 62704, United States", 34);
		
		//Create Classic Book To Kill A Mockingbird
		Classic toKillAMockingbird = new Classic();
		Publisher[] publishers = new Publisher[1];
        publishers[0] = eagleCrest; 
		toKillAMockingbird.setIsbn("0060935464");
		toKillAMockingbird.setPages(336);
		toKillAMockingbird.setPublicationYear(1960);
		toKillAMockingbird.setBookPublisher(publishers);
		toKillAMockingbird.setTheAuthor(harperLee);
		
		//Create Contract between Harper Lee and Eagle Crest Books
		Author[] authors = new Author[1];
        authors[0] = harperLee;   
		Contract mockingbirdContract = new Contract("December 5th 1959", eagleCrest, authors);
		
		//Create Author J.K Rowling 
		Author jkRowling = new Author("J.K. Rowling", "756 Bushberry Lane, Apt 4B Willowfield, IL 62704, United States", 32);
		
		//Create Harry Potter Series 
		Series harryPotter = new Series();
		harryPotter.setSeriesName("Harry Potter");
		
		//Create new novel Harry Potter and the Sorcerer’s Stone in the harryPotter series
		Author[] authors2 = new Author[1];
        authors2[0] = jkRowling;   
		Novel theSorcerersStone = new Novel();
		theSorcerersStone.setIsbn("0590353427");
		theSorcerersStone.setPages(223);
		theSorcerersStone.setPublicationYear(1997);
		theSorcerersStone.setTheAuthors(authors2);
		theSorcerersStone.setMySeries(harryPotter);
		
		//Create new categories biography and authorized biography and set them as sub and super categories of each other 
		Category biography = new Category();
		biography.setCategory("biography");
		Category authorizedBiography = new Category();
		authorizedBiography.setCategory("authorized biography");
		biography.setSubCategory(authorizedBiography);
		authorizedBiography.setSuperCategory(biography);
		
		//Create an new Non-fiction book: biography on Rowling 
		Nonfiction rowlingBiography = new Nonfiction();
		rowlingBiography.setIsbn("83778373478");
		rowlingBiography.setPages(75);
		rowlingBiography.setPublicationYear(2005);
		rowlingBiography.setDeweyClassification(authorizedBiography);
		
		//Create author ALden Thorne 
		Author aldenThorne = new Author("Alden Thorne", "539 Erin Woods Terrace SE, Calgary, Alberta, T2B2X9, Canada", 25);
			
		//Create the 3 short stories
		Author[] authors3 = new Author[2];
        authors3[0] = jkRowling;  
        authors3[1] = aldenThorne;
        Story hpOne = new Story();
        hpOne.setTheAuthors(authors3);
        Story hpTwo = new Story();
        hpTwo.setTheAuthors(authors3);
        Story hpThree = new Story();
        hpThree.setTheAuthors(authors3);
        Story[] hpStories = new Story[3];
        hpStories[0] = hpOne;
        hpStories[1] = hpTwo;
        hpStories[2] = hpThree;
		
		//Create Harry Potter anthology 
        Anthology hpAnthology = new Anthology();
        hpAnthology.setStories(hpStories);
        hpAnthology.setIsbn("11127387382");
        hpAnthology.setPages(12);
        hpAnthology.setPublicationYear(2007);
	}
}
