package arrays;
import java.util.Scanner;
public class function {
	
		public static int sums(int arr[]) {
			int sum=0;
			for(int i=0;i<arr.length;i++)
				sum=sum+arr[i];
			return sum;
		}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the 5 values for array");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the sum is "+ sums(arr));
	}
	}

