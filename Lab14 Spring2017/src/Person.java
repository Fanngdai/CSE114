/*
 * Lab 14 part 2
 * Super class of Student, Employee, Faculty and Staff
 */
public class Person {	
	private String name;
	private String address;
	private String phoneNumber;
	private String email;

	public Person(String name, String address, String phoneNumber, String email){
		this.name = name;
		this.address = address;
		this.phoneNumber= phoneNumber;
		this.email = email;
	}
	public String getName(){
		return this.name;
	}
	public String getAddress(){
		return this.address;
	}
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
	public String getEmail(){
		return this.email;
	}
}