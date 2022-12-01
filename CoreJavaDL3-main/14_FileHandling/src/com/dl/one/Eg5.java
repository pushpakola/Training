package com.dl.one;

import java.io.FileReader;
import java.io.IOException;

public class Eg5 {

	public static void main(String[] args) throws IOException {
		
		FileReader fileReader = new FileReader("one.txt");
		int i;
		while ((i=fileReader.read()) != -1) {
			System.out.print((char)i);
		}
		fileReader.close();

	}

}
