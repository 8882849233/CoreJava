package com.shubh.stack.arrays;

import com.shubh.stack.StackInterface;
import com.shubh.stack.StackException;

public class ArrayStackInterface implements StackInterface<Integer> {

    private static final Integer DEFAULT_CAPACITY = 10;
    private Integer top;
    private Integer[] A;

    public ArrayStackInterface(int initialCapacity) {
        if (initialCapacity <= 0) {
            A = new Integer[DEFAULT_CAPACITY];
        } else {
            A = new Integer[initialCapacity];
        }
        top = -1;
    }

    public ArrayStackInterface() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    /**
     * Pop t.
     *
     * @return the t
     */
    @Override
    public Integer pop() {
        Integer x = peek();
        A[top] = null;// to ensure previous object poped fro the stack.
        top--;
        return x;
    }

    /**
     * Peek t.
     *
     * @return the t
     */
    @Override
    public Integer peek() {
        if (isEmpty()) throw new StackException("Stack is empty");
        return A[top];
    }

    /**
     * Push.
     *
     * @param integer the t
     */
    @Override
    public void push(Integer integer) {
        if (top >= (DEFAULT_CAPACITY-1)) throw new StackException("Stack has overflowed");
        top++;
        A[top] = integer;

    }

    /**
     * Clear.
     */
    @Override
    public void clear() {
        for (int i = 0; i <= top; i++) {
            A[i] = Integer.parseInt(null);
            top = -1;
        }
    }

    /**
     * Returns a string representation of the Stack.
     */
    public String toString() {
        if (isEmpty()) return "[ ]";

        StringBuilder out = new StringBuilder("[");
        for (int i = 0; i < top; i++)
            out.append(A[i]).append(", ");

        out.append(A[top]).append("]");
        return out.toString();
    }
}
