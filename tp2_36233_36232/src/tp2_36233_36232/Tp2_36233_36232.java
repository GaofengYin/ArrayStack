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
            char inic = str.charAt(i);
            if (inic == '[' || inic == '(' || inic == '{') {
                stack.push(inic);
            } else if ((inic == ']' || inic == '}' || inic == ')') && (!stack.isEmpty())) {
                if (((char) stack.top() == '(' && inic == ')') || ((char) stack.top() == '{' && inic == '}') || ((char) stack.top() == '[' && inic == ']')) {
                    stack.pop();
                } else {
                    return "False";
                }
            } else {
                if ((inic == ']' || inic == '}' || inic == ')')) {
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

        String str[] = {"(abcd)", "{f>{e>{d>{a<b}}", "{7+{6-{5+{2+2}}})", "{{b{ana}}na}(m)", "{j{d{m}d}](m)", "{{}}([]){}{}{}{}{[[[[]]]]}"};
        int i;
        if (str.length == 0) {
            System.out.println("String esta vazia.");
            return;
        }
        for (i = 0; i < str.length; i++) {
            System.out.println("Integridade dos parêntesis " + str[i] + " ? : " + verificaIntigridade(str[i]));
        }
    }
}
