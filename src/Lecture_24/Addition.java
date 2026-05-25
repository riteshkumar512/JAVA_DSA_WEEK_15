package Lecture_24;
//Method overloading
public class Addition {
    public static void main(String[] args) {
        System.out.println(add(2,9));
        System.out.println(add(6,8,5));
        System.out.println(add(2,5,8l));
        System.out.println(add(2,6.9));
        System.out.println(add(8,2,5,8,6,8,69,5,4,5,8,6,9,8,4,1,25,15,15,5));
    }
    public static int add(int x,int y){
        return x+y;
    }
    public static int add(int x,int y,int z){
        return x+y+z;
    }
    public static int add(int x,int y,long z){
        return (int) (x+y+z);
    }
    public static int add(int x,double y){
        return (int) (x+y);
    }
    //Variable no of arguments
    public static int add(int x,int ...a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }
}
