package arrays;
import java.util.Scanner;
public class array2d {
static void printmatrix(int s[][]) {
			Scanner sc = new Scanner(System.in);
			int n = s.length;
			int m = s[0].length;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					s[i][j] = sc.nextInt(s[i][j]);
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.println(s[i][j]);
				}
			}
		}

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value for rows");
			int n = sc.nextInt();
			System.out.println("Enter the value for columns");
			int m = sc.nextInt();

			int[][] s = new int[n][m];

			printmatrix(s);

		}

	}


