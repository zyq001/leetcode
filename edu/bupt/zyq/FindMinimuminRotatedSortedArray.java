package edu.bupt.zyq;

public class FindMinimuminRotatedSortedArray {

	/**
	 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
	 * */
	
	public int findMin(int[] num) {
        int min = Integer.MAX_VALUE;
        for(int i: num){
        	if(i < min)
        		min = i;
        }
        return min;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
