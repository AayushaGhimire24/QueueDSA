//simple (linear queue)
package Queue;
//import java.util.*;
interface Queue{
    void enqueue(int data);
    void dequeue();
    void view();
}
 class MyQueue implements Queue{
     int QSIZE=5;
     int queue[]=new int[QSIZE];
     int REAR=-1,FRONT=-1;
public void enqueue(int data){
    if(REAR==QSIZE-1){
        System.out.println("Queue Overflow");
    }
    else if(REAR==-1){
        REAR++;
        queue[REAR]=data;
        FRONT=0;
    }else{
        REAR++;
        queue[REAR]=data;
    }
}
public void dequeue(){
 if(FRONT==-1){
     System.out.println("Queue Underflow");
 }else{
     System.out.println("Item deleted"+queue[FRONT]);
     queue[FRONT]=0;//optional
     FRONT++;
 }
}
public void view(){
    if(FRONT==-1){
        System.out.println("Queue Empty");
    }else{
        for(int i=FRONT;i<=REAR;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}
}
public class SimpleQueueUsingArray {
    public static void main(String[] args) {
        MyQueue ob=new MyQueue();
        ob.enqueue(8);
        ob.enqueue(10);
        ob.enqueue(7);
        ob.view();
        ob.dequeue();
        ob.view();
        /*menu driven codes:-->*/
       /* Scanner sc=new Scanner(System.in);
        MyQueue ob=new MyQueue();
        while(true){
        System.out.println("1.Enqueue\n 2.Dequeue\n 3.View");
        System.out.println("4.Exit\n Enter your choice:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:System.out.println("Enter a value to insert");
            int val=sc.nextInt();
            ob.enqueue(val);
            break;
            case 2:ob.dequeue();
            break;
            case 3:ob.view();
            break;
            case 4:System.exit(0);
            break;
            default:System.out.println("invalid choice1");
                   
        }
    }*/
}
}