/*
 * Lab 14 part 2
 * subclass of Person
 */
public class Student extends Person{
	private final String STATUS;

	public Student(String name, String address, String phoneNumber, String email, String STATUS){
		super(name, address, phoneNumber, email);
		this.STATUS = STATUS;
	}
	public String getStatus(){
		return STATUS;
	}

	public String toString(){
		String output = "";
		output += "Student: " + super.getName() + "\n";
		output += "Status: " + getStatus() + "\n";
		output += "Address: " + super.getAddress() + "\n";
		output += "Phone Number: " + super.getPhoneNumber() + "\n";
		output += "Email Address: " + super.getEmail() + "\n";
		return output;
	}
}