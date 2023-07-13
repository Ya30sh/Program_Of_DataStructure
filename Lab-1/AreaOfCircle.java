import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius  = sc.nextInt();

		double area = radius * radius * (Math.PI);
		System.out.println(area);
	}
}