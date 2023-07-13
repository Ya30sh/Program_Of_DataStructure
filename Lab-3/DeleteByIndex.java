import java.util.Scanner;
public class DeleteByIndex{
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

		System.out.println("Enter the index:");
		int in = sc.nextInt();
		int j =(a.length-1);
		in--;

		for(int i = (a.length-1);i>=0;i--){
			if(i!=in){
				a[j]=a[i];
				j--;
			}
		}

		for(int i = 1;i<a.length;i++){
			System.out.println("Value at index "+(i)+" is "+(a[i]));
		}
		sc.close();
	}
}