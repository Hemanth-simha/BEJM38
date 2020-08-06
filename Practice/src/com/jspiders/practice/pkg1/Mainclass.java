package com.jspiders.practice.pkg1;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = null;
		sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		num = sc.nextInt();
		System.out.println("Entered Number : "+num);
		
		if(sc!=null)
		{
			sc.close();
		}
		
		//100 lines of code
	}

}
