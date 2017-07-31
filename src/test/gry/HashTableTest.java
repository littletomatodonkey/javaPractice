package test.gry;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		hashtable.put("one", new Integer(1));
		hashtable.put("two", new Integer(2));
		hashtable.put("three", new Integer(3));
		hashtable.put("four", new Integer(4));
		Set set = hashtable.keySet();
		for (Iterator<String> i = set.iterator();i.hasNext();) {
			System.out.println( hashtable.get(i.next()) );
		}
	}

}
