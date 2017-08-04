package leetcode.gry;

import java.util.List;

public class Solution058 {

	public static void main(String[] args) {
		
	}
	
	public int lengthOfLastWord(String s) {
		if( s == null || s.length() == 0 )
			return 0;
        String[] strings = s.split(" ");
        return strings[strings.length-1].length();
    }

}
