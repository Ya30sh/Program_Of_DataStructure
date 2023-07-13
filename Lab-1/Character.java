import java.util.Scanner;
public class Character{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		String c = sc.next();
		// char c  = sc.next().CharAt(0); 
		if(c.equalsIgnoreCase("A") || c.equalsIgnoreCase("E") || c.equalsIgnoreCase("I") || c.equalsIgnoreCase("O") || c.equalsIgnoreCase("U")){
			System.out.println("It's Vowel ");
		}
		else{
			System.out.println("It's consonant ");
		}
	}
}