package edu.bupt.zyq.arraystrings;

public class MaximumSubarray {

	/**
	 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.

click to show more practice.

More practice:
If you have figured out the O(n) solution, try coding another solution 
using the divide and conquer approach, which is more subtle.
	 * */
	
	public int maxSubArray(int[] A) {
		if(A == null || A.length < 1) return -1;
		int preMax = A[0], reMax = A[0];
		for(int i = 1; i < A.length; i++){
			preMax = preMax > 0? (preMax + A[i]): A[i];
			reMax = Math.max(reMax, preMax);
		}
		return reMax;		
	}
	
	public int maxSubArrayDivideApproach(int[] A) {
		if(A == null || A.length < 1) return -1;
		return 	divideAConquer(A, 0, A.length - 1);
	}
	
	public int divideAConquer(int[] A, int start, int end){
		if(start > end) return Integer.MIN_VALUE;
		int mid = (start + end)/2;
		int lMax = divideAConquer(A, start, mid - 1);
		int rMax = divideAConquer(A, mid + 1, end);
		int lNearMax = 0, sum = 0;
		for(int i = start; i <= mid - 1; i++){
			sum += A[i];
			lNearMax = Math.max(sum, lNearMax);
		}
		int rNearMax = 0;
		sum = 0;
		for(int j = mid + 1; j <= end; j++){
			sum += A[j];
			rNearMax = Math.max(sum, rNearMax);
		}
		return Math.max(lNearMax + A[mid] + rNearMax, Math.max(lMax, rMax) );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
