package leetcode.gry;

public class Solution072 {
	public static void main(String[] args) {
		System.out.println( minDistance("2333", "233") );
	}
	
	public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        int res[][] = new int[m+1][n+1];
        for(int i=0; i<=m; i++) {
        	res[i][0] = i;
        }
        for( int j=1;j<=n; j++ ) {
        	res[0][j] = j;
        }
        
        for( int i=1; i<=m; i++ ) {
        	for(  int j=1; j<=n; j++) {
        		if( word1.charAt(i-1) == word2.charAt(j-1) )
        			res[i][j] = res[i-1][j-1];
        		else {
        			res[i][j] = 1 + Math.min(res[i-1][j-1], Math.min(res[i][j-1], res[i-1][j]));
        		}
        	}
        }
        
        return res[m][n];
    }

}
