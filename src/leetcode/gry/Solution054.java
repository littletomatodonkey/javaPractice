package leetcode.gry;

import java.util.ArrayList;
import java.util.List;

public class Solution054 {
	
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        
        if( matrix.length == 0 )
        	return res;
        
        int xmin=0, ymin=0, xmax=matrix.length, ymax=matrix[0].length;
        
        while( true ) {
        	for( int i=ymin;i<ymax;i++ ) {
        		res.add(new Integer(matrix[xmin][i]));
        	}
        	xmin++;
        	if( xmin >= xmax || ymin >= ymax )
        		break;
        	for( int i=xmin;i<xmax;i++ ) {
        		res.add(new Integer(matrix[i][ymax-1]));
        	}
        	ymax--;
        	if( xmin >= xmax || ymin >= ymax )
        		break;
        	for( int i=ymax-1;i>=ymin;i-- ) {
        		res.add(new Integer(matrix[xmax-1][i]));
        	}
        	xmax--;
        	if( xmin >= xmax || ymin >= ymax )
        		break;
        	for( int i=xmax-1;i>=xmin;i-- ) {
        		res.add(new Integer(matrix[i][ymin]));
        	}
        	ymin++;
        	if( xmin >= xmax || ymin >= ymax )
        		break;
        }
        
        return res;
    }

}
