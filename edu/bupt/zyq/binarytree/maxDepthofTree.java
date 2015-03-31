package edu.bupt.zyq.binarytree;


public class maxDepthofTree {

	/**
	 * Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
	 * 
	 * 
	 * *
	 */
	
//	public static int count = 0;
//	
//public static int maxDepth(TreeNode root) {
//	if(root !=null )
//	    visit(root,1);
//		else return 0;
//	    return count;
//	}
//
//	private static void visit(TreeNode t, int _count){
//
//
//	if(_count>count) count = _count;
//	if(t.left!=null /*&& (t.left.left != null || t.left.right != null)*/){
//		visit(t.left, _count+1);
//	}
//
//	if(t.right != null/* && (t.right.left != null || t.right.right != null)*/ ){
//		visit(t.right, _count+1);
//	}
//	}
	
	public static int maxDepth(TreeNode root) {
		if(root == null) return 0;		
			int	maxL = maxDepth(root.left)+1;
			int	maxR = maxDepth(root.right)+1;
			return maxL>maxR?maxL:maxR;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(0);
		TreeNode b = new TreeNode(0);
		TreeNode b1 = new TreeNode(0);
		TreeNode b2 = new TreeNode(0);
		TreeNode b3 = new TreeNode(0);
		TreeNode b4 = new TreeNode(0);
		TreeNode b5 = new TreeNode(0);
		a.left = b;
		b.left = b1;
		a.right = b2;
		b2.right = b3;
		b3.right = b4;
		
		System.out.println(maxDepth(a));
		

	}

}
