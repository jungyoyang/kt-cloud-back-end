package com.kt.practice.immutable.set;

import java.util.HashSet;
import java.util.Set;

public class ImmutableSet {
	public static void main(String[] args) {

		final Set<Integer> numbers = new HashSet<Integer>(); //자동으로 안에서 중복을 없앤다

		// 엘리먼트
		numbers.add(1);
		numbers.add(2);

		numbers = new HashSet<>();

		System.out.println(numbers);

	}
}
