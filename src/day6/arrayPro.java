//Write the java program to find minimum and maximum element in the array without using any predifined methods
package day6;

import java.util.Scanner;

public class arrayPro {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arrya size");
		int size=sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[size];
		//logic to add arrayelement
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//logic to find maximum and minimum
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
