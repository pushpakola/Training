package com.dl.one;

import java.io.FileWriter;
import java.io.IOException;

public class Eg3 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter = new FileWriter("/Users/admin/Documents/Github/camel.txt");
		fileWriter.write("Hello Java and Hello Python");
		fileWriter.close();
		System.out.println("File Created and Data Inserted");

	}

}
