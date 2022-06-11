package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class first {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length; i++) {
        char ch = str.charAt(i);
        if (ch == ')'){
            if (st.peek() == '('){
                System.out.println(true);
                return;

            }else {
//                            popping till the opening bracket comes
                while (st.peek() != '('){
                    st.pop();
                }
//                            popping the opening bracket
                st.pop();
            }


        }else {
            st.push(ch);
        }
    }

//    String khatam ho gaya but duplicacy nahi mila..
//        so print false
        System.out.println(false);
}



