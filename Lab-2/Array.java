import java.util.Scanner;
public class Array{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[];
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		a = new int[n];

		for(int i = 0;i<n;i++){
			System.out.println("Enter the value of index "+(i+1)+" : ");
			a[i] = sc.nextInt();
		}

		for(int i = 0;i<n;i++){
			System.out.println("Value at index "+(i+1)+" is "+(a[i]));
		}
	}
}