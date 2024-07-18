package ca.ucalgary.ensf380;

abstract class Person {
	protected String name;
	protected String phoneNumber;
	protected String emailAddress;
	protected Address address;
	private static int lastPersonalNumber;
	
	public Person() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Person name set to: " + this.getName());
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		System.out.println(this.getName() + " phone number set to: " + this.getPhoneNumber());
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println(this.getName() + " email address set to: " + this.getEmailAddress());
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	protected String nextPersonalNumber(short type) {
        lastPersonalNumber++;
        return String.format("%d%05d", type, lastPersonalNumber);
    }
    
    public boolean hasValidAddress() {
        return this.address.validate();
    }
}
