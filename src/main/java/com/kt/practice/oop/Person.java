package com.kt.practice.oop;

public class Person {
	//멤버변수(인스턴스변수), 프로퍼티(속성)
	private int age;
	private String name;
	private String identity;

	//캡슐화는 최소화된 정보만 알려주는건데,
	//지금 이상태에서는 최소한의 정보도 모른다

	//public으로 메서드의 행동을 정의한거다, 알려줄수있어(public) 라고
	public int getAge() {
		return age;
	}

	public int getName() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void changeAge(int age) {
		this.age = age;
	}

}