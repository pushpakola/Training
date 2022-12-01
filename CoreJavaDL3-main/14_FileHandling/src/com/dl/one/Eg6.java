package com.dl.one;

import java.io.FileInputStream;
import java.io.IOException;

public class Eg6 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("one.txt");
		int i;
		while ((i=fileInputStream.read())!=-1) {
			System.out.print((char)i);
		}
		fileInputStream.close();

	}

}
