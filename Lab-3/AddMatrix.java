import java.util.Scanner;
public class AddMatrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[2][2]; 
		int b[][] = new int[2][2];

		for(int i = 0;i<2;i++){
			for(int j = 0;j<2;j++){
				System.out.println("Enter the value of index ["+(i+1)+"]["+(j+1)+"] : ");
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("For Matrix B");
		for(int i = 0;i<2;i++){
			for(int j = 0;j<2;j++){
				System.out.println("Enter the value of index ["+(i+1)+"]["+(j+1)+"] : ");
				b[i][j] = sc.nextInt();
			}
		}

		for(int i = 0;i<2;i++){
			for(int j = 0;j<2;j++){
				System.out.println("Value at index ["+(i+1)+"]["+(j+1)+"] : "+(a[i][j] + b[i][j]));
			}
		}
		sc.close();
	}
}