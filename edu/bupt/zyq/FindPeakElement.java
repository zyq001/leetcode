package edu.bupt.zyq;

public class FindPeakElement {

	/**
	 * A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.

根据题意 至少有一个峰值， 因为从负无穷开始到负无穷结束的
	 * */
public static int findPeakElement(int[] num) {
	if(num.length < 1) return 0;
        int start = 0, end = num.length-1, mid;
        while(start <= end){
        	 mid = (start + end)/2;
        	 if(mid+1 >= num.length || mid <= 0) return num[end] > num[start]? end:start;
        	if (num[mid] > num[mid -1] && num[mid] > num[mid + 1]){
        		return mid;
        	}else if(num[mid+1] > num [mid]){
        		start = mid +1;
        	}else if(num[mid-1] > num[mid]){
        		end = mid -1;
        	}
        }
        return 0;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = {1,0,2,3,5,4};
		System.out.println(findPeakElement(t));
	}

}
