package leetcode.gry;

import java.awt.FontFormatException;
import java.util.Stack;

public class Solution085 {
	
	public static void main(String[] args) {
		char[][] ma = { {'0', '0'}, {'1', '1'} };
		System.out.println( maximalRectangle(ma) );
	}
	
	public static int maximalRectangle(char[][] matrix) {
        if( matrix.length == 0 )
        	return 0;
        int row = matrix.length;
        int col = matrix[0].length;
        
        int height[][] = new int[row][col];
        for( int i=0; i<col;i++ ) {
        	height[0][i] = matrix[0][i] - 48;
        }
        
        for( int i=1; i<row; i++ ) {
        	for( int j=0; j<col; j++) {
        		height[i][j] = matrix[i][j] == '1' ? (height[i-1][j]+1) : 0;
        	}
        }
        
        int tmp, maxRec = 0;
        for( int i=0; i<row; i++ ) {
        	tmp = findMaxArea(height[i]);
        	maxRec = Math.max(maxRec, tmp);
        }
        return maxRec;
    }
	
	private static int findMaxArea( int heights[] ) {
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
