import java.util.Scanner;
import java.util.Arrays;

public class CircularQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Circular queue: ");
        int n = sc.nextInt();
        Impliment cq = new Impliment(n);
        while (true) {
            System.out.println("Enter '1 for insert', '2 for delete', '3 for display' and '4 for end' ");
            int temp = sc.nextInt();
            switch (temp) {
                case 1:
                    System.out.println("Enter the value to add: ");
                    int temp2 = sc.nextInt();
                    cq.insert(temp2);
                    break;
                case 2:
                    System.out.println(cq.delete());
                    break;
                case 3:
                    cq.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}

class Impliment {
    int r = -1;
    int f = -1;
    int cq[];
    int n;
    int y;

    Impliment(int n) {
        cq = new int[n];
        this.n = n;
    }

    void insert(int y) {
        if (r == n - 1) {
            r = 0;
        } else {
            r++;
        }
        if (f == r) {
            if(r==0){
                r=n-1;
            }
            System.out.println("Queue overflow: ");
            return;
        }
        cq[r] = y;
        if (f == -1) {
            f = 0;
        }
    }

    int delete() {
        if (r == -1 || f == -1) {
            System.out.println("Queue Underflow");
            return 0;
        } else {
            y = cq[f];
            if (r == f) {
                r = 0;
                f = 0;
                return y;
            } else if (f == n - 1) {
                f = 0;
                return 0;
            } else {
                f++;
                return y;
            }
        }
    }

    void display() {
        System.out.println(Arrays.toString(cq));
        if (f <=r) {
            for (int i = f; i <= r; i++) {
                System.out.print(cq[i] + " ");
            }
            System.out.println(" ");
        } else {
            for (int i = f; i <n; i++) {
                System.out.print(cq[i] + " ");
            }
            for (int i = 0; i <=r; i++) {
                System.out.print(cq[i] + " ");
            }
            System.out.println(" ");
        }
    }
}