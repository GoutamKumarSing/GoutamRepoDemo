package day5Mam;

import java.util.Scanner;

public class useingScannEvenodd {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the starting value");
	int start=sc.nextInt();
	System.out.println("Enter the ending value");
	int end=sc.nextInt();
	//logic
	for(int i=start+1;i<=end;i++) {
		if(i%2==0) {
			System.out.println(i+" ");
		}
	}
//	int fact=1;
//	for(int i=start+1;i<=end;i++) {
//		fact=fact*i;
//	}
//	System.out.println(fact);
}
   
}
