package day3;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int fT=0,sT=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the term till to print");
		int term=sc.nextInt();
		for(int i=1;i<=term;i++) {
			System.out.print(fT+",");
			int nT=fT+sT;
			fT=sT;
			sT=nT;
		}
	}

}
