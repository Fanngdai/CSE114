/*
 * Lab 14 part 2
 * subclass of Employee
 * super class Person
 */
public class Staff extends Employee{
	private String title;

	public Staff(String name, String address, String phoneNumber, String email, int officeNum, int salary, MyDate dateHired, String title){
		super(name, address, phoneNumber, email, officeNum, salary, dateHired);
		this.title = title;
	}

	public String toString(){
		String output = "";
		output += "Staff: " + super.getName() + "\n";
		output += "Salary: $" + getSalary() + "\n";
		output += "Date Hired: " + getDateHired() + "\n\n";
		output += "Office: " + getOfficeNum() + "\n";
		output += "Address: " + super.getAddress() + "\n";
		output += "Phone Number: " + super.getPhoneNumber() + "\n";
		output += "Email Address: " + super.getEmail() + "\n";
		return output;
	}
}