package leetcode.gry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution056 {

	public static void main(String[] args) {
		Interval a = new Interval(1, 3);  
        Interval c = new Interval(2, 6);  
        Interval b = new Interval(8, 10);  
        Interval d = new Interval(15, 18);  
        ArrayList intervals = new ArrayList();  
        intervals.add(a);  
        intervals.add(b);  
        intervals.add(c);  
        intervals.add(d);
        
          
        merge(intervals); 
	}
	
	public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<Interval>();

        if( intervals.size() <= 1 )
        	return intervals;
        Collections.sort(intervals, new IntervalComp());
        Interval prev = intervals.get(0);
        for( int i=1; i<intervals.size(); i++ ) {
        	Interval curr = intervals.get(i);
        	if( prev.end >= curr.start ) {
        		prev.end = Math.max(prev.end, curr.end);
        	} else {
        		res.add(prev);
        		prev = curr;
        	}
        }
        
        res.add(prev);
//        
//        for (int i = 0; i < res.size(); i++) {  
//            Interval interval =res.get(i);  
//            System.out.println("[ "+interval.start+"-"+interval.end+" ]");  
//        }  
//        
        return res;
    }
}

class IntervalComp implements Comparator<Interval> {

	@Override
	public int compare(Interval o1, Interval o2) {
		return o1.start - o2.start;
	}
	
}

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
   Interval(int s, int e) { start = s; end = e; }
}
