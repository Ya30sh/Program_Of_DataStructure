import java.util.Scanner;
public class Factor{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.print("1 ");

		for(int i =2;i<n;i++){
			if(n%i==0){
				System.out.print(i+" ");
			}
		}
		System.out.print(n);
	}
}