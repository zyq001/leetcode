package edu.bupt.zyq.binarytree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.apache.servicemix.jmsImpl.JmsSubscriptionImpl;
import org.apache.log4j.PropertyConfigurator;

public class BalancedBinaryTree {

	private static Log log = LogFactory.getLog(BalancedBinaryTree.class);
	
	/**
	 * Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary 
tree in which the depth of the two subtrees of every node never differ by more than 1.
	 * 
	 * */

	
public boolean isBalanced(TreeNode root) {
	if(root == null) return true;
	if(isBalanced(root.left)&&isBalanced(root.right)&&Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1){
		return true;
	}
	return false;
    }
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
		PropertyConfigurator.configure("log4j.properties");
log.error("sssss");
	}

}
