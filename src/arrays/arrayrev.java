package arrays;
import java.util.Scanner;
public class arrayrev {
	
	
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
		      int n=sc.nextInt();
		      int ar[]=new int[n];
		      int m=ar.length;
		      for(int i=0;i<m;i++) {
		    	   ar[i]=sc.nextInt();
	      }
		     
	int s=0;
	int e=m-1;
	while(s<e) {
		int temp=ar[s];
		ar[s]=ar[e];
		ar[e]=temp;
		s++;
		e--;
	}
	System.out.println(ar);
		}
	}


