package edu.bupt.zyq;

import java.util.Arrays;

public class SingleNumber {
/**
 * Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * */
	
public int singleNumber(int[] A) {

	for(int i=1;i<A.length; i++){
		A[0] ^=i; 
	}
	return A[0];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
