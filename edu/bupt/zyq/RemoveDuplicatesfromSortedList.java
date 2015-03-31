package edu.bupt.zyq;

public class RemoveDuplicatesfromSortedList {

	/**
	 * Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
	 * */
	
public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while(p != null){
        	if(p.next != null && p.next.val == p.val){
        		ListNode temp = p.next;
        		p.next = p.next.next;
        		temp.next = null;//浮空以便被回收
        		continue;
        	}
        	p = p.next;
        }
        return head;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
