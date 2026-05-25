package Lecture_24;

public class Student_Client {
    public static void main(String[] args) {
        Student s=new Student("Raj",23);
        System.out.println(s);//Print refernce packagename.classname +@ some hexavalue
        String s1="Hello";
        System.out.println(s1);//Print Hello
        Student s2=new Student("Ankita",23);
        System.out.println(s2);


    }
}
