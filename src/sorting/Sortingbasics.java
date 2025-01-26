package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Sortingbasics {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of n for array size");
		int n = sc.nextInt(); // array size
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the values for array "+i);
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
