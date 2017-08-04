package leetcode.gry;

public class Solution055 {

	public static void main(String[] args) {
	}
	
	public boolean canJump(int[] nums) {
        int step = nums[0]+1;
        
        for(int i=0; i<nums.length; i++) {
        	if( i == nums.length-1 )
        		return true;
        	step--;
        	if( nums[i] > step ) {
        		step = nums[i];
        	}
        	if( step == 0 )
        		return false;
        }
        return true;
    }

}
