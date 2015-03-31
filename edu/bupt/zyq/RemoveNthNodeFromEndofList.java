package edu.bupt.zyq;

public class RemoveNthNodeFromEndofList {

	/**
	 * Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
	 * */
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode start = new ListNode(0),slow = start, fast = start ;
		slow.next = head;		
		int i = 1;
        while(i++ <= n + 1){//多走一步 slow正好到要删除的节点的父节点
        	fast = fast.next;
        }
        while(fast != null ){
        	fast = fast.next;
        	slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		a.next = b;
		removeNthFromEnd(a, 1);
		
	}

}
