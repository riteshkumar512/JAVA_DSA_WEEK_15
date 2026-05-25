package Lecture_25;

public class Stack_Using_Queue_Client {
    public static void main(String[] args) throws Exception {
        Stack_using_Queue st=new Stack_using_Queue();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
//        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());

    }
}
