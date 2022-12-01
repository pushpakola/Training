package com.dl.one;

import java.io.File;
import java.io.IOException;

public class Eg1 {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("cat.txt");
		f1.createNewFile();
		System.out.println("File Created");
		
		
		File f2 = new File("src/bat.txt");
		f2.createNewFile();
		System.out.println("File Created");
		
		File f3 = new File("/Users/admin/Documents/Github/dog.txt");
		f3.createNewFile();
		System.out.println("File Created");

	}

}
