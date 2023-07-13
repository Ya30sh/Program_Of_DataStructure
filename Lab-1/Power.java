import java.util.Scanner;
public class Power{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base: ");
		int base = sc.nextInt();
		System.out.println("Enter the Power: ");
		int power = sc.nextInt();
		int ans = 1;

		for(int i = 1;i<=power;i++){
			ans = ans * base;
		}

		System.out.println("Answe is "+ans);
	}
}