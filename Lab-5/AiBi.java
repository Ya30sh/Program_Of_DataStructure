import java.util.Scanner;

public class AiBi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st = sc.next();
        String sr = st.toLowerCase();
        int counta = 0;
        int countb = 0;
        Stack a = new Stack(st.length());
        Stack b = new Stack(st.length());
        
        for(int i = 0; i<sr.length();i++){
            if(sr.charAt(i) == 'a'){
                a.push('a');
                counta++;
            }
            else{
                b.push('b');
                countb++;
            }
        }

        if(counta == countb){
            System.out.println("Valid String ");
        }
        else{
            System.out.println("Invalid String ");
        }
        sc.close();
    }
}

class Stack{
    int top = -1;
    int n;
    char s[];

    Stack(int n){
        this.n = n;
        s = new char[n];
    }

    void push(char c){
        top++;
        s[top] = c;
    }
}