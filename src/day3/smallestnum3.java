package day3;

import java.util.Scanner;

public class smallestnum3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  a value");
		int a=sc.nextInt();
		System.out.println("Enter the  b value");
		int b=sc.nextInt();
		System.out.println("Enter the  c value");
		int c=sc.nextInt();
		if(a<b&&a<c) {
			System.out.println("a is smallest "+a);
		}
		else if(b<a&&b<c) {
			System.out.println("b is smallest "+b);
		}
		else {
			System.out.println("c is smallest "+c);
		}
	}

}
