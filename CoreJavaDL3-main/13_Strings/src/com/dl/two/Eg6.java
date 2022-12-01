package com.dl.two;

class A{
	
	public A() {
		System.out.println("Default Construtor");
	}
}
public class Eg6 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 10;
		System.out.println(a == c);
		System.out.println(b == a);
		
		String s1 = new String("Java"); // 2 
		String s2 = new String("Python"); // 2
		String s3 = new String("Java"); // 2
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		A aa = new A();
		System.out.println(aa);
		
		A aaa = new A();
		System.out.println(aaa);

	}

}
