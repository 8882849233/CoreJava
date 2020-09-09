package com.my.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringTest {

    public static void main(String[] str) {
        String input = "this_is_c_plus_var";
        System.out.println("Final result after conversion= " + convertString(input));

    }

    public static String convertString(String input){
        System.out.println("Input= " + input);
        String finalResult;
        String[] splitS = input.split("_");
        if (splitS.length > 1) {
            //c++
            finalResult = convertInCamelCaseJavaVariable(splitS);
        } else if (isJavaVariable(input)) {
            //java
            finalResult = convertInCPlusVariable(input);
        } else {
            throw new IllegalStateException("not");
        }
        return finalResult;
    }

    private static boolean isJavaVariable(String input) {
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static char changeUpperCase(char c) {
        return Character.toUpperCase(c);
    }

    private static char changeLowerCase(char c) {
        return Character.toLowerCase(c);
    }

    private static Boolean isUpperCase(char c) {
        return Character.isUpperCase(c);
    }

    private static String convertInCPlusVariable(String aString) {
        char[] input = aString.toCharArray();
        List<Character> output = new ArrayList<>();
        for (char c : input) {
            if (isUpperCase(c)) {
                output.add('_');
                output.add(changeLowerCase(c));
            } else {
                output.add(c);
            }
        }
        return convertListInString(output);
    }

    private static String convertListInString(List<Character> aList) {
        return aList.stream().map(String::valueOf).collect(Collectors.joining(""));
    }

    private static String convertInCamelCaseJavaVariable(String[] strings) {
        List<Character> stringFrom2nd = new ArrayList<>();
        for (int i = 1; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (j == 0) {
                    stringFrom2nd.add(changeUpperCase(chars[j]));
                } else {
                    stringFrom2nd.add(chars[j]);
                }
            }
        }
        return strings[0] + convertListInString(stringFrom2nd);
    }
}