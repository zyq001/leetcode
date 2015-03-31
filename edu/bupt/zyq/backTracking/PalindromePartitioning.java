package edu.bupt.zyq.backTracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	/**
	 * Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

For example, given s = "aab",
Return

  [
    ["aa","b"],
    ["a","a","b"]
  ]
	 * */
	public List<List<String>> partition(String s) {
		List<List<String>> re = new ArrayList<List<String>>();
		if(s == null || s.length() < 1) return re;
//		for(int i )
		
	}
	
	public boolean isPalindrome(String s){
		int length = s.length();
		for(int i = 0; i < s.length()/2; i++){
			if(s.charAt(i) != s.charAt(length - i - 1))
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
