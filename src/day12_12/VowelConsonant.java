//WAJP to the count of vowels and consonant in a given String
package day12_12;

import java.util.Scanner;

public class VowelConsonant {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name ");
		String name=sc.next();
		name.toLowerCase();
		int vcount=0;
		int ccount=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vcount++;
			}
			else {
				ccount++;
			}
		
		}
		System.out.println("Vowel count is "+vcount);
		System.out.print("Consonat count is "+ccount);
	}
}
