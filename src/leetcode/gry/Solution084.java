package leetcode.gry;

import java.lang.Thread.State;
import java.util.Stack;

public class Solution084 {

	public static void main(String[] args) {
		
	}
	
	public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int maxArea = 0;
        int i=0;
        int tmp = 0;
        int tmpTop = 0;
        while( i <= n ) {
        	tmp = i == n ? 0 : heights[i];
        	if( stack.isEmpty() || heights[stack.peek()] <= tmp ) {
        		stack.push(i);
        		i++;
        	}
        	else {
        		tmpTop = heights[ stack.pop() ];
        		maxArea = Math.max(maxArea, tmpTop*( stack.isEmpty()?i:i-1-stack.peek() ) );
        	}
        }
        return maxArea;
    }

}
