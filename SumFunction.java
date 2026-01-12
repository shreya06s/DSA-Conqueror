package functions;

import java.util.Scanner;

public class SumFunction {
	public static int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for sum");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(sum(a,b));
	}
}// end of the programm