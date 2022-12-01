package com.dl.one;

class Products{
	
	int pid;
	String pName;
	
	public Products(int pid, String pName) {
		this.pid = pid;
		this.pName = pName;
	}
	
}
public class Client {

	public static void main(String[] args) {
		
		
		Products p1 = new Products(101, "Samsung");
		System.out.println(p1); // com.dl.one.Products@3f8f9dd6
		
		Products p2 = new Products(102, "Lg");
		System.out.println(p2); // com.dl.one.Products@726f3b58
		
		String s1 = new String("NameOne");
		System.out.println(s1);
		System.out.println(s1.hashCode());
	}

}
