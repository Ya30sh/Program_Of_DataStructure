import java.util.Scanner;
public class Stack{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		String x;
		int check,i;
		StackMethod s = new StackMethod(size);

		while(true){
			System.out.println("Enter the '1' for push element: ");
			System.out.println("Enter the '2' for pop element: ");
			System.out.println("Enter the '3' for peep element: ");
			System.out.println("Enter the '4' for change element: ");
			System.out.println("Enter the '5' for display element: ");
			System.out.println("Enter the '6' for Exit: ");
			check = sc.nextInt();

			switch (check){
			case 1:
				System.out.println("Enter the element to push ");
				x = sc.next();
				s.push(x);
				break;
			case 2:
				System.out.println(s.pop());
				break;
			case 3:
				System.out.println("Enter the element to wnats to see to from top");
				i = sc.nextInt();
				System.out.println(s.peep(i));
				break;
			case 4:
				System.out.println("Enter the index at wants to change the element: ");
				i= sc.nextInt();
				System.out.println("Enter the Element: ");
				x= sc.next();
				s.change(i,x);
				break;
			case 5:
				s.display();
				System.out.println("");
				break;
			case 6:
				System.exit(0);
				break;
			}
		}
	}
}

class StackMethod{
	Scanner sc = new Scanner(System.in);
	int top = -1;
	String s[];
	int n;

	StackMethod(int n){
		this.n = n;
		s = new String[n];
	}


	void push(String x){
		if(top>=n){
			System.out.println("Stack Overflow");
			return;
		}
		else{
			top++;
			s[top] = x;
			return;
		}
	}

	String pop(){
		if(top == 0){
			System.out.println("Stack Underflow");
			return "-1";
		}
		else{
			top--;
			return (s[top+1]);
		}
	}

	String peep(int i){
		if((top-i+1) <= 0){
			System.out.println("Stack Underflow");
			return "0";
		}

		else{
			return (s[top-i+1]);
		}
	}

	void change(int i, String x){
		if((top-i+1) <= 0){
			System.out.println("Stack Underflow");
			return;
		}
		else{
			s[top-i+1] = x;
			return;
		}
	}

	void display(){
		for(int i = top;i>=0;i--){
			System.out.print(s[i]+" ");
		}
	}
}