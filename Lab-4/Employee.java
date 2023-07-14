import java.util.Scanner;
public class Employee{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee_Detail ed = new Employee_Detail();
		ed.getDetail();
		ed.showDetail();
		sc.close();
	}
}

class Employee_Detail{
	Scanner sc = new Scanner(System.in);
	long employeeId;
	String name;
	String designation;
	double salary;

	void getDetail(){
		System.out.println("Enter the Employee_ID: ");
		employeeId = sc.nextLong();
		System.out.println("Enter the Name: ");
		name = sc.next();
		System.out.println("Enter the Designation: ");
		designation = sc.next();
		System.out.println("Enter the Salary: ");
		salary = sc.nextDouble();
	}

	void showDetail(){
		System.out.println(employeeId);
		System.out.println(name);
		System.out.println(designation);
		System.out.println(salary);
	}
}