package ca.ucalgary.ensf380;

public class Anthology extends Fiction {
	private Story[] stories;
	
	public Anthology() {
		System.out.println("New Anthology created");
	}
	public String coverArt() {
		return "Method coverArt called from Anthology"; 				
	}
	public String storyOrder() {
		return "Method storyOrder called from Anthology"; 	
	}

	public Story[] getStories() {
		return stories;
	}

	public void setStories(Story[] stories) {
		int i = 0;
		for (Story story : stories) {
			i++;
		}
		this.stories = stories;
		System.out.println(i+" stories added");
	}
}
