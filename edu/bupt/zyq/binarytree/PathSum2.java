package edu.bupt.zyq.binarytree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class PathSum2 {

	/**
	 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]
	 * */
	public static List<List<Integer>> hasPathSum(TreeNode root, int sum) {
		 Stack<TreeNode> st = new Stack<TreeNode>();
			List<List<Integer>> re = new ArrayList<List<Integer>>();
			List<Integer> temp = new ArrayList<Integer>();
			int tempSum = 0;
			TreeNode p = root;
			Set<TreeNode> visitedSet = new HashSet<TreeNode>();
			while(p!=null || !st.isEmpty()){
//				if(p == null)isleaf = false;
				while(p!=null && !visitedSet.contains(p)){
						st.push(p);
						visitedSet.add( p);
						temp.add(p.val);
						tempSum += p.val;
						p = p.left;
				}
				if(st.peek().left==null && st.peek().right ==null && tempSum == sum) {
					ArrayList<Integer> t = new ArrayList<Integer>();
					t.addAll(temp);
					re.add(t);
				}
				if(!st.isEmpty()){
					
					p = (TreeNode) st.peek();
					if(p.right == null || visitedSet.contains(p.right)){
						tempSum -= p.val;
						st.pop();
						if(!st.isEmpty()){
							p = (TreeNode) st.peek();
							temp.remove(temp.size()-1);
							}else break;
						}
					p = p.right;
					}else break;
				}
					
//			}
//			if(re.size()>0)		
			return re;
//			return null;
		        
		    }
	
//public List<List<Integer>> pathSum(TreeNode root, int sum) {
//	if(root == null) return null;
//	List<List<Integer>> re = new ArrayList<List<Integer>>();
//	if(root.left == null && root.right == null){
//		if(root.val == sum){
//			ArrayList<Integer> temp = new ArrayList<Integer>();
//			temp.add(root.val);
//			re.add(temp);
//			return re;
//		}
//		else return null;		
//	}
//	if(root.left != null){
//		List<List<Integer>> t1 = pathSum(root.left, sum - root.val);
//		if( t1!=null){
//			for(List<Integer> t: t1){
//				re.add(t);
//			}
//			return true;		}
//	if(root.right != null){	
//		return hasPathSum(root.right, sum-root.val);		}
//	return false;
//}
//    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(-2);
		TreeNode b = new TreeNode(2);
		TreeNode b1 = new TreeNode(-3);
		TreeNode b2 = new TreeNode(1);
		TreeNode b3 = new TreeNode(3);
		TreeNode b4 = new TreeNode(4);
//		TreeNode b5 = new TreeNode(2);
		TreeNode b6 = new TreeNode(-1);
//		TreeNode b7 = new TreeNode(2);
//		TreeNode b8 = new TreeNode(2);
//		TreeNode b9 = new TreeNode(2);
//		a.left = b;
		a.right = b1;	
//		b.left = b2;
//		b.right = b3;		
//		b1.left = b4;
//		b1.right = b5;
//		b2.left = b6;
//		b2.right = b7;
//		b3.left = b8;
//		b3.right = b9;
//		Integer.
		List<List<Integer>> res = hasPathSum(a, -5);
		for(List<Integer> t: res){
			for(int i : t){
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
