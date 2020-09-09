package com.my.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStringFrequency{
	/**
	 *
	 * write a program to count frequency of string characters and print in ascending order
	 *
	 * Input: ashishgupta
	 * Output: a2g1h2i1p1s2t1u1
	 */
	public static void main(String[] args){
		System.out.println(print("ashishgupta"));

	}

	public static String  print(String s){
		Map<Character, Long> collect = s.replaceAll(" ", "")
				.chars()
				.mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(str -> str, Collectors.counting()));

		LinkedHashMap<Character, Long> collect1 = collect.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (p, q) -> p, LinkedHashMap::new));

		return collect1.keySet().stream()
				.map(key -> key + "" + collect1.get(key))
				.collect(Collectors.joining());
	}
}