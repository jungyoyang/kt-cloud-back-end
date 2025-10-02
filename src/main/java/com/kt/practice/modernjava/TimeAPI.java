package com.kt.practice.modernjava;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;

public class TimeAPI {
	public static void main(String[] args) {
		//jdk8
		//java.util.Date
		//java.util.Calendar

		Date date = new Date();

		System.out.println(date);
		//yyyy-MM-dd HH:mm:ss
		//2024-06-20 14:30:00

		//LocalDate, LocalTime, LocalDateTime
		//ZonedDateTime, OffsetDateTime
		//Instant
		//Period, Duration

		//jdk 8 이전에는 날짜와 시간을 다루기가 너무 어려웠다.

		// UTC -> KST - 9시간시차
		// yyyy-MM-dd HH:mm:ss ->현지시간
		// yyyy-MM-dd HH:mm:ssZ -> UTC
		// yyyy-MM-dd HH:mm:ss+09 -> Offset

		Instant instant = Instant.now();
		System.out.println(instant);

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime);

	}
}
