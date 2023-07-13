import java.util.Scanner;
public class Duplicate{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[];
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		a = new int[n];
		boolean duplicate = false;

		for(int i = 0;i<n;i++){
			System.out.println("Enter the value of index "+(i+1)+" : ");
			a[i] = sc.nextInt();
		}

		for(int i = 0;i<n;i++){
			for(int j = i+1;j<n;j++){
				if(a[i]==a[j]){
					duplicate = true;
					break;
				}
			}
		}

		if(duplicate){
			System.out.println("Duplicate exsits");
		}
		else{
			System.out.println("Duplicate doesnt exsits");
		}
	}
}