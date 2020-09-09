package com.my.test;

import java.util.Arrays;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("john", "ram", "pam", "sam");

        list.stream().filter(s-> s.equals("ram")).forEach(System.out::print);
    }
}
