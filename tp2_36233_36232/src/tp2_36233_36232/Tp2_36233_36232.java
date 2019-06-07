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
 * @version 1.0
 * @since 1.0;
 */
public class Tp2_36233_36232 {

    /**
     * Metodo para verificar integridade dos parenteses.
     * Este metodo cria um arraystack que guarda os '(','{'e'['. Com o ciclo for percorremos a string e ao encontrar o carater '(' ou '{' ou '[' faz o stack.push(inic).
     * Quando encontrar ')' ou '}' ou ']' faz o stack.top() para  ver o objeto que esta no topo da lista e verificar se ha integridade com o parentese, caso haja faz o stack.pop() que 
     * remover o objeto que esta no topo da lista.
     * @param str string para verificar a integridade
     * @return string - se stack estiver vazia retorna true se não retorna false.
     */
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Array de string onde se vai verificar se há integridade
        String str[] = {"(abcd)", "{f>{e>{d>{a<b}}", "{7+{6-{5+{2+2}}})", "{{b{ana}}na}(m)", "{j{d{m}d}](m)", "{{}}([]){}{}{}{}{[[[[]]]]}"};
        int i;
        //Verificar se o array esta vazio
        if (str.length == 0) {
            System.out.println("String esta vazia.");
            return;
        }
        //ciclo for para percorrer o array de string e verifica se há integridade
        for (i = 0; i < str.length; i++) {
            System.out.println("Integridade dos parêntesis " + str[i] + " ? : " + verificaIntigridade(str[i]));
        }
    }
}
