package edu.bupt.zyq.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {

	/**
	 * Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [3,2,1].

Note: Recursive solution is trivial, could you do it iteratively?
	 * */
	//递归算法
	public static List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> re = new ArrayList<Integer>();
        if(root == null) return re;
        re.addAll(postorderTraversal(root.left));
        re.addAll(postorderTraversal(root.right));
        re.add(root.val);
        return re;
    }
	
	//非递归算法
	public static List<Integer> postorderTraversal2(TreeNode root) {
		List<Integer> re = new ArrayList<Integer>();
		if(root == null) return re;
		Stack<TreeNode> stk = new Stack<TreeNode>();
		TreeNode p = root;
		TreeNode pre = p;//最近出栈点
		while(p != null || !stk.isEmpty()){
			if(p != null){//遍历左节点的左节点进栈
				stk.push(p);
				p = p.left;
			}else{//为空时
				if(stk.isEmpty())
					return re;
				// 栈顶存在右孩子，进栈
				p = stk.peek();
				if(p.right != null && p.right != pre){
					p = p.right;
				}else{//栈顶不存在右孩子了，访问栈顶，更新pre和p指针
					p = stk.pop();
					re.add(p.val);
					pre = p;
					p = null;
				}
			}			
		}
		return re;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode b1 = new TreeNode(2);
		TreeNode b2 = new TreeNode(3);
		TreeNode b3 = new TreeNode(3);
		TreeNode b4 = new TreeNode(565364);
		TreeNode b5 = new TreeNode(565364);
		a.left = b1;
		a.right = b;
		b1.left = b2;
		b.right = b3;
//		b2.left = b4;
//		b3.right = b5;
		System.out.println(postorderTraversal2(a));
	}

}
