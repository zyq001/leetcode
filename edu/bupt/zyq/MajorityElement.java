package edu.bupt.zyq;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	/**
	 * Given an array of size n, find the majority element. 
	 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty 
and the majority element always exist in the array.
	 * */
	//借用map
	public int majorityElement(int[] num) {
        Map<Integer, Integer> counts= new HashMap<Integer, Integer>();
        for(int i: num){
        	if(counts.containsKey(i)){
        		counts.put(i, counts.get(i) + 1);
        	}else{
        		counts.put(i, 1);
        	}
        }
        for(int t: counts.keySet()){
        	if(counts.get(t) > num.length / 2)
        		return t;
        }
        return -1;
    }
	
	//只有一个候选人的投票vote，每个元素投一票，
	//投当前vote count计数加1，否则减1，减为0后直接选下一元素为vote
	public int majorityElement2(int[] num) {
		int vote = num[0], count = 1;
		for(int i: num){
			if(count == 0){
				vote = i;
				count++;
			}else if(vote == i)
				count++;
			else 
				count --;
		}
		return vote;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
