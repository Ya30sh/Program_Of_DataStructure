import java.util.Scanner;
public class Suffle{
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

		System.out.println("Enter the number to replace:");
		int m = sc.nextInt();
		System.out.println("Enter the number to replace by:");
		int o = sc.nextInt();

		for(int i = 0;i<n;i++){
			if(a[i] == m){
				a[i]=o;
				System.out.print(i+" ");
			}
		}
	}
}