package leetcode.gry;

import ref.gry.packageTest;

public class Solution064 {

	public static void main(String[] args) {
		int grid[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
		System.out.println( minPathSum(grid));
	}
	
	public static int minPathSum(int[][] grid) {
        if( grid.length == 0 || grid[0].length == 0 )
        	return 0;
        
        int row = grid.length;
        int col = grid[0].length;
        
        int res[][] = new int[ row ][ col ];
        res[0][0] = grid[0][0];
        
        for( int i=1;i<col;i++ ) {
        	res[0][i] = grid[0][i] + res[0][i-1];
        }
        for( int i=1;i<row;i++ ) {
        	res[i][0] = grid[i][0] + res[i-1][0];
        }
        
        for( int i=1; i<row; i++ ) {
        	for( int j=1; j<col; j++ ) {
        		res[i][j] = Math.min(res[i-1][j], res[i][j-1]) + grid[i][j];
        	}
        }
        
        for(int i=0;i<row;i++) {
        	for(int j=0;j<col;j++) {
        		System.out.print( res[i][j] + "  " );
        	}
        	System.out.println();
        }
        
        return res[row-1][col-1];
    }

}
