package com.learning.bookstore.utilities;

import java.util.Scanner;

public class ScannerUtil {
	private Scanner scanner = new Scanner(System.in);
	
	public int getInt(String message) {
		System.out.println(message);
		return Integer.parseInt(scanner.nextLine());
	}
	public long getLong(String message) {
		System.out.println(message);
		return Long.parseLong(scanner.nextLine());
	}
	public String getString(String message) {
		System.out.println(message);
		return scanner.nextLine();
	}
	public short getShort(String message) {
		System.out.println(message);
		return Short.parseShort(scanner.nextLine());
	}
	public double getDouble(String message) {
		System.out.println(message);
		return Double.parseDouble(scanner.nextLine());
	}
	

}
