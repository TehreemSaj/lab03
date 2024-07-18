package ca.ucalgary.ensf380;

public class Address {
	private String street;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	
	public Address(String street, String city, String state, String postalCode, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		System.out.println("New address added:\n" + outputAsLabel());

	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean validate() {
        // Check that none of the fields are empty
        if (street == null || street.isEmpty() ||
            city == null || city.isEmpty() ||
            state == null || state.isEmpty() ||
            postalCode == null || postalCode.isEmpty() ||
            country == null || country.isEmpty()) {
        	System.out.println("This is not a valid address");
            return false;
        }
        
        //Check postal code format to ensure only spaces, hyphens or alphanumeric characters are used
        String postalCodePattern = "^[A-Za-z0-9 -]+$"; 
        if (!this.postalCode.matches(postalCodePattern)) {
        	System.out.println("This is not a valid postal code. Please make sure only spaces, hyphens "
        			+ "or alphanumeric characters are used\n");
            return false;
        }
        
    	System.out.println("This is a valid address");        
        return true;
    }
	
	public String outputAsLabel() {
	    return String.format("%s\n%s\n%s\n%s\n%s", street, city, state, postalCode, country);
	}
}
