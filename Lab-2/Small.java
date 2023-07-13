import java.util.Scanner;
public class Small{
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

		int small = a[0];
		int index = 0;

		for(int i = 0;i<n;i++){
			if(small>a[i]){
				small = a[i];
				index = i;
			}
		}

		System.out.println("Index is "+index);
	}
}