package com.shubh.stack.interviews;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number to Check Palindrome:");
        int num = scanner.nextInt();
        System.out.println(isPalindrome(num));
    }

    private static boolean isPalindrome(int num) {
        int sum = 0, r, temp;
        temp = num;

        // reversed integer is stored in variable
        while (num != 0) {
            r = num % 10;
            sum = sum * 10 + r;
            num /= 10;
        }
        return temp == sum;
    }

}
