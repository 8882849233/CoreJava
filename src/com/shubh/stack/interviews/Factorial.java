package com.shubh.stack.interviews;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to print factorial: ");
        printFactorial(scanner.nextInt());
    }

    private static void printFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.printf("Factorial of Given number %d = %d ", num, fact);
    }
}
