package com.shubh.stack.interviews;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit to print fibonacci: ");
        fibonacci(scanner.nextInt());
    }

    private static void fibonacci(int limit) {
        int n1 = 0, n2 = 1, n3;
        for (int i = 2; i < limit; i++) {
            n3 = n2 + n1;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
