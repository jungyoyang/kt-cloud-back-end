package com.kt.practice.modernjava;

import java.util.Optional;

public class OptionalMain {
	public static void main(String[] args) {

		//optional 은 null 다루는 기술
		//NPE = nullPointerException, 갑자기 어디선가 널이 들어와서 에러를 일으키는 현상

		Optional<String> optionalString =
			Optional.of("Hello, Optional");

		Optional<String> optionalString1 = Optional.ofNullable("Hello, Optional");

		// orElseGet - 값이 없으면 함수형 인터페이스로 기본값을 제공
		// orElse - 값이 없으면 기본값을 제공
		// ifPresent - 값이 있으면 실행
		// ifPresentOrElse - 값이 있으면 실행, 없으면 다른 실행
		// orElseThrow - 값이 없으면 예외를 던짐

		// orElseGet, 나이를 가져오는데 null일수 없으니, 심지어 0살도잇으니
		Optional<Integer> optionalAge = Optional.ofNullable(null);

		int age = optionalAge.orElseGet(() -> {
			return 0;
		}); //null이면 0을 넣어라

	}
}
