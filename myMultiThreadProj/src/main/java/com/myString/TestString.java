package com.myString;

public class TestString {
	public static void main(String[] args) {
		String a = "abcdefghijkajakjgfklwiajoejwhwiowfopqkwjASHanvnjg4wioqjionmckSMXcklwe";
		String b = "abcdefghijkajakjgfkl" + "wiajoejwhwiowfopqkwjASHanvnjg4wioqjionmckSMXcklwe";
		String c = b + "";
		System.out.println(a == b);
		System.out.println(a == c);
		Integer aa = 127;
		Integer bb = 127;
		System.out.println(aa == bb);
		Integer aaa = 128;
		Integer bbb = 128;
		System.out.println(aaa == bbb);
	}
}
