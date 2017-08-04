package leetcode.gry;

import java.util.ArrayList;
import java.util.List;

public class Solution060 {
	public static void main(String args[] ) {
		System.out.println( getPermutation(8, 3) );
	}
	
	public static String getPermutation(int n, int k) {
        k--;
		char vals[] = new char[n];
        
        List<Integer> numList = new ArrayList<Integer>();  
        for(int i = 1; i<= n; i++)
        	numList.add(i);
        
        int factorial = 1;    
		for(int i = 2; i < n; i++)  
			factorial *= i; 
        
        int times = n-1;
        while( times >= 0 )	{
        	int indexInList = k / factorial;
        	vals[n-1-times] = (char)(numList.get(indexInList) + 48);
        	numList.remove(indexInList);
        	
        	k = k % factorial;
        	if( times != 0 ) {
        		factorial = factorial / times;
        	}
        	times--;
        	
        }
        return new String(vals);
    }

}
