package ca.ucalgary.ensf380;

public class Classic extends Hardcover {
	private int origPubYear = 1860;
	private Author theAuthor;
	private Publisher[] bookPublisher;
	
	public Classic() {
		super();
		System.out.println("New classic added");
	}
	
	public String createNotes() {
		return "Method createNotes called from Classic"; 	
	}
	
	public String binding() {
		return "Method binding called from Classic"; 	
	}
	
	public int getOrigPubYear() {
		return origPubYear;
	}

	public void setOrigPubYear(int origPubYear) {
		this.origPubYear = origPubYear;
	}

	public Author getTheAuthor() {
		return theAuthor;
	}

	public void setTheAuthor(Author theAuthor) {
		this.theAuthor = theAuthor;
		System.out.println("Authors set to: " + theAuthor.getName() + "\n");
	}

	public Publisher[] getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(Publisher[] bookPublisher) {
		this.bookPublisher = bookPublisher;
		System.out.print("Publishers set to: ");
        for (Publisher publisher : bookPublisher) {
            System.out.println(publisher.getName());
        };
	}
}
