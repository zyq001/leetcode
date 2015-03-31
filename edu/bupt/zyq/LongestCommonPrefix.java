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
			int min = commString.length() > strs[i].length()? strs[i].length(): commString.length();//����ÿ�μ����ʱ
			for(int j = 0; j < min; j++){
				if(commString.charAt(j) == strs[i].charAt(j)) continue;
				else{
					commString = commString.substring(0, j);
					break;
				}
			}
			if(commString.length() > min){//�˴αȽϵ��ַ�������ǰ׺���Ӵ������ڹ����Ӵ����ʹ����Ӵ�Ӧ�ö�
				commString = commString.substring(0, min);
			}
		}
		return commString;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
