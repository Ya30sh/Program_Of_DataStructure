import java.util.Scanner;
public class MergeArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], b[];
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		a = new int[n];

		for(int i = 0;i<a.length;i++){
			System.out.println("Enter the value of index "+(i+1)+" : ");
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the size of array: ");
		n = sc.nextInt();
		b = new int[n];

		for(int i = 0;i<b.length;i++){
			System.out.println("Enter the value of index "+(i+1)+" : ");
			b[i] = sc.nextInt();
		}

		int c[] = new int[a.length + b.length];

		int j = 0;
		for(int i = 0;i<c.length;i++){
			if(i<a.length){
				c[i]=a[i];
			}
			else{
				c[i] = b[j];
				j++;
			}
		}

		for(int i = 0;i<c.length;i++){
			System.out.println("Value at index "+(i+1)+" is "+(c[i]));
		}
		sc.close();
	}
}