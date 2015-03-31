package edu.bupt.zyq;

public class MergeSortedArray {

	/**
	 * Given two sorted integer arrays A and B, merge B into A as one sorted array.

Note:
You may assume that A has enough space (size that is greater or equal to m + n)
 to hold additional elements from B.
 The number of elements initialized in A and B are m and n respectively.
	 * */
	
	 public void merge(int A[], int m, int B[], int n) {
		 for(int b = 0; b<B.length; b++){			 
			 A[m + b] = B[b];
			 for(int i = 0; i<m+b; i++){
				 if(A[i]>A[m+i-1]){
					 A[i] = A[i]^A[m+i-1];
					 A[m+1-1] = A[i]^A[m+i-1];
					 A[i] = A[i]^A[m+i-1];
				 }
			 }			 
		 }		 
	    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
