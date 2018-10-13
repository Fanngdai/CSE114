import java.util.Scanner;

public class Driver{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		int creator;
		String name, address, phoneNumber, email;
		String status;
		int officeNum, salary;
		String officeHours, rank, title;
		String temp;
		MyDate dateHired;
		
		System.out.println("Enter");
		System.out.println("1)To create a student");
		System.out.print("2)To create an employee:");
		creator = stdin.nextInt();
		stdin.nextLine();
		System.out.print("Enter name:");
		name = stdin.nextLine();
		System.out.print("Enter address:");
		address = stdin.nextLine();
		System.out.print("Enter phone number:");
		phoneNumber = stdin.next();
		System.out.print("Enter email:");
		email = stdin.next();
		

		if(creator == 1){
			System.out.print("Enter student's status:");
			status = stdin.next();
			Student person1 = new Student(name, address, phoneNumber, email, status);
			System.out.print(person1.toString());
		}
		else{
			System.out.println("Enter");
			System.out.println("1)To create a faculty member");
			System.out.print("2)To create a staff member:");
			creator = stdin.nextInt();

			System.out.print("Enter office number:");
			officeNum = stdin.nextInt();
			System.out.print("Enter salary:");
			salary = stdin.nextInt();
			System.out.print("Enter date hired:");
			temp = stdin.next();
			dateHired = new MyDate(temp);

			if(creator == 1){
				stdin.nextLine();
				System.out.print("Enter office hours:");
				officeHours = stdin.nextLine();
				System.out.print("Enter rank:");
				rank = stdin.nextLine();
				
				Faculty person1 = new Faculty(name, address, phoneNumber, email, officeNum, salary, dateHired, officeHours, rank);
				System.out.print(person1.toString());
			}
			else{
				System.out.print("Enter title:");
				title = stdin.next();
				Staff person1 = new Staff(name, address, phoneNumber, email, officeNum, salary, dateHired, title);
				System.out.print(person1.toString());
			}
		}
	}
}