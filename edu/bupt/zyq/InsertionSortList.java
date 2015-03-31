package edu.bupt.zyq;

public class InsertionSortList {

	/**
	 * 
	 * */
	
	public static ListNode insertionSortList(ListNode head) {
		if(head == null) return null;
        ListNode pNode = new ListNode(Integer.MIN_VALUE), p2 = head;
        pNode.next = head;
        head = pNode;
        while(pNode.next != null ){
        	p2 = pNode.next;
        	while(p2.next != null){
	        	if(p2.next.val < pNode.next.val){
	        		ListNode temp = p2.next;//把要删除的节点存起来
	        		p2.next = p2.next.next;//从链表上删除
	        		//将已存节点next插入
	        		temp.next = pNode.next;
	        		pNode.next = temp;        		
	        	}else  {	        		
	        		p2 = p2.next;
	        	}
	        }
        	pNode = pNode.next;
        }
        return head.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(0);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		System.out.println(insertionSortList(a));
	}

}
