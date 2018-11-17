package com.qka.java01base;

import java.text.NumberFormat;

public class Base01DataTypes {

	public static void main(String args[]) {

		// 字符串
		String s = "hello java";
		System.out.println("s=" + s);
		// 整数,长度不受os影响,保证可移植性;
		
		//byte 2^7-1
		byte  b1 = 12;
		System.out.println("b1=" + b1);
		
		//short长度2^15-1
		short s1= 33;
		System.out.println("s1 = " + s1 );
		
		//int 长度2^31-1
		int i = 10;
		System.out.println("i=" + i);
		
		long l = 13123L;
		System.out.println("l=" + l);

		//浮点型:double float
		float f = 10.3456f;
		System.out.println("f=" + f);

		// 保留两位小数
		double d2 = 10.4567;
		System.out.println("d2=" + d2);

	}

}
