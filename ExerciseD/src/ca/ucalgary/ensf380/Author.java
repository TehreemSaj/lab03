package ca.ucalgary.ensf380;

public class Author {
	private String name = "Unkown";
	private String address;
	private int age;
	
	public Author() {}
	
	public Author(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		System.out.println("New author added\nName: " + this.getName() + "\nAddress: " + this.getAddress() +
				"\nAge: " + this.getAge() + "\n");
	}
	
	public String write() {
		return "Method write called from Author"; 
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
