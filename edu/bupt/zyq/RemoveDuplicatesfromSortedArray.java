package edu.bupt.zyq;

public class RemoveDuplicatesfromSortedArray {

	/**
	 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].
	 * */
	
public static int removeDuplicates(int[] A) {//A虽然没返回，但是也得删掉重复的
        int re = A.length, k, p = 1 ;
        for(int i = 1; i < A.length; i++){
        	if(A[i] == A[i-1]){
        		re--;
        		A[i -1] = A[0];//标记为A[0] 第二趟清除
        	}
        }
        for(int j = 1; j < re; j++){
        	for(k = p; k < A.length -1; k++){//找到下一个与数组首元素不同的元素下标
        		if(A[k] != A[0]){
        			break;
        		}
        	}
        	A[j] = A[k];
        	p = k + 1;//跳过已被标记为首元素的部分
        }
        return re;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1, 1, 2,2};
		System.out.println(removeDuplicates(a));
	}

}
