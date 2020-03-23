package com.shubh.stack.list;

import com.shubh.stack.StackInterface;
import com.shubh.stack.StackException;

public class ListStackInterface implements StackInterface<Integer> {

    private StackNode top;

    public ListStackInterface() {
        top = null;
    }

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    @Override
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Pop t.
     *
     * @return the t
     */
    @Override
    public Integer pop() {
        int popped;
        if (isEmpty()) {
            throw new StackException("Stack is Empty");
        } else {
            popped = top.data;
            top = top.next;
        }
        return popped;
    }

    /**
     * Peek t.
     *
     * @return the t
     */
    @Override
    public Integer peek() {
        if (isEmpty()) throw new StackException("Stack is Empty");
        return top.data;
    }

    /**
     * Push.
     *
     * @param integer the t
     */
    @Override
    public void push(Integer integer) {
        StackNode newNode = new StackNode(integer);
        if (top == null) {
            top = newNode;
        } else {
            StackNode temp = top;
            top = newNode;
            newNode.next = temp;
        }
        System.out.println("Data:" + integer + " pushed to the Stack");
    }

    /**
     * Clear.
     */
    @Override
    public void clear() {
        top = null;
    }
}
