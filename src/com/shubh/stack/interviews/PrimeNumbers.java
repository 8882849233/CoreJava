package com.shubh.stack.interviews;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Number: ");
        int number = scanner.nextInt();
        System.out.println(isPrime(number));

    }

    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        return count == 0;
    }
}
