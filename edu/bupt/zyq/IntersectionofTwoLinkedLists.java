package edu.bupt.zyq;

public class IntersectionofTwoLinkedLists {

	/**
	 * Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 �� a2
                   �K
                     c1 �� c2 �� c3
                   �J            
B:     b1 �� b2 �� b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
	 * */
	
public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	int countA=0, countB=0;
	ListNode pA = headA, pB = headB;
	while(pA !=null || pB != null){
		if(pA!= null){
			countA++;
			pA = pA.next;
		}
		if(pB != null){
			countB++;
			pB = pB.next;
		}
	}
	ListNode temp;
	if (countA < countB){temp = headB;headB = headA; headA = temp;}; 
	countA = Math.abs(countA - countB);
	while(countA-- > 0){
		headA = headA.next;
	}
	while(headA != null && headB != null){
		if(headA == headB)return headA;
		headA = headA.next;
		headB = headB.next;
	}
        return null;
    }

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode a = new ListNode(3);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		b.next = a;
		System.out.println(getIntersectionNode(a,b));
	}

}
