import java.util.Scanner;
import java.util.Stack;

public class EvaluatePostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> s = new Stack<>();
        System.out.println("Enter the postfix eqaution");
        String str = sc.next();
        int value = 0;
        int op1 = 0;
        int op2 = 0;

        for(int i = 0;i<str.length();i++){
            String temp = str.charAt(i)+"";

            if(!temp.equals("+") && !temp.equals("-") && !temp.equals("*") && !temp.equals("/")){
                s.push(temp);
            }
            else{
                op2 = Integer.parseInt(s.pop());
                op1 = Integer.parseInt(s.pop());
            }

            if(temp.equals("+")){
                value = op1 + op2;
                s.push(value+"");
            }
            else if(temp.equals("-")){
                value = op1 - op2;
                s.push(value+"");
            }
            else if(temp.equals("*")){
                value = op1 * op2;
                s.push(value+"");
            }
            else if(temp.equals("/")){
                value = op1 / op2;
                s.push(value+"");
            }
        }

        System.out.println(s.pop());
        sc.close();
    }
}
