package com.infotech.client;

public class ClientTest3 {

	public static void main(String[] args) {
		// insert and append method
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = sb.append("This").append(" is").append(" Number ")
				.append(10).append(" and ").append(200.27);
		System.out.println("After append -- " + sb.toString());

		if (sb == sb1) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}

		String str = new String();
		String str1 = str.concat("This").concat(" is");
		if (str == str1) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
	}
}
