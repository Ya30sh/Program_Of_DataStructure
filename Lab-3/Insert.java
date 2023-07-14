import java.util.Scanner;

public class Insert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean change = false;
		int a[];
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		a = new int[n+1];

		for(int i = 0;i<n;i++){
			System.out.println("Enter the value of index "+(i+1)+" : ");
			a[i] = sc.nextInt();
		}
		int in =0;
		System.out.println("Enter the Value:");
		int va = sc.nextInt();


		for(int i=0;i<a.length-1;i++){
			if(a[i]<va){
				in = i+1;
				// break;
			}
		}
		System.out.println(in+"index");
		int j =(a.length-1);

		for(int i = (a.length-2);i>=0;i--){
			if(j==in){
				a[j] = va;
				i++;
				j--;
				change = true;
			}
			else{
				a[j]=a[i];
				j--;
			}
		}

		if(!change){
			a[0] = va;
		}

		for(int i = 0;i<a.length;i++){
			System.out.println("Value at index "+(i+1)+" is "+(a[i]));
		}
		sc.close();
	}
}