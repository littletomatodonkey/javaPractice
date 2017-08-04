package leetcode.gry;

import java.util.*;

public class Solution049 {

	public static void main(String[] args) {
		
	}
	
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for( String str : strs )
		{
			String sortedStr = SortStr(str);
			if( !map.containsKey(sortedStr) )
			{
				map.put(sortedStr, new ArrayList<String>());
			}
			map.get(sortedStr).add(str);
		}
		
		List< List<String> > res = new ArrayList<List<String>>( map.values() );
		for( List<String> r : res )
		{
			Collections.sort(r);
		}
		return res;
        
    }
	
	private String SortStr( String str ) {
		char[] chs = str.toCharArray();
		Arrays.sort(chs);
		return new String( chs );
	}

}
