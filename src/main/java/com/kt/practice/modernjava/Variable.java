package com.kt.practice.modernjava;

public class Variable {
	public static void main(String[] args) {

		//자바에서 변수는 어떤 방식으로 총 3단계가 있다.
		//1.선언
		//2.초기화
		//3.할당

		int a = 1;
		int b; //선언 + 초기화 int인 기본 자료형의 초기값은 0
		b = 2; //할당
		Integer c; // 은 null
		c = 4; //할당

		//앞뒤가 똑같아야한다. Type 변수명 = 값; //값의 타입과 Type이 같아야한다.
		//롬복 : var, val => val(value) :final, var(variable)
		//jdk 12

		var ktCloudTechUpBackEndFirstTeam = new KTCloudTechUpBackEndFirstTeam();
		ktCloudTechUpBackEndFirstTeam.teamName = "1팀";

	}
}
