import java.util.Scanner;
public class Delete{
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

		System.out.println("Enter the Value:");
		int va = sc.nextInt();
		int j = 0;
		int count = 0;

		for(int i=0;i<n;i++){
			if(a[i] == va){
				while(a[i] < va+1){
					i++;
					count++;
				}
				a[j] = a[i];
				j++;
			}
			else{
				a[j]=a[i];
				j++;
			}
		} 

		for(int i = 0;i<n-count;i++){
			System.out.println("Value at index "+(i+1)+" is "+(a[i]));
		}
		sc.close();
	}
}