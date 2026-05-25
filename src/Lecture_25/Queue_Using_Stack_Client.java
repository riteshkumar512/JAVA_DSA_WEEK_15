package Lecture_25;

public class Queue_Using_Stack_Client {
    public static void main(String[] args) {
        Queue_Using_Stack q=new Queue_Using_Stack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.dequeue());
        System.out.println(q.getfront());


    }
}
