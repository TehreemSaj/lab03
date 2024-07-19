package ca.ucalgary.ensf380;

public class Story {
	private Author[] theAuthors;
	
	public Story() {
		System.out.println("New story created");
	}
	public String plot() {
		return "Method plot called from Story"; 				
	}

	public Author[] getTheAuthors() {
		return theAuthors;
	}

	public void setTheAuthors(Author[] theAuthors) {
		this.theAuthors = theAuthors;
		System.out.println("Authors set to: ");
        for (Author author : theAuthors) {
            System.out.println(author.getName());
        }
		System.out.println("\n");
	}
	
}
