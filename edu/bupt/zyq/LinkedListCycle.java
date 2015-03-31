package edu.bupt.zyq;

public class LinkedListCycle {
/**
 * iven a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 * */
public static boolean hasCycle(ListNode head) {
     ListNode fast = head;
     ListNode slow = head;
     while(fast != null){
    	 if(fast.next == null) return false;
     	fast = fast.next.next;
     	slow = slow.next;
     	if(fast == slow) return true;
     }return false;
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
		System.out.println(hasCycle(a));
		
	}

}
