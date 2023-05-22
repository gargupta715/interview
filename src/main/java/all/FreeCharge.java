package all;

import java.util.Stack;

public class FreeCharge {
    public static void main(String args[]){
        String s = "{{((((((" ;
        Stack<Character> st = new Stack();
        for(int i =0;i < s.length();i++)
        {
            char c = s.charAt(i);
            switch (c){
                case '(':
                case '{' :
                case '[':
                    st.push(c);
                    break;
                case ')' :
                    if(!st.empty() && '(' == st.peek())
                        st.pop();
                    break;
                case '}':
                    if(!st.empty() && '{' == st.peek())
                        st.pop();
                    break;
                case ']':
                    if(!st.empty() && '[' == st.peek())
                        st.pop();
                    break;
            }
        }

        if(st.size()==0)
            System.out.println("True");
        else
            System.out.println("False");


    }
}
