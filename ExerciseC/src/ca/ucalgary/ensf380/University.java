package ca.ucalgary.ensf380;

public class University {

	public static void main(String[] args) {
		//Add a new professor
		Professor trump = new Professor(75000);
		
		//Add professor info
		trump.setName("Joseph Trump");
		trump.setPhoneNumber("403-333-4444");
		trump.setEmailAddress("JosephTrump@ucalgary.ca");
		Address trumpAddress = new Address("539 Erin Woods Terrace SE", "Calgary", "Alberta", "T2B 2X9", "Canada");
		trump.setAddress(trumpAddress);
		//Check if Trump's address is valid
		trump.hasValidAddress();
		
		//Add professor's students
		//Create Michael Smith and add info
		Student smith = new Student(trump, 85);
		smith.setName("Michael Smith");
		smith.setPhoneNumber("403-555-6666");
		smith.setEmailAddress("michealsmith@ucalgary.ca");
		Address smithAddress = new Address("123 Maple Street NW", "Calgary", "Alberta", "T2N 1N4", "Canada");
		smith.setAddress(smithAddress);
		//Check if Michael's address is valid
		trump.hasValidAddress();
		
		
		//Create Emily Scott and add info
		Student scott = new Student(trump, 92);
		scott.setName("Emily Scott");
		scott.setPhoneNumber("403-777-8888");
		scott.setEmailAddress("EmilyScott2@ucalgary.ca");
		Address scottAddress = new Address("456 Oak Avenue NE", "Calgary", "Alberta", "T2N $$4", "Canada");
		scott.setAddress(scottAddress);
		//Check if Emily's address is valid
		scott.hasValidAddress();	
		//Fix address
		Address scottNewAddress = new Address("456 Oak Avenue NE", "Calgary", "Alberta", "T2N 1N4", "Canada");
		scott.setAddress(scottNewAddress);
		scott.hasValidAddress();	
		
		//Check if students are eligible to enroll in Trump's program next year
		scott.isEligibleToEnroll();
		smith.isEligibleToEnroll();
	}

}
