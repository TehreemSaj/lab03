package ca.ucalgary.ensf380;

public class Professor extends Person {
	private String teacherNumber;
	private double Salary;
	
	public Professor(double salary) {
		super();
		this.teacherNumber = nextPersonalNumber((short) 1);
		Salary = salary;
		System.out.println("\nNew professor added with id "+this.getTeacherNumber()+" and salary $"+ this.getSalary());
	}

	public String getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
}
