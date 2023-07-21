import java.util.Scanner;
import java.util.Stack;

public class EvaluatePrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prefix equation: ");
        String str = sc.next();
        int value = 0;
        int op1 = 0;
        int op2 = 0;

        Stack<String> s = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {
            String temp = str.charAt(i) + "";

            if (!temp.equals("+") && !temp.equals("-") && !temp.equals("*") && !temp.equals("/")) {
                s.push(temp);
            } else {
                op1 = Integer.parseInt(s.pop());
                op2 = Integer.parseInt(s.pop());
            }

            if (temp.equals("+")) {
                value = op1 + op2;
                s.push(value + "");

            } else if (temp.equals("-")) {
                value = op1 - op2;
                s.push(value + "");

            } else if (temp.equals("*")) {
                value = op1 * op2;
                s.push(value + "");
            } else if (temp.equals("/")) {
                value = op1 / op2;
                s.push(value + "");

            }
            // else if(temp == "^" or temp == "$"){
            // value = op1 op2;
            // }
        }
        System.out.println(s.pop());
        sc.close();
    }
}
