package leetcode.gry;

import java.awt.FontFormatException;
import java.awt.image.RescaleOp;
import java.math.BigInteger;

public class Solution062 {

	public static void main(String[] args) {
		System.out.println( uniquePaths(99, 99) );
	}
	
	public static int uniquePaths_big(int m, int n) {
        BigInteger res = new BigInteger("1");
        for( int i=m; i<=m+n-2; i++ )
            res = res.multiply(new BigInteger( (new Integer(i)).toString() ));
        for( int i=1; i<=n-1; i++ )
        	res = res.divide(new BigInteger( (new Integer(i)).toString() ));
        return res.intValue();
        
    }
	
	public static int uniquePaths(int m, int n) {
        if( m*n == 0 )
        	return 0;
        
        int res[] = new int[n];
        res[0] = 1;
        for( int i=0; i<m; i++ ) {
        	for( int j=1; j<n; j++ ) {
        		res[j] += res[j-1];
        	}
        }
        
        return res[n-1];
    }

}
