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
1 �� m �� n �� length of list.
	 * */
	
	public ListNode reverseBetween(ListNode head, int m, int n) {
		//��ָ�뷴ת��ʵ���Ϲ������ĸ�
		if(head == null) return null;
		if(head.next == null || m == n) return head;
		n -= m;
		int i = 1;
		ListNode p = new ListNode(0), pstart, temp;
		p.next = head;
		ListNode pre = p;
		while(--m > 0){
			pre = pre.next;//ǰ���
		}
		pstart = pre.next;	//��Ҫ�����ĵ�һ�����
		while(n -- > 0){
			temp = pstart.next;//���浱ǰ���nextָ�룬������
			pstart.next = temp.next;//��ǰ����next��Ϊ�����next
			temp.next = pre.next;//����nextָ��ǰ���
			pre.next = temp;
		}
		return p.next;//ͷָ��Ҳ��ת��
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1), l2 = new ListNode(2), l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		new ReverseLinkedListII().reverseBetween(l1, 1, 3);
	}

}
