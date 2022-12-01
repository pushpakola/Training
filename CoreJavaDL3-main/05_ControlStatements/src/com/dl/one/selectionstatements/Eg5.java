package com.dl.one.selectionstatements;

public class Eg5 {
    //bank account using with switch case
	public static void main(String[] args) {
		
		int key = 90;
		
		switch (key) {
		case 5:
			System.out.println("Case Label with 5 is Matched");
			break;
		case 10:
			System.out.println("Case Label with 10 is Matched");
			break;
		case 20:
			System.out.println("Case Label with 20 is Matched");
			break;
		case 30:
			System.out.println("Case Label with 30 is Matched");
			break;
		case 30+20:
			System.out.println("Case Label with 50 is Matched");
			break;
		case 70-10:
			System.out.println("Case Label with 60 is Matched");
			break;
		case 7*2:
			System.out.println("Case Label with 14 is Matched");
			break;
		case (10)+(80):
			System.out.println("Case Label with 90 is Matched");
			break;

		default:
			System.out.println("Default Case is Matched");
			break;
		}
		
		String course = "PythonStudents";
		
		switch (course) {
		case "JavaStudents":
			System.out.println("Java Developers");
			break;
		case "PythonStudents":
			System.out.println("Python Developers");
			break;

		default:
			System.out.println("Default Case is Executed");
			break;
		}

	}

}
