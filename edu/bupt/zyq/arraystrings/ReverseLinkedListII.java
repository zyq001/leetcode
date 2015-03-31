package edu.bupt.zyq.arraystrings;

import edu.bupt.zyq.ListNode;

public class ReverseLinkedListII {

	/**
	 * Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 ≤ m ≤ n ≤ length of list.
	 * */
	
	public ListNode reverseBetween(ListNode head, int m, int n) {
		//三指针反转，实际上共用了四个
		if(head == null) return null;
		if(head.next == null || m == n) return head;
		n -= m;
		int i = 1;
		ListNode p = new ListNode(0), pstart, temp;
		p.next = head;
		ListNode pre = p;
		while(--m > 0){
			pre = pre.next;//前结点
		}
		pstart = pre.next;	//需要交换的第一个结点
		while(n -- > 0){
			temp = pstart.next;//保存当前结点next指针，即后结点
			pstart.next = temp.next;//当前结点的next赋为后结点的next
			temp.next = pre.next;//后结点next指向当前结点
			pre.next = temp;
		}
		return p.next;//头指针也反转了
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1), l2 = new ListNode(2), l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		new ReverseLinkedListII().reverseBetween(l1, 1, 3);
	}

}
