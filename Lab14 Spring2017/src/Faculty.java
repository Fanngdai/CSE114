/*
 * Lab 14 part 2
 * subclass of Employee
 * super class person
 */
public class Faculty extends Employee{
	private String officeHours;
	private String rank;

	public Faculty(String name, String address, String phoneNumber, String email, int officeNum, int salary, MyDate dateHired, String officeHours, String rank){
		super(name, address, phoneNumber, email, officeNum, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	public String getOfficeHours(){
		return officeHours;
	}
	public String getRank(){
		return rank;
	}

	public String toString(){
		String output = "";
		output += "Faculty: " + super.getName() + "\n";
		output += "Rank: " + getRank() + "\n";
		output += "Salary: $" + getSalary() + "\n";
		output += "Date Hired: " + getDateHired() + "\n\n";
		output += "Office Hours: " + getOfficeHours() + "\n";
		output += "Office: " + getOfficeNum() + "\n";
		output += "Address: " + super.getAddress() + "\n";
		output += "Phone Number: " + super.getPhoneNumber() + "\n";
		output += "Email Address: " + super.getEmail() + "\n";
		return output;
	}
}