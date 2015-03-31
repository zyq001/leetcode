package edu.bupt.zyq.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeBinaryTreePreorderTraversal {
/**
 * Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?
 * */
	
public static List<Integer> preorderTraversal(TreeNode root) {
	Stack<TreeNode> st = new Stack<TreeNode>();
    List<Integer> re = new ArrayList<Integer>();
    TreeNode p = root;
    while(!st.isEmpty() || p!=null){
    	
    	while(p!=null){
    		st.add(p);
    		re.add(p.val);
    		p = p.left;
    		
    	}
    	
    	if(!st.isEmpty()){
    		p = st.peek();
    		st.pop();
    		p = p.right;
    	}
    	
    }
    return re;
}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(0);
		TreeNode b = new TreeNode(1);
		TreeNode b1 = new TreeNode(2);
		TreeNode b2 = new TreeNode(3);
		TreeNode b3 = new TreeNode(4);
		TreeNode b4 = new TreeNode(5);
		TreeNode b5 = new TreeNode(6);
		a.left = b;
		b.left = b1;
		a.right = b2;
		b2.right = b3;
		b3.right = b4;
		List<Integer> r = preorderTraversal(a);
		for(int i: r){
			System.out.print(i +" ");
		}
//		System.out.println(preorderTraversal(a));
	}

}
