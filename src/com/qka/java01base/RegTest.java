package com.qka.java01base;

public class RegTest {

	public static void main(String args[]) {
		String REGEX = ".*insert\\u0020.*|.*delete\\u0020.*|.*update\\u0020.*";
		String sql = " select insert dalkjf , slkfjsad from wx_user ";

		if (sql.matches(REGEX)) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
	}

}
