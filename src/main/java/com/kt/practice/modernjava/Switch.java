package com.kt.practice.modernjava;

public class Switch {
	public static void main(String[] args) {

		int day = 3;
		String dayString = null; //어디선가 사용을 한다했을때, 명시적으로 초기화까지해주자

		//문법 -> 표현식으로 바뀜,
		//break가 없어도됨, default는 맨 마지막에 안써도됨

		String dayString2 = switch (day) {
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			case 7 -> "Sunday";
			default -> "Invalid day";
		};

		System.out.println(dayString);
	}
}
