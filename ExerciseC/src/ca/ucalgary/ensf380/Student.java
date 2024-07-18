package ca.ucalgary.ensf380;

public class Student extends Person {
	private String studentNumber;
	private Professor supervisor;
	private double averageMark;
	
	public Student(Professor supervisor, double averageMark) {
		super();
		this.studentNumber = nextPersonalNumber((short) 2);
		this.supervisor = supervisor;
		this.averageMark = averageMark;
		System.out.println("\nNew student added with student number "+this.getStudentNumber()+" and average mark "+ this.getAverageMark() + 
				" under the supervision of Professor " + this.getSupervisor().getName());
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Professor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Professor supervisor) {
		this.supervisor = supervisor;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}
	
	public boolean isEligibleToEnroll() {
		if (this.averageMark > 90) {
			System.out.println("\n" + this.getName() + " is eligible to enroll");
			return true;
		}
		else {
			System.out.println("\n" + this.getName() + " is not eligible to enroll");
			return false;
		}
	}
}
