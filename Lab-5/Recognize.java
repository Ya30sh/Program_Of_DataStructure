import java.util.Scanner;

public class Recognize {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String ss = sc.next();
		String sr = ss.toLowerCase();
		Stack s = new Stack((sr.length() + 2));
		s.push('c');
		int i = 0;
		char x = 'a';
		boolean valid = true;

		while (i < sr.length() && sr.charAt(i) != 'c') {
			if (sr.charAt(i) == ' ') {
				System.out.println("Invalid String");
				return;
			} else {
				if (i <= sr.length() - 1) {
					s.push(sr.charAt(i));
					if (i < sr.length()) {
						i++;
					}
				}
			}
		}

		int cin = sr.indexOf('c');

		if ((sr.length() - 1 - i) != cin) {
			System.out.println("Invalid String");
			return;
		}

		x = s.pop();
		if (i < sr.length()) {
			while (x != 'c') {
				if (sr.charAt(i + 1) != x) {
					System.out.println("Invalid String 2");
					valid = false;
					return;
				}
				i++;
				x = s.pop();
			}

			if (valid) {
				System.out.println("Valid String");
			}
		}

		else {
			System.out.println("Invalid String ");
		}
	}
}

class Stack {
	Scanner sc = new Scanner(System.in);
	int top = -1;
	char s[];
	int n;

	Stack(int n) {
		this.n = n;
		s = new char[n];
	}

	void push(char x) {
		if (top >= n) {
			System.out.println("Stack Overflow");
			return;
		}
		top++;
		s[top] = x;
	}

	char pop() {
		if (top <= -1) {
			System.out.println("Stack Underflow");
			return '-';
		}

		top--;
		return (s[top + 1]);
	}
}