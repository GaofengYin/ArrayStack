/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_36233_36232;

import Stack.ArrayStack;
import Stack.Stack;

/**
 *
 * @author Francisco José Silva de Azevedo , a36232 , EI
 * @author Gaofeng Yin , a36233 , EI
 */
public class Tp2_36233_36232 {

    public static String verificaIntigridade(String str) {

        Stack<Character> stack = new ArrayStack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '[' || ch == '(' || ch == '{') {

                stack.push(ch);

            } else if ((ch == ']' || ch == '}' || ch == ')') && (!stack.isEmpty())) {

                if (((char) stack.top() == '(' && ch == ')') || ((char) stack.top() == '{' && ch == '}') || ((char) stack.top() == '[' && ch == ']')) {
                    stack.pop();
                } else {
                    return "False";
                }
            } else {

                if ((ch == ']' || ch == '}' || ch == ')')) {

                    return "False";

                }
            }
        }
        if (stack.isEmpty()) {
            return "True";
        } else {
            return "False";
        }
    }

    public static void main(String[] args) {
        String[] str = {"([{}])","(["};
        int i;
        if (str == null) {
            System.out.println("Empty String");
            return;
        }
        for(i=0; i<2; i++){
            System.out.println("Integridade dos parêntesis " + str[i]+ " ? : " + verificaIntigridade(str[i]));
        } 
        
    }

}
