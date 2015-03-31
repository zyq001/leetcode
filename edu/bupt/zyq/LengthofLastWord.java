package edu.bupt.zyq;

public class LengthofLastWord {

	/**
	 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
	 * */
	
public int lengthOfLastWord(String s) {
        if(s == null || (s.replaceAll(" ", "")).length() ==0) return 0;
        String [] re = s.split(" ");
        return re[re.length -1].length();
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
