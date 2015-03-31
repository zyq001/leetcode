package edu.bupt.zyq.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	/**
	 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
	 * */
	 
	 public List<List<Integer>> levelOrder(TreeNode root) {
		//一个队列实现，队列中存放上一层TreeNode，每次先计算上层个数，然后逐个pool的同时加入左右子节点
		 List<List<Integer>> re = new ArrayList<List<Integer>>();
		if(root == null) return re;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.offer(root);
		
		while(!queue.isEmpty()){
			int queueSize = queue.size();
			List<Integer> levelList = new ArrayList<Integer>();
			for(int i = 0; i < queueSize; i++){
				if(queue.peek().left != null) queue.offer(queue.peek().left);
				if(queue.peek().right != null) queue.offer(queue.peek().right);
				levelList.add(queue.poll().val);
			}
			re.add(levelList);
		}
		return re;
		}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(0);
		queue.offer(1);
		queue.offer(2);
		System.out.println(queue);
		queue.remove(1);
		System.out.println(queue);
	}

}
