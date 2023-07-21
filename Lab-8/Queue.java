// import java.util.Arrays;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Queue: ");
        int n = sc.nextInt();
        QueueImpliment<Integer> q = new QueueImpliment<>(n);
        while(true){
            System.out.println("Enter '1 for enqueue', '2 for dequeue', '3 for display' and '4 for end' ");
            int temp = sc.nextInt();
            switch (temp) {
                case 1:
                    System.out.println("Enter the value to add: ");
                    int temp2 = sc.nextInt();
                    q.enQueue(temp2);
                    break;
                case 2:
                    q.deQueue();
                    break;
                case 3:
                    q.display();
                    break; 
                case 4:
                    System.exit(0);   
                    break;
            }
        }
    }
}

class QueueImpliment<t>{
    int f = 0;
    int r = -1;
    int n;
    Object qr;
    t y;
    Object[] q;

    QueueImpliment(int n){
        q = new Object[n];
        this.n = n;
    }

    void enQueue(t y){
        if(r>=n){
            System.out.println("Queue Overflow");
            return;
        }
        else{
            r++;
            q[r] = y;
        }
    }

    Object deQueue(){
        if(r==-1){
            System.out.println("Queue underflow ");
            return y;
        }
        else{
            qr = q[f];
            if(f==r){
                f=-1;
                r=-1;
                return qr;
            }
            else{
                f++;
                return qr;
            }
        }
    }

    void display(){
        for(int i=(f);i<=r;i++){
            System.out.print(q[i]+" ");
        }
        System.out.println(" ");
        // return(Arrays.toString(q));
    }
}