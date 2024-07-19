package ca.ucalgary.ensf380;

public abstract class Fiction extends Paperback {
	
	public abstract String coverArt();
	
	public String genre() {
		return "Method genre called from Fiction"; 	
	}
	
	 public Fiction(String isbn, int pages) {
	    super(isbn, pages);
	 }
	 
	 public Fiction() {
		super();
	 }
	 
}
