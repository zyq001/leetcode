package edu.bupt.zyq.binarytree;

public class TheSameTree {

	static class TreeNode{
		int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	 public static boolean isSameTree(TreeNode p, TreeNode q) {
	     //p,q为空 或者他们子节点为空val相等   
		 if(p ==null && q ==null ){
	            return true;
	        }else  if(p==null || q==null){
	            return false;
	        }else if(p.val == q.val){
	        	boolean re1 = isSameTree(p.left,q.left);
				boolean re2 = isSameTree(p.right, q.right);
				if(re1&re2){
					return true;
				}else{
					boolean re11 = isSameTree(p.left,q.right);
					boolean re22 = isSameTree(p.right, q.left);
					return re11&re22;
				}
	        }else return false;
	        
//	         if(p.left != null &&p.right != null&&q.right != null && q.left != null &&
//	        		 p.left.equals(q.left) && p.right .equals( q.right) && p.val == q.val){
//			
//			boolean re1 = isSameTree(p.left,q.left);
//			boolean re2 = isSameTree(p.right, q.right);
//			return re1&re2;
//			
//		}else if(p.left != null &&p.right != null&&q.right != null && q.left != null &&p.left.equals( q.right) && p.right.equals( q.left) && p.val == q.val){
//			
//			boolean re1 = isSameTree(p.left,q.right);
//			boolean re2 = isSameTree(p.right, q.left);
//			return re1&re2;
//			
//		}else return false;
	
	 }
	 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TheSameTree t = new TheSameTree();
		
		TreeNode a = new TreeNode(0);
		TreeNode b = new TreeNode(0);
		TreeNode b1 = new TreeNode(0);
		TreeNode b2 = new TreeNode(0);
		TreeNode b3 = new TreeNode(0);
		TreeNode b4 = new TreeNode(0);
		TreeNode b5 = new TreeNode(0);
		a.left = b1;
		b.right = b2;
		
		System.out.println(isSameTree(a,b));
		
		
	}

}
