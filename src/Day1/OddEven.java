package Day1;

import java.util.Scanner;

public class OddEven {
	public void oddEven() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check odd or even");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("This num "+num+" Is an even number");
		}
		else
		{
			System.out.println("The Number "+num+" Is An Even Number");
		}
	}
	public static void main(String[] args) {
		OddEven oe=new OddEven();
		oe.oddEven();
	}

}
