package edu.bupt.zyq.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {

	/**
	 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
	 * */
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		//按层遍历：一个队列实现，队列中存放上一层TreeNode，每次先计算上层个数，然后逐个pool的同时加入左右子节点
		 //与按层遍历区别：构造每层遍历结果时，一层正向，一层反向，即：这一层add（value） 那么下一层就add(0,value)
		 List<List<Integer>> re = new ArrayList<List<Integer>>();
		if(root == null) return re;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();		
		queue.offer(root);		
		Boolean l2r = true;
		while(!queue.isEmpty()){
			int queueSize = queue.size();
			List<Integer> levelList = new ArrayList<Integer>();
			for(int i = 0; i < queueSize; i++){
				if(queue.peek().left != null) queue.offer(queue.peek().left);
				if(queue.peek().right != null) queue.offer(queue.peek().right);
				if(l2r)	{
					levelList.add(queue.poll().val);
				}else{
					levelList.add(0, queue.poll().val);
				}
			}
			re.add(levelList);
			//发转方向
			if(l2r)	l2r = false;
			else l2r = true;
		}
		return re;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
