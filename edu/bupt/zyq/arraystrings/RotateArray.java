package edu.bupt.zyq.arraystrings;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xpath.internal.axes.ReverseAxesWalker;

public class RotateArray {

	/**
	 * Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

[show hint]

Hint:
Could you do it in-place with O(1) extra space?
	 * */
	
	public void rotate(int[] nums, int k) {
		//三次反转，第一次全部反转，第二次前k个元素发转，第三次剩下的反转
				if(k% nums.length < 1) return ;
				reverse(nums, 0, nums.length - 1);
				reverse(nums, 0, (k - 1) % nums.length);
				reverse(nums, k % nums.length, nums.length - 1);
	}
	
	public void rotate2(int[] nums, int k) {
		int n = nums.length;
		for(; (k %= n) > 0;  n -= k){
			for(int i = 0; i < k; i++){
				int temp = nums[i];
				nums[i] = nums[n - k];
				nums[n - k] = temp;
			}
		}
	}
	
			
			public void reverse(int [] arr, int start, int end){
				if(start >= end) return;
				for(int i = start; i <= (start + end)/2; i++){
					int temp = arr[i];
					arr[i] = arr[start + end - i];
					arr[start + end - i] = temp;
				}
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(5%3);
//		int[] nums = {1, 2, 3};
//		ArrayList<Integer> t = new ArrayList<Integer>();
//		new RotateArray().rotate(nums, 1);
		System.out.println(new String("qwe").hashCode() == (new String("qwe")).hashCode());
	}

}
