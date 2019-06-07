/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Francisco José Silva de Azevedo , a36232 , EI
 * @author Gaofeng Yin , a36233 , EI
 */
public class ArrayStack<E> implements Stack<E> {
    // capacidade predefinida para o array
    private static final int CAPACITY = 1000;
    // array generico 
    private E[] data;
    // index para o elemento no top da stack
    private int t = -1;
    /**
     * construtor da stack com a capacidade predefinida
     */
    public ArrayStack() {
        this(CAPACITY);
    }
    // construtor da stack com a capacidade determinada pela pessoa 
    /**
     * construtor da stack com a capacidade determinada
     * @param capacity capacidade da stack
     */
    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }
    
    /**
     * devolve o tamanho da stack
     * @return um valor inteiro que é o tamanho da stack
     */
    public int size() {
        return (t + 1);
    }
    
    /**
     * verifica se está vazia a stack
     * @return True se estiver vazia, False se não estiver
     */
    public boolean isEmpty() {
        return (t == -1);
    }
    
    /**
     * Insere na stack
     * @param e elemento que quer inserir
     * @throws IllegalStateException se a size da stack for igual à maxima capacidade da stack
     */
    public void push(E e) throws IllegalStateException {
        if (size() == data.length) {
            throw new IllegalStateException("Stack is full");
        }
        data[++t] = e;
    }
    
    /**
     * devolve o elemento no topo da stack
     * @return null se a stack estiver vazia, caso contrario devolve o elemento
     */
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return data[t];
    }
    
    /**
     * remove o elemento no topo da stack
     * @return null se estiver vazia a stack, caso contrario retira o elemento que está no topo e devolve o elemento anterior a esse
     */
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
}
