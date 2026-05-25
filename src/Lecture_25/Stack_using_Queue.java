package Lecture_25;

import Lecture_24.Dynamic_Queue;

public class Stack_using_Queue {
        Dynamic_Queue dq;

    public Stack_using_Queue(){
        dq=new Dynamic_Queue();
    }
    public boolean isEmpty(){
        return dq.isEmpty();
    }
    public int size(){
        return dq.size();
    }
    //    TC->O(1)
    public void push(int item) throws Exception{
        dq.enqueue(item);
    }
    //    TC->O(N)
    public int pop() throws Exception {
        Dynamic_Queue hlp=new Dynamic_Queue();
        while (dq.size()>1){
            hlp.enqueue(dq.dequeue());
        }
        int x=dq.dequeue();
        while (hlp.size()>0){
            dq.enqueue(hlp.dequeue());
        }
         return x;
    }
//    TC->O(N)
    public int peek() throws Exception {
        Dynamic_Queue hlp=new Dynamic_Queue();
        while (dq.size()>1){
            hlp.enqueue(dq.dequeue());
        }
        int x=dq.dequeue();
        while (hlp.size()>1){
            dq.enqueue(hlp.dequeue());
        }
        dq.enqueue(x);
        return x;
    }

}
