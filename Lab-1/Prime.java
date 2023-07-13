import java.util.Scanner;
public class Prime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long n = sc.nextLong();
		boolean prime = true;

		for(int i = 2;i<=(n/2);i++){
			if(n%i==0){
				prime = false;
				break;
			}
		}
		if(!prime){
			System.out.println("Number is not prime");
		}
		else{
			System.out.println("number is prime");
		}
	}
}