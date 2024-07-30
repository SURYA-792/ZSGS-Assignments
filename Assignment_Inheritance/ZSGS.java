package Assignment_Inheritance;

public class ZSGS {
	public static void main(String[] args) {
		ZSGSStudent student = new ZSGSStudent();
	}
	private int assignmentsCount;
	private String wifiPassword;

	ZSGS() {
		System.out.println("super class parameterless constructor");
		//ZSGSStudent student = new ZSGSStudent();
		// It gives StackOverflow Exception because this object will calls both parent and child constructor infinite times,
	}

	public ZSGS(int assignmentsCount, String wifiPassword) {
		this();
		// this keyword used to call same class overloaded constructor
//		super();
		this.assignmentsCount = assignmentsCount;
		this.wifiPassword = wifiPassword;
		System.out.println("super class parameterized constructor");
	}

}

class ZSGSStudent extends ZSGS {
	private int studentId;
	private String name;
	private String adress;
	private String Qualification;
	private int batch;
	public ZSGSStudent(int studentId, String name, String adress, String qualification, int batch) {
		this.studentId = studentId;
		this.name = name;
		this.adress = adress;
		Qualification = qualification;
		this.batch = batch;
		System.out.println("child class parameterized constructor");
	}
	public ZSGSStudent() {
		super(10,"zohoGuest");
		// Using super we can call super class constructor
		System.out.println("clild class parameterless constructor");
	}

}