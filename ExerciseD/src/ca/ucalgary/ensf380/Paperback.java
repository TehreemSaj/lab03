package ca.ucalgary.ensf380;

public abstract class Paperback extends Book {
	public abstract String coverArt();
	
	public Paperback(String isbn, int pages) {
		super(isbn, pages);
	}
	
	 public Paperback() {
		super();
	 }
}
