/*
 * Lab 14 part 2
 * subclass of Person
 */
public class Employee extends Person{
	private int officeNum;
	private int salary;
	private MyDate dateHired;

	public Employee(String name, String address, String phoneNumber, String email, int officeNum, int salary, MyDate dateHired){
		super(name, address, phoneNumber, email);
		this.officeNum = officeNum;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	public int getOfficeNum(){
		return officeNum;
	}
	public int getSalary(){
		return salary;
	}
	public String getDateHired(){
		return dateHired.getDate();
	}
}