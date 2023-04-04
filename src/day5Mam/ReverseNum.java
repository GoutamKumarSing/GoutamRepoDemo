//Write a java program to Reverse The Given Number
//i/p=1234
//o/p=4321
package day5Mam;

import java.util.Scanner;

public class ReverseNum {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value to Reverse");
	long num=sc.nextLong();
	System.out.println("Revese number is ");
	while(num!=0) {
		long rem=num%10;
		System.out.print(rem);
		num=num/10;
	}
}
}
