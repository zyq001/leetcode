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
		//key��num�������value���������ĸ�������ǰkey����λ�ڸ����������˻��м�
		//���㷨ֻ�豣֤�������������˴�������ĳ��ȣ���Ϊ�ٳ����м������hashmap���ᴦ��
		//�ؼ����ڼ��㳤�ȣ�������t�ĳ��ȣ���t-1����ŵ�ֵ�����ҵ�t�ĳ��ȣ�t+1��
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		int min = 0, re = 1, i = 1, nowCount = 0;
		for(int t: num){
			if(!hashmap.containsKey(t)){//�����ڲŴ����Ѵ���tʱ ������
				int left = (hashmap.containsKey(t-1))? hashmap.get(t-1):0;
				int right = (hashmap.containsKey(t + 1))? hashmap.get(t+1):0;
				int sum = left + right + 1;
				hashmap.put(t, sum);
				if(sum > re) re = sum;
				hashmap.put(t - left, sum);//�����������������
				hashmap.put(t + right, sum);//���������������Ҷ�
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
