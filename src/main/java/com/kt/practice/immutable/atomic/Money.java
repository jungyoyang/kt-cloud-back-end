package com.kt.practice.immutable.atomic;

// Java에서 “불변 클래스(Immutable Class)”란
// **‘객체가 한 번 만들어진 이후에는 상태가 절대 변하지 않는 클래스’**를 의미합니다.
//이때 “상태”란 그 클래스가 가지고 있는 모든 인스턴스 변수들을 의미합니다.
// 즉, 단 하나라도 바뀔 수 있는 필드가 있으면 불변성이 깨져요.
// '불변성’은 클래스 이름에 붙는 게 아니라 객체의 동작 방식이에요
// 즉, 클래스 선언에 final을 붙이는 게 아니라,
// 그 안의 “동작 방식”으로 불변을 보장하는 거예요.

public class Money {
	final int amount;

	public Money(int amount) {
		//객체의 고정값을 넣는 순간
		this.amount = amount;
	}

	// amount : 1000,
	// targetAmount : 2000
	// 1000 - 2000 = -1000
	public Money minus(int targetAmount) {
		if (amount < targetAmount) {
			throw new IllegalArgumentException("잔액이 부족합니다.");
		}

		return new Money(amount - targetAmount);
	}

	@Override
	public String toString() {
		return "Money(" + amount + ")";
	}
}