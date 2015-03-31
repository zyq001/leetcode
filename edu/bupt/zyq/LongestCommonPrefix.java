package edu.bupt.zyq;

public class LongestCommonPrefix {

	/**
	 * Write a function to find the longest common prefix string amongst an array of strings.
	 * */
	
	public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length < 1) return "";
		String commString = strs[0];
		if (strs.length == 1) return commString;
		for(int i = 1; i < strs.length; i++){
			int min = commString.length() > strs[i].length()? strs[i].length(): commString.length();//避免每次计算耗时
			for(int j = 0; j < min; j++){
				if(commString.charAt(j) == strs[i].charAt(j)) continue;
				else{
					commString = commString.substring(0, j);
					break;
				}
			}
			if(commString.length() > min){//此次比较的字符串公共前缀的子串，短于公共子串，故公共子串应裁断
				commString = commString.substring(0, min);
			}
		}
		return commString;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
