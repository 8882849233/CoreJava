package com.shubh.stack;

import com.shubh.stack.arrays.ArrayStackInterface;
import com.shubh.stack.list.ListStackInterface;

class SampleDemo {
    public static void main(String[] args) {


        ArrayStackInterface stack = new ArrayStackInterface(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println("##########################################################");
        ListStackInterface listStack = new ListStackInterface();
        System.out.println(listStack.isEmpty());

        listStack.push(2);
        listStack.push(3);
        listStack.push(4);

        System.out.println(listStack.peek());

        System.out.println(listStack.isEmpty());
    }
}