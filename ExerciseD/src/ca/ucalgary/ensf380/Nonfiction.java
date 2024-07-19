package ca.ucalgary.ensf380;

public class Nonfiction extends Paperback {
	private Category deweyClassification;
	
	public Nonfiction() {
		System.out.println("New nonfiction created");
	}
	
	public String topic() {
		return "Method topic called from Nonfiction"; 			
	}
	
	public String coverArt() {
		return "Method coverArt called from Paperback"; 			
	}

	public Category getDeweyClassification() {
		return deweyClassification;
	}

	public void setDeweyClassification(Category deweyClassification) {
		this.deweyClassification = deweyClassification;
		System.out.println("Dewey classification set to: " + deweyClassification.getCategory()+"\n");
	}
}
