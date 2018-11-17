package com.qka.java01base;

public class ZTF {

	public static void main(String[] args) {
		
		String [] s = {
				"coupon_money",
				"oil_range",
				"merchant_id",
				"id",
		};
		for ( int i = 0 ; i < s.length ; i ++ ){
			//System.out.println(turnHungary2CamelCase(s[i])); 
			String sqlCnt = " , ifnull ("+s[i]+" , '') as  "+turnHungary2CamelCase(s[i])+" ";
			System.out.println(sqlCnt);
		}
		
	}

	public static String turnHungary2CamelCase(String str) {
		String words[] = str.split("_");

		for (int i = 1; i < words.length; i++) {
			String firstChar = words[i].substring(0, 1).toUpperCase();
			words[i] = firstChar + words[i].substring(1, words[i].length());
		}
		str = "";
		for (int i = 0; i < words.length; i++) {
			str = str + words[i];
		}
		String []aliasWords = str.split("\\.");
		str=(aliasWords.length != 2)?str:aliasWords[1];
		return str;

	}

}
