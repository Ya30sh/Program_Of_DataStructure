import java.util.Scanner;
public class FactorialWithRecursion{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = sc.nextInt();
		if(n==1 || n==0){
			System.out.println("1");	
		}
		else{
			System.out.println("factorial is: "+factorial(n));
		}
	}

	static int factorial(int n){
		if(n>1){
			return (n * factorial(n-1));
		}
		else{
			return 1;
		}
	}
}
