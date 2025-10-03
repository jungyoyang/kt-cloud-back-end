package com.kt.practice;

import java.util.Map;

public class Method {
	public static void main(String[] args) {
		//method 함수 = ?? -> 심부름꾼

		Map<String, String> 오른쪽주머니 = 심부름("사과", 10_000);

		System.out.println("사온물건 : " + 오른쪽주머니.get("product"));
		System.out.println("잔돈 : " + 오른쪽주머니.get("change"));
		System.out.println("엄마 : " + 오른쪽주머니.get("product") + "잘 사왔네~");
		System.out.println("--------------------");

		Map<String, String> 왼쪽주머니 = 심부름("바나나", 20_000);

		System.out.println("사온물건 : " + 왼쪽주머니.get("product"));
		System.out.println("잔돈 : " + 왼쪽주머니.get("change"));
		System.out.println("엄마 : " + 왼쪽주머니.get("product") + "잘 사왔네~");

	}
}

public static Map<String, String> 심부름(String product, int money) {

	int change = 0;
	if (product.equals("사과")) {
		change = money - 5000;
	} else {
		change = money - 7000;
	}

	change = money - 500;

	System.out.println("돈 " + money + "원 줄테니까 요 앞에 마트가서 " + product + "한 팩 사와");
	System.out.println("남는 돈으로 과자도 하나 사오렴");
	System.out.println("아주머니한테 인사 잘하고 횡단보도 건널때 차조심해");
	System.out.println("알았지? 다녀와~");

	return Map.of(
		"product", product,
		"change", change + "원"
	);
}
}
