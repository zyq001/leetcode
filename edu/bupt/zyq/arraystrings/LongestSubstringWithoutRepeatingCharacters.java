package edu.bupt.zyq.arraystrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	/**
	 * Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
	 * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
	 * */
	
	public int lengthOfLongestSubstring(String s) {
		//��Ҫ��set��set��Ҫ����ɾ����һ��Ԫ��֮ǰ��
		//��hashmap/˫ָ�룬hashmap��value��Ԫ�ص�s�е�λ�ã����������ظ�ʱ������ֱ���ҵ�λ��
		if(s == null || s.length() < 1) return 0;
		int count = 1, i,j = 0;
		Map<Character, Integer> hashmap = new HashMap<Character, Integer>(Math.max(s.length()/2,1));
		for(i = 0; i < s.length(); i++){
			if(hashmap.containsKey(s.charAt(i))){		
//				count = Math.max(i - j + 1,count);
				j = Math.max(hashmap.get(s.charAt(i)) + 1, j);				
			}
			hashmap.put(s.charAt(i), i);	
			count = Math.max(i - j + 1,count);
		}
		return count;//
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("aa");
	}

}
