package com.kt.practice.modernjava;

public class TextBlocks {
	public static void main(String[] args) {
		//jdk 15이상에서 사용가능
		// 여러줄의 문자열을 쉽게 작성할 수 있는 기능
		String query = "SELECT u.id, u.name, u.email\n" +
			"FROM users u\n" +
			"WHERE u.status = 'active'\n" +
			"ORDER BY u.created at DESC;";

		String query2 = """
			SELECT u.id, u.name, u.email
			FROM users u
			WHERE u.status = 'active'
			ORDER BY u.created at DESC;
			""";

	}
}
