package day4;

import java.util.Scanner;

public class Strong {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number To Check Weather it is Strong or Not");
		int originalNumber,rem,fact,sum=0;
		int num=sc.nextInt();
		originalNumber=num;
		//logic
		while(num>0) {
			rem=num%10;
			fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==originalNumber) {
			System.out.println("Entered Number is a Strong Number");
		}
		else
		{
			System.out.println("Entered Number is not a Strong Number");
		}
	}
}
