package day2;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number to Check Armstrong or not");
		int num=sc.nextInt();//1634,153,370,371,1,2,3,4,5,6
		int temp=num;
		int p=0;
		while(num>0) {
			int rem=num%10;
			p=(p)+(rem*rem*rem);
			num=num/10;
			
		}
		if(temp==p) {
			System.out.println("Entered Number is ArmStrong");
		}
		else
		{
			System.out.println("Entered Number is not an ArmStrong");
		}
	}

}
