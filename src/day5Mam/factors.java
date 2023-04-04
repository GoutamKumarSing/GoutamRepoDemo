//Write a java program to find the factors of the given number
package day5Mam;

import java.util.Scanner;

public class factors {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  a Value");
	int num=sc.nextInt();
	System.out.println("Factor are:");
	for(int i=1;i<=num;i++) {
		
		if(num%i==0) {
			System.out.println("-> "+i);
			
		}
		
	}
}
}
