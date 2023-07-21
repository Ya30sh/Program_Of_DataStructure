import java.util.Scanner;
import java.util.Stack;

public class PostFix {
   static int gRank(char x){
        if(x=='+' || x=='-'){
            return 2;
        }
        else if(x=='*' || x=='/'){
            return 4;
        }
        else if (x=='^' || x=='$') {
            return 5;
        }
        else if (x=='(') {
            return 0;
        }
        else{
            return 8;
        }
    }

   static int fRank(char x){
        if(x=='+' || x=='-'){
            return 1;
        }
        else if(x=='*' || x=='/'){
            return 3;
        }
        else if (x=='^' || x=='$') {
            return 6;
        }
        else if (x=='(') {
            return 9;
        }
        else if (x==')') {
            return 0;
        }
        else{
            return 7;
        }
    }

   static int rank(char x){
        if(x=='+' || x=='-' || x=='*' || x=='/' || x=='^'){
            return -1;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Equation: ");
        String str = sc.next();
        str = str+")";
        int n = str.length();
        Stack<Object> s = new Stack<>();
        int gRank=0, fRank=0;
        String polish = "";
        int rank = 0;
        s.push('(');

        for (int i=0;i<n;i++) {
            char next = str.charAt(i);
            if (!s.isEmpty()){
                fRank = fRank(str.charAt(i));
                gRank = gRank((char)s.peek());
            }
            if(s.isEmpty()){
                System.out.println("Invalid String ");
                return;
            }
            else{
                while (!s.isEmpty()&&(gRank > fRank) ) {
                    char temp = (char)s.pop();
                    polish = polish + temp;
                    rank = rank + rank(temp);

                    if(rank < 1){
                        System.out.println("Invalid String");
                        return;
                    }
                    // int j = i+1;
                    gRank = gRank((char)(s.peek()));
                    // fRank = fRank(str.charAt(j));
                    // j++;
                }
                if(gRank != fRank){
                    s.push(next);
                }
                else{
                    s.pop();
                }
            }
        }

        if(!s.isEmpty() || rank != 1){
            System.out.println("Invalid string");
        }
        else{
            System.out.println(polish);
        }
        sc.close();
    }
}