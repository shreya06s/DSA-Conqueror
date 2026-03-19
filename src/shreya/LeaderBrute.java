package shreya;
import java.util.*;
public class LeaderBrute {
	class Solution {
	    public List<Integer> leaders(int[] nums) {
	        List<Integer> ans = new ArrayList<>();
	       for (int i = 0; i < nums.length; i++) {
	            boolean leader = true;
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[j] >= nums[i]) {
	                    leader = false;
	                    break;
	                }
	            }
	            if (leader) {
	                ans.add(nums[i]);
	            }
	    }
	    return ans;
	}
	}
}
