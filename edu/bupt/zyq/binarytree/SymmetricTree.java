package edu.bupt.zyq.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class SymmetricTree {

	/**
	 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
	 * */
	//�ݹ��㷨
	public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(Symmetric(root.left, root.right) )
        	return true;
        return false;
    }
	
	public static boolean Symmetric(TreeNode t1, TreeNode t2){
		if(t1 == null && t2 == null)//������Ϊ�շ���true
			return true;
		if(t1 == null && t2 != null || t1 != null && t2 == null)//����һ��Ϊ�գ�����false����ҪΪ�����ж��ų����пյ����
			return false;
		if(t1.val == t2.val && Symmetric(t1.left, t2.right) && Symmetric(t1.right, t2.left))
			return true;
		return false;
	}
	
	//�ǵݹ�
	public static boolean isSymmetric2(TreeNode root) {
		//��һ��ջ,ÿ�δ�������Ӧλ�õĽڵ� ��left.left��right.right�� ��left.right��right.left
		if(root == null) return true;
		Stack<TreeNode> stk = new Stack<TreeNode>();
		TreeNode left, right;
		if(root.left != null ){
			if(root.right == null) return false;
			stk.push(root.left);
			stk.push(root.right);
			
		}else if(root.right != null)
			return false;
		while(!stk.isEmpty()){
			
			left = stk.pop();
			right = stk.pop();
			
			if(left.val != right.val) return false;
			
			if(left.left != null){
				if(right.right == null) return false;
				stk.push(left.left);
				stk.push(right.right);
			}else if(right.right != null)
				return false;
			
			if(left.right != null){
				if(right.left == null) return false;
				stk.push(left.right);
				stk.push(right.left);
			}else if(right.left != null)
				return false;
			
		}
		return true;		
	}
	
	public static boolean isSymmList(List<TreeNode> list){
		if(list == null) return true;
		boolean flag = true;
		for(int i = 0; i < list.size() / 2; i++){
			if(list.get(i) == null && list.get(list.size() - i - 1) != null //����һ��Ϊ�գ���false
					|| list.get(i) != null && list.get(list.size() - i - 1) == null)
				flag = false;
			//ֻ���ж���һ�㣬�Գ�λ�ò���� ��false
			if(list.get(i) != null && list.get(list.size() - i - 1) != null && list.get(i).val != list.get(list.size() - i - 1).val)
				flag = false;
		}
		return flag;
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
		
		System.out.println(isSymmetric2(a));
	}

}
