import java.util.Scanner;
public class SwapNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int a = sc.nextInt();
		System.out.println("Enter the another value: ");
		int b = sc.nextInt();

		change(a,b);
		sc.close();
	}

	static void change(int a, int b){
		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("A is: "+a);
		System.out.println("B is: "+b);
	}
}