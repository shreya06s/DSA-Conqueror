package shreya;
import java.util.*;
public class maximumconsecutiveones {
		  public int findMaxConsecutiveOnes(int[] nums) {
		    int count=0;
		    int maxim=0;
		    for(int i=0;i<nums.length;i++){
		        if(nums[i]==1){
		        count++;
		        maxim= Math.max(maxim,count);
		        }
		    else{
		        count=0;
		    }
		    }
		    return maxim;
		  }
		  public static void main(String args[]) {
			  maximumconsecutiveones obj=new maximumconsecutiveones();
			  int[] nums= {1,1,0,1,1,1};
			  int result=obj.findMaxConsecutiveOnes(nums);
			  System.out.println("max consecutives ones:"+result);
			  
		}
}
