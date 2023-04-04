package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Minmaxarrys {
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
		Arrays.sort(arr);
		System.out.println("minmum element is "+arr[0]);
		System.out.println("maximum element is "+arr[arr.length]);
	}
}
