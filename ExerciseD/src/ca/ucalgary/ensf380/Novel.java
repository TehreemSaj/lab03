package ca.ucalgary.ensf380;

public class Novel extends Fiction {
	private Author[] theAuthors;
	
	private Series mySeries;
	
	public Novel() {
		System.out.println("New novel created");
	}
	
	public String theme() {
		return "Method theme called from Novel"; 			
	}
	
	public String coverArt() {
		return "Method coverArt called from Novel"; 			
	}	

	public Author[] getTheAuthors() {
		return theAuthors;
	}

	public void setTheAuthors(Author[] theAuthors) {
		this.theAuthors = theAuthors;
		System.out.print("Authors set to: ");
        for (Author author : theAuthors) {
            System.out.println(author.getName());
        }
	}

	public Series getMySeries() {
		return mySeries;
	}

	public void setMySeries(Series mySeries) {
		this.mySeries = mySeries;
		System.out.println("Series set to: " + mySeries.getSeriesName() + "\n");
	}
}
