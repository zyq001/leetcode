package edu.bupt.zyq;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MinStack {

	/**
	 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
	 * */
	class stackNode {
		stackNode next;
		long value;
	}
	stackNode stack = null;
	long min = 0;	
	public void push(int x) {
		
		stackNode xN = new stackNode();
		xN.next = stack;
		stack = xN;
		if (stack.next == null){
			stack.value = 0;
			min = x;
		}else{
			stack.value = (x-min);
			if(x<min) min = x;
		}
    }

    public void pop() {
    	if (stack == null) return;
        	if(stack.value < 0)min -= stack.value;
        	stack = stack.next;
        		
    }

    public int top() {
    	if(stack.value>0)return (int) (min+stack.value);
    	else return (int)min;
    }

    public int getMin() {
        return (int)min;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
