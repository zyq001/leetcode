package edu.bupt.zyq;

public class MergeTwoSortedLists {

	/**
	 * Merge two sorted linked lists and return it as a new list. 
	 * The new list should be made by splicing together the nodes of the first two lists.
	 * */
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
        ListNode re , p;
        if(l1.val <= l2.val) {
        	re = l1;
        	l1 = l1.next;
        }
        else {
        	re = l2;
        	l2 = l2.next;
        }
        p = re;
        while(l1 != null || l2!= null){
        	if(l2 == null || l1 != null && l2.val >= l1.val){
        		p.next = l1;
        		p = p.next;
        		l1 = l1.next;
        	}else{
        		p.next = l2;
        		p = p.next;
        		l2 = l2.next;
        	}
        }
        return re;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode a = new ListNode(1);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(4);
		ListNode d = new ListNode(0);
		a.next = b;
		b.next = c;
		mergeTwoLists(a, d);
	}

}
