package edu.bupt.zyq;

import java.awt.RadialGradientPaint;

public class CopyListwithRandomPointer {

	/**
	 * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a deep copy of the list.
	 * */
	
	public static RandomListNode copyRandomList(RandomListNode head) {
		if(head == null) return null;
        return spreadLists(verifyRandomList(cloneListNode(head)));       
    }
	
	public static RandomListNode cloneListNode(RandomListNode head){//每个节点后面插入一个副本
		RandomListNode pre = new RandomListNode(head.label);
        pre.next = head.next;
        pre.random = head.random;
        head.next = pre;//head后面插入一个节点
        pre = pre.next;//将pre移到下一个未复制的节点
        while(pre != null ){//复制pre所指节点 并插入到pre后面
        	RandomListNode insert = new RandomListNode(pre.label);
        	insert.next = pre.next;
        	insert.random = pre.random;
        	pre.next = insert;  
        	pre = pre.next.next;
        	if(pre == null) break;
        }     
        return head;
	}
	
	public static RandomListNode verifyRandomList(RandomListNode head){//调整random引用
		RandomListNode p = head.next;
		while(p != null ){
        	if(p.random != null)
        	p.random = p.random.next;//random指针后移一个节点
        	if(p.next != null)
        	p = p.next.next;
        	else break;
        }
		return head;
	}
	
	public static RandomListNode spreadLists(RandomListNode head){
		RandomListNode p1 = head;
		RandomListNode p2 = head.next;
		RandomListNode reListNode = p2;
		while(p1 != null && p1.next != null ){
			p1.next = p1.next.next;
			if(p2.next != null)
			p2.next = p2.next.next;
			p1 = p1.next;
			p2 = p2.next;
		}
		return reListNode;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RandomListNode t = new RandomListNode(-1);
		RandomListNode t2 = new RandomListNode(-2);
		t.next = t2;
		t.random = t2;
		t2.random = t;
		copyRandomList(t);
		
		
	}

}
