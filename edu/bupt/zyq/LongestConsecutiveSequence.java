package edu.bupt.zyq;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class LongestConsecutiveSequence {

	/**
	 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example,
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.
	 * */
	
	public static int longestConsecutive(int[] num) {//hashMap
		//key存num里的数，value存连续数的个数，当前key可能位于该数串的两端或中间
		//该算法只需保证连续数串的两端存放数串的长度，因为再出现中间的数，hashmap不会处理
		//关键在于计算长度，等于左到t的长度（即t-1处存放的值）加右到t的长度（t+1）
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		int min = 0, re = 1, i = 1, nowCount = 0;
		for(int t: num){
			if(!hashmap.containsKey(t)){//不存在才处理，已存在t时 不处理
				int left = (hashmap.containsKey(t-1))? hashmap.get(t-1):0;
				int right = (hashmap.containsKey(t + 1))? hashmap.get(t+1):0;
				int sum = left + right + 1;
				hashmap.put(t, sum);
				if(sum > re) re = sum;
				hashmap.put(t - left, sum);//更新连续数串的左端
				hashmap.put(t + right, sum);//更新连续数串的右段
			}
		}
        return re;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] test = {1, 0, -1};
		longestConsecutive(test);
	}

}
