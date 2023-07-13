import java.util.Scanner;
public class AverageOfArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int ans = 0;

		for(int i = 1;i<=n;i++){
			ans = ans +i;
		}

		System.out.println("average is "+(ans/n));
	}
}