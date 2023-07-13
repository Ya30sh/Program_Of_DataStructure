import java.util.Scanner;
public class SumOfArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;

		System.out.println("Enter the starting point: ");
		int m = sc.nextInt();
		System.out.println("Enter the ending point: ");
		int n = sc.nextInt();

		for(int i = m;i<=n;i++){
			ans = ans + i;
		}

		System.out.println("total is: "+(ans));
	}
}