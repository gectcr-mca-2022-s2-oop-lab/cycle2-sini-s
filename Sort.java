package com.MCA;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	public static void main(String args[]) {
		int i;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int n = sc.nextInt();
		String[] stringarray = new String[n];
		System.out.println("Enter the strings");
		for (i = 0; i < n; i++) {
			stringarray[i] = sc.next();

		}
		Arrays.sort(stringarray);
		for (i = 0; i < n; i++) {
			System.out.println(stringarray[i]);

		}
	}
}
