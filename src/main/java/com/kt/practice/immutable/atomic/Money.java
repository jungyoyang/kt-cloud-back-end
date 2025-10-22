package com.kt.practice.immutable.atomic;

public class Money {
	final int amount;

	public Money(int amount) {
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