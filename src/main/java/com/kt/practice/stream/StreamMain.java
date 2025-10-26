package com.kt.practice.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
	public static void main(String[] args) {
		/**
		 * 스트림이란 우리가 앞서 배운 람다식을 이용한 기술 중 하나이다.
		 * 데이터들을 조작 및 가공해서 원하는 값으로 반환해주는 인터페이스이다.
		 * jdk8 부터 제공된다.
		 *
		 * 원본List = "a", "b", "c"
		 *
		 * 특징
		 * 1. Stream은 원본 데이터를 변경하지 않는다.
		 *    Stream API는 원본 데이터를 조회하여 별도의 Stream 객체로 생성한다.
		 *    따라서 정렬, 필터 등등 작업을 하더라도 원본데이터는 변경되지 않는다.
		 * 2. Stream은 재사용이 불가능하다
		 *    람다식을 이용한 기술이기 때문에 일회성이다.
		 * 3. Stream은 내부 반복으로 작업을 처리한다.
		 *    반복문으로 처리한다. 따라서 순수 반복분 보다는 성능이 떨어지지만 개의치않아도 된다.
		 * Stream의 과정
		 * Stream은 생성 → 중간연산 → 최종연산 이 3가지의 과정을 통해 처리가 이루어진다.
		 * ex) 객체.stream생성().중간연산.최종연산()
		 */

		List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
		names.add("Frank"); //UnsupportedOperationException, of는 immutable이기 때문ㅇ

		//names를 복사해서 새로운 것 생성
		//알파벳 e가 들어간 이름들만 모아서 출력 (filter)
		var newNames = names.stream()
			.filter(name -> name.contains("e"))
			.collect(Collectors.toList());

		System.out.println(newNames);
		//jdk8부터 stream
		//jdk11부터 Collectors.toList는 너무많이쓰더라, 그래서 그냥 toList();로 사용가능
		/*var newNames = names.stream()
			.filter(name -> name.contains("e"))
			.toList();*/
	}
}