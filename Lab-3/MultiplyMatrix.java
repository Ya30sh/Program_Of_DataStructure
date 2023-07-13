import java.util.Scanner;
public class MultiplyMatrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][2]; 
		int b[][] = new int[2][3];

		for(int i = 0;i<3;i++){
			for(int j = 0;j<2;j++){
				System.out.println("Enter the value of index ["+(i+1)+"]["+(j+1)+"] : ");
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("For Matrix B");
		for(int i = 0;i<2;i++){
			for(int j = 0;j<3;j++){
				System.out.println("Enter the value of index ["+(i+1)+"]["+(j+1)+"] : ");
				b[i][j] = sc.nextInt();
			}
		}

		for(int i = 0;i<3;i++){
			int temp = a[i][0];
			int temp2 = a[i][1];
			for(int j = 0;j<3;j++){
				System.out.println("Value at index ["+(i+1)+"]["+(j+1)+"] : "+((temp * b[0][j]) + (temp2 * b[1][j])));
			}
		}
		sc.close();
	}
}