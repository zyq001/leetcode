package edu.bupt.zyq;

public class ExcelSheetColumnNumber {

	/**
	 * Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
	 * */
	
	public int titleToNumber(String s) {
		int res = 0;
		for(int i = 0; i < s.length(); i++){
			res += Math.pow(26, s.length() - i -1) * (s.charAt(i)-'A' + 1);
		}
		return res;	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
