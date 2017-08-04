package leetcode.gry;

import javax.swing.plaf.DimensionUIResource;

public class Solution061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode rotateRight(ListNode head, int k) {
		
		if( head == null || head.next == null )
			return head;
		ListNode res = new ListNode(0);
		res.next = head;
		ListNode fast = res;
		ListNode slow = res;
		int i = 0;
		for( i=0; fast.next != null; i++ ) {
			fast = fast.next;
		}
		
		for( int j=i-k%i; j>0; j-- ) {
			slow = slow.next;
		}
		
		fast.next = res.next;
		res.next = slow.next;
		slow.next = null;
		
		return res.next;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}