import java.util.Scanner;
public class FactorialWithLoop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for factorial: ");
		int n = sc.nextInt();
		int ans =1;

		while(n>1){
			ans = ans * n;
			n--;
		}

		System.out.println("factorial is "+ans);
	}
}