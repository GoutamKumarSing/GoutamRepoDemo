package day2;

import java.util.Scanner;

public class SwapingwihoutThird {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a ");
		int a=sc.nextInt();
		System.out.println("Enter the value for b");
		int b=sc.nextInt();
		
		System.out.println("Before Swapping :\na is"+a+" b is "+b);
		//LOGIG TO SWAP
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping : \na is "+a+" b is"+b);
	}
}
