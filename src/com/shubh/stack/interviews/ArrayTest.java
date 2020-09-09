package com.my.test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayTest {

    /**
     * Write a program to find the element of an array that occurs more than half array’s size. Input : {1,3,2,1,3} Output: 3
     */
    public static void main(String[] args) {
        int [] a ={1,3,2,1,-1,1, -1, -1, -1};
        System.out.println(findLarger(a, a.length/2));
    }

    static int  findLarger(int[] arr, int n)
    {
        Map<Integer, Long> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(s1 -> s1, Collectors.counting()));

        return collect.entrySet()
                .stream()
                .filter(aLong -> aLong.getValue() >= n)
                .mapToInt(Map.Entry::getKey)
                .max().orElse(-1);

    }



}
