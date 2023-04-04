package day5Sir;
import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value is to check Perfect or Not");
		int num=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=num/2) {
			if(num%i==0) {
				sum=sum+i;
			}
			i++;
		}
		if(sum==num) {
			System.out.println("Perfect");
		}
		else{
			System.out.println("not perfect");
		}
		
	}
}
