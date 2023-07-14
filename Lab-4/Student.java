import java.util.Scanner;
public class Student{
	public static void main(String[] args){
		Student_Detail[] sd = new Student_Detail[5];

		for(int i = 0;i<5;i++){
			sd[i] = new Student_Detail();
		}

		for(int i = 0; i<5;i++){
			System.out.println("Enter Detail of Student"+(i+1));
			sd[i].getStudentDetail();
		}

		for(int i = 0; i<5;i++){
			System.out.println("Detail of Student"+(i+1));
			sd[i].showStudentDetail();
		}
	}
}

class Student_Detail{
	Scanner sc = new Scanner(System.in);
	long enrollment;
	String name;
	int semester;
	double cpi;

	void getStudentDetail(){
		System.out.println("Enter Enrollment: ");
		enrollment = sc.nextLong();
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter Semester: ");
		semester = sc.nextInt();
		System.out.println("Enter CPI: ");
		cpi = sc.nextDouble();
	}

	void showStudentDetail(){
		System.out.println(enrollment);
		System.out.println(name);
		System.out.println(semester);
		System.out.println(cpi);
	}
}