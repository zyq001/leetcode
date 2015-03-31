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
		//���������һ������ʵ�֣������д����һ��TreeNode��ÿ���ȼ����ϲ������Ȼ�����pool��ͬʱ���������ӽڵ�
		 //�밴��������𣺹���ÿ��������ʱ��һ������һ�㷴�򣬼�����һ��add��value�� ��ô��һ���add(0,value)
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
			//��ת����
			if(l2r)	l2r = false;
			else l2r = true;
		}
		return re;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
