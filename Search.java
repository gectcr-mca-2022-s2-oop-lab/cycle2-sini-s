package com.MCA;

import java.util.Scanner;

public class Search {
	public static void main(String args[]) {
		int i, flag=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of elements");
		int num = s.nextInt();

		int a[] = new int[num];
		System.out.println("enter the elements");
		for (i = 0; i < num; i++) {

			a[i] = s.nextInt();
		}

		System.out.println("enter the element to be searched");
		int ele = s.nextInt();
		for (i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				flag=1;
				break;
			} 
			
		}
		if(flag==1)
			System.out.println("element found at location" +" "+ i);
		else
			System.out.println("element not found");
	}

}
