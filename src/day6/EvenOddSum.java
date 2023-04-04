package day6;

import java.util.Scanner;

public class EvenOddSum {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
 		System.out.println("Enter the arrya size");
 		int size=sc.nextInt();
 		System.out.println("Enter the array elements");
 		int arr[]=new int[size];
 		//logic to add arrayelement
 		int evensum=0;
	 		int oddsum=0;
 		for(int i=0;i<arr.length;i++)
 		{
 			arr[i]=sc.nextInt();
 			
 	 		if(arr[i]%2==0) {
 	 		   evensum=evensum+arr[i];	
 	 		}
 	 		else if(arr[i]%2!=0) {
 	 			oddsum=oddsum+arr[i];
 	 		}
 		}
 		System.out.println("Even sum is "+evensum);
 		System.out.println("Odd sum is "+oddsum);
	}
}
