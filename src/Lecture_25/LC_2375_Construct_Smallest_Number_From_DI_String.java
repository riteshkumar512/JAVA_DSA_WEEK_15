package Lecture_25;

import java.util.Stack;

public class LC_2375_Construct_Smallest_Number_From_DI_String {
    public static void main(String[] args) {
        String s="IIIDIDDD";
        System.out.println(Construct_Smallest_Num(s));
    }
    public static String Construct_Smallest_Num(String s){
        int n=s.length();
        int[] ans=new int[n+1];
        Stack<Integer> st=new Stack<>();
        int c=1;
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == 'I') {
                ans[i] = c++;
                while (!st.isEmpty()) {
                    ans[st.pop()] = c++;
                }
            } else {
                st.push(i);
            }
        }
            String str="";
            for (int x : ans){
                str=str+x;
            }
            return str;

        }

    }
