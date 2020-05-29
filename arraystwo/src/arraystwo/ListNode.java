package arraystwo;
import java.util.*;

public class ListNode {
	private int val;
	private ListNode next;
	public ListNode(int val) {
		this.val = val;
		}
	
	public ListNode() {
	}
	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	public static void main(String args[]) {
    ListNode x = new ListNode(123);
    
	
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode a = l1, b= l2, curr = dummyHead;
		int carry = 0;
		while(a != null|| b != null) {
			int x = (a != null) ? a.val : 0;
			int y = (b != null) ? b.val : 0;
			int sum = carry/10;
			curr.next = new ListNode(sum%10);
			curr = curr.next;
			if (a != null) a= a.next;
			if (b != null) b= b.next;
		}
		if(carry > 0) {
			curr.next = new ListNode(carry);			
			
		}
		return dummyHead.next;
	}	

}
