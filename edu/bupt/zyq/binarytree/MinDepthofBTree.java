package edu.bupt.zyq.binarytree;


public class MinDepthofBTree {

	/**
	 * Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
	 * 
	 * */
	
public static int minDepth(TreeNode root) {
	if(root == null) return 0;		
	int	maxL = minDepth(root.left)+1;
	int	maxR = minDepth(root.right)+1;
	int res = maxL>maxR?maxR:maxL;
	return res>1?res:(maxL>maxR?maxL:maxR);
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
		
		System.out.println(minDepth(a));
		
	}

}
