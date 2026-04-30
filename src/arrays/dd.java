package arrays;
import java.util.Scanner;
public class dd {
	 
		public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no you want for rows");
		int i=sc.nextInt();
		System.out.println("Enter the no you want for columns");
		int j=sc.nextInt();
		int mat[][]=new int [i][j];
		int d=mat.length;
		int e=mat[0].length;
		for(int a=0;a<d;a++)
	        {
			for(int b=0;b<e;b++) {
				mat[a][b]=sc.nextInt();
			}
	        }
		System.out.println("Your matrix value is");
		for(int a=0;a<d;a++) {
			for(int b=0;b<e;b++) {
				System.out.print(mat[a][b]+1);
			}
			System.out.println();
		}
		}
	}


}
