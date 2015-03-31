package edu.bupt.zyq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zyq
 * 2014.6.11
 * Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 * 
 * */
public class TwoSum {
	
	int[] indexs;
	
	public int[] twoSum(int[] numbers, int target){
		
		 indexs = new int[2];
		 ArrayList<Integer> t = new ArrayList<Integer>();
		Integer num1 = 0, num2 = 0;
		int[] numbersCopy = numbers.clone();
		Arrays.sort(numbers);
		int start = 0,end = numbers.length-1;
		while(start<end){
			
			if((target == numbers[start]+numbers[end]) ){			
				
				num1 = numbers[start];
				num2 = numbers[end];
				break;
			}else if(target > numbers[start]+numbers[end]){
				start++;
			}else if(target < numbers[start]+numbers[end]){
				end--;
			}
		}
//		return null;
		for(int i=0; i<numbers.length;i++){
			if(numbersCopy[i] == num1 || numbersCopy[i]==num2){
			t.add(i);
			}
			
		}
		indexs[0]=t.get(0);
		indexs[1]=t.get(1);
		return indexs;
		
//		return indexs;
	}
	
	public int[] twoSumHashTable(int[] numbers, int target){
		ArrayList<Integer> indexs = new ArrayList<Integer>();
		Hashtable<Integer,Integer> conhashmap = new Hashtable<Integer,Integer>();
		
		for(int i=0;i<numbers.length;i++){
			if(conhashmap.containsKey(target-numbers[i])){
				return new int[]{conhashmap.get(target-numbers[i]),i};
			}else if(!conhashmap.containsKey(target-numbers[i])){
//				ArrayList<Integer> temp = new ArrayList<Integer>();
//				temp.add(i);
				conhashmap.put(numbers[i], i);
			}
		}
		
		return null;		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum t = new TwoSum();
		System.out.println(System.currentTimeMillis());
		int[] te = new int[1000000];
		for(int i =0; i<1000000;i++){
			te[i]=2*i;
		}
		System.out.println((t.twoSum(te,3999994)[0]));
		System.out.println((t.twoSum(te,3999994)[1]));

		System.out.println(System.currentTimeMillis());

	}

}
