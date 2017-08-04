package leetcode.gry;

import java.util.Collections;

public class Solution063 {

	public static void main(String[] args) {
		
	}
	
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if( obstacleGrid.length == 0 || obstacleGrid[0].length == 0 )
        	return 0;
        
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        if( obstacleGrid[0][0] == 1 || obstacleGrid[row-1][col-1] == 1 )
        	return 0;
        int res[] = new int[col];
        res[0] = 1;
        for( int i=0; i<row; i++ ) {
        	if( obstacleGrid[i][0] == 1 )
        		res[0] = 0;
        	for( int j=1; j<col; j++ ) {
        		if( obstacleGrid[i][j] == 1 )
        			res[j] = 0;
        		else
        			res[j] += res[j-1];
        	}
        }
        
        
        return res[col-1];
    }

}
