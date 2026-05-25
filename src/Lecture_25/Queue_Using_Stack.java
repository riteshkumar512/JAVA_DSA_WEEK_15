package Lecture_25;

import java.util.Stack;

public class Queue_Using_Stack {
    private Stack<Integer> st;
    public Queue_Using_Stack(){
        st=new Stack<>();
    }
    public boolean isEmpty(){
        return st.isEmpty();
    }
    public int size(){
        return st.size();
    }
    //TC->O(N)
    public void enqueue(int item){
        Insert(st,item);
    }
    private static void Insert(Stack<Integer> st,int item){
        if (st.isEmpty()){
            st.push(item);
            return;
        }
        int x=st.pop();
        Insert(st,item);
        st.push(x);

    }
    //O(1)
    public int dequeue(){
        return st.pop();
    }
    public int getfront(){
        return st.peek();
    }

}
