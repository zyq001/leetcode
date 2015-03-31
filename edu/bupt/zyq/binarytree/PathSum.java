package edu.bupt.zyq.binarytree;

import java.util.Stack;

public class PathSum {
/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * */
	
//public static boolean hasPathSum(TreeNode root, int sum) {
//	Stack<TreeNode> st = new Stack<TreeNode>();
//	int tempSum = 0;
//	TreeNode p = root;
//	while(p!=null || !st.isEmpty()){
//		while(p!=null){
////			if(tempSum + p.val<=sum){
//				st.push(p);
//				tempSum += p.val;
//				System.out.println(tempSum);
//				p = p.left;
////			}
//		}
//		if(tempSum == sum) return true;
//		if(!st.isEmpty()){
//			
//			p = (TreeNode) st.peek();
////			if(p.right == null) {
//			tempSum -= p.val;
//			st.pop();
////			}
//			p = p.right;
//		}
//			
//	}
//	return false;
//        
//    }
	public static boolean hasPathSum(TreeNode root, int sum) {
		if(root == null) return false;
		if(root.left == null && root.right == null){
			if(root.val == sum)return true;
			else return false;		
		}
		if(root.left != null){
			if( hasPathSum(root.left, sum - root.val))		return true;		}
		if(root.right != null){	
			return hasPathSum(root.right, sum-root.val);		}
		return false;
	}

//public static boolean Sum(TreeNode t, int tsum, int sum){
//	if(t.left == null && t.right == null){
//		if(tsum + t.val == sum)return true;
//		else return false;		
//	}
//	if(t.left != null){
//		if( Sum(t.left, tsum+t.val, sum))		return true;
//	}
//	if(t.right != null){	return Sum(t.right, tsum+t.val, sum);
//	}
//	return false;
//}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(-2);
		TreeNode b1 = new TreeNode(-3);
		TreeNode b2 = new TreeNode(1);
		TreeNode b3 = new TreeNode(3);
		TreeNode b4 = new TreeNode(-2);
//		TreeNode b5 = new TreeNode(2);
		TreeNode b6 = new TreeNode(-1);
//		TreeNode b7 = new TreeNode(2);
//		TreeNode b8 = new TreeNode(2);
//		TreeNode b9 = new TreeNode(2);
		a.left = b;
		a.right = b1;	
		b.left = b2;
		b.right = b3;		
		b1.left = b4;
//		b1.right = b5;
		b2.left = b6;
//		b2.right = b7;
//		b3.left = b8;
//		b3.right = b9;
		
		System.out.println(hasPathSum(a, -4));
		
	}

}
