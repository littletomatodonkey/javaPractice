package leetcode.gry;

import test.gry.inheritTest;

public class Solution044 {

	public static void main(String[] args) {
	}
	
	public boolean isMatch(String s, String p) {
        
		int cnt = 0;
		for(int i=0;i<p.length();i++)
			if( p.charAt(i) != '*' )
				cnt++;
		if( cnt > s.length() )
			return false;
		boolean dp[][] = new boolean[s.length()+1][p.length()+1];
		dp[0][0] = true;
		for(int i=0;i<p.length();i++)
		{
			if( dp[0][i] && p.charAt(i) == '*' )
				dp[0][i+1] = true;
			for(int j=0;j<s.length();j++)
			{
				if( p.charAt(i) == '*' )
					dp[j+1][i+1] = dp[j][i+1] || dp[j+1][i];
				else if( p.charAt(i) == '?' || p.charAt(i) == s.charAt(j) )
					dp[j+1][i+1] = dp[j][i];
				else
					dp[j+1][i+1] = false;
			}
			
		}
		return dp[s.length()][p.length()];
    }

}
