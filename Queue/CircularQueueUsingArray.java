
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
    if(REAR==QSIZE-1 &&FRONT==0){
        System.out.println("Queue Overflow");
    }else{ 
        if(FRONT==-1)
        FRONT=0;
        REAR=(REAR+1)%QSIZE;
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
        System.out.println("Queue is Empty");
    }else{
        if(REAR>=FRONT){
        for(int i=FRONT;i<=REAR;i++){
            System.out.print(queue[i]+" ");
        }
    }else{
           for(int i=FRONT;i<QSIZE;i++){
            System.out.println(queue[i]+" ");
            } 
            for(int i=0;i<=REAR;i++){
            System.out.println(queue[i]+" ");
            }
            }
    
        System.out.println();
    }
}
 }

public class CircularQueueUsingArray {
    public static void main(String[] args) {
        /*
       Scanner sc=new Scanner(System.in);
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
            default:System.out.println("invalid choice");
        }
        }*/
            MyQueue ob=new MyQueue();
        ob.enqueue(8);
        ob.enqueue(10);
        ob.enqueue(7);
        ob.view();
        ob.dequeue();
        ob.view();
                   
        }
    }
    
