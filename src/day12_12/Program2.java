 //WAJP to convert a String into UpperCase and LowerCase and then Merge the Strings
//by taking inputs from user
package day12_12;

import java.util.Scanner;

public class Program2 {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Name ");
	String name=sc.next();
	String LName=name.toLowerCase();
	String UName=name.toUpperCase();
	String merge=LName.concat(UName);
	System.out.println(merge);
	System.out.println("Length of the String is "+name.length());
	char first=name.charAt(0);
	System.out.println("First alphabet of that String is "+first);
}
}
