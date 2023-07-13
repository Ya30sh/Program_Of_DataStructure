import java.util.Scanner;
public class ArrayInsertWithSingle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[];
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		a = new int[n+1];

		for(int i = 0;i<n;i++){
			System.out.println("Enter the value of index "+(i+1)+" : ");
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the index:");
		int in = sc.nextInt();
		System.out.println("Enter the Value:");
		int va = sc.nextInt();
		int j =(a.length-1);
		in--;

		for(int i = (a.length-2);i>=0;i--){
			if(j==in){
				a[j] = va;
				i++;
				j--;
			}
			else{
				a[j]=a[i];
				j--;
			}
		}

		for(int i = 0;i<a.length;i++){
			System.out.println("Value at index "+(i+1)+" is "+(a[i]));
		}
		sc.close();
	}
}