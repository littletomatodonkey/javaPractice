package leetcode.gry;

public class Solution053 {

	public static void main(String[] args) {
		
	}

	public int maxSubArray(int[] nums) {
		int sum = nums[0];
		int curSum = nums[0];
		
		for(int i=1;i<nums.length;i++) {
			curSum = Math.max(curSum+nums[i], nums[i]);
			sum = Math.max(sum, curSum);
		}
        return sum;
    }
	
}
