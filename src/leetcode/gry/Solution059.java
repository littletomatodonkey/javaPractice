package leetcode.gry;

public class Solution059 {

	public static void main(String[] args) {
		int n = 4;
		int res[][] = generateMatrix(n);
		printM(res, n);
	}
	
	public static int[][] generateMatrix(int n) {
        int res[][] = new int[n][n];
        int num = 1;
        
        int xmin = 0, xmax = n, ymin = 0, ymax = n;
        
        while( true ) {
        	for( int i=ymin;i<ymax;i++ ) {
        		res[xmin][i] = num++;
        	}
        	xmin++;
        	if( xmin >= xmax || ymin >= ymax )
        		break;
        	for( int i=xmin;i<xmax;i++ ) {
        		res[i][ymax-1] = num++;
        	}
        	ymax--;
        	if( xmin >= xmax || ymin >= ymax )
        		break;
        	for( int i=ymax-1;i>=ymin;i-- ) {
        		res[xmax-1][i] = num++;
        	}
        	xmax--;
        	if( xmin >= xmax || ymin >= ymax )
        		break;
        	for( int i=xmax-1;i>=xmin;i-- ) {
        		res[i][ymin] = num++;
        	}
        	ymin++;
        	if( xmin >= xmax || ymin >= ymax )
        		break;
        }
        
        
        
        return res;
    }
	
	private static void printM( int m[][], int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
				System.out.printf("%03d ", m[i][j]);
			}
			System.out.println();
		}
	}

}
