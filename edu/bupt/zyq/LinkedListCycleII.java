package edu.bupt.zyq;

public class LinkedListCycleII {

	/**
	 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Follow up:
Can you solve it without using extra space?
	 * */
	
public static ListNode detectCycle(ListNode head) {
	ListNode fast = head;
    ListNode slow = head;
    ListNode temp = null;
    while(fast != null){
   	 if(fast.next == null) return null;
    	fast = fast.next.next;
    	slow = slow.next;
    	if( fast == slow) break;
    }
    if(fast != null && slow != null){
    fast = head;
    while(fast != slow){
    	slow = slow.next;
    	fast = fast.next;
    }
    }
    return null;
}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		a.next = b;
		b.next = a;
		System.out.println(detectCycle(a));
		
	}

}
