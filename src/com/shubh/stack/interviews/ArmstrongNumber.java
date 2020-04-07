package com.shubh.stack.interviews;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Check Armstrong: ");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
    }

    private static boolean isArmstrong(int num) {
        int sum = 0, r, temp;
        temp = num;
        while (num != 0) {
            r = num % 10;
            sum = sum + (r * r * r);
            num = num / 10;
        }
        return sum == temp;
    }

}
