package edu.bupt.zyq;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

//import sun.security.provider.JavaKeyStore.CaseExactJKS;

public class LetterCombinationsofaPhoneNumber {

	/**
	 * Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.



Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
Note:
Although the above answer is in lexicographical order, your answer could be in any order you want.
	 * */
	public static List<String> letterCombinations(String digits) {
        if (digits == null) return null;
        List<String> re = new LinkedList<String>();
        ArrayList<StringBuilder> queue = new ArrayList<StringBuilder>();
        StringBuilder sba = new StringBuilder();
        queue.add(sba);
        int k;
    	for(int i = 0; i < digits.length(); i++){
    		String s = searchTable(digits.charAt(i));
    		k = queue.size();
    		for(int j = 0; j < s.length(); j++){
    			
    			for(int l = 0; l < k; l++){
    				sba = new StringBuilder().append(queue.get(l));
    				sba.append(s.charAt(j));
    				queue.add(sba);
    			}
    		}
    		while(k-- > 0){//…æ≥˝…œ“ª
    			queue.remove(0);
    		}
    		
    	}
    	for(StringBuilder ss : queue){
    		re.add(ss.toString());
    	}
        return re;
    }
	
	public static String searchTable(char n){
		switch (n){
			case '1':
				return "1";
			case '2':
				return "abc";
			case '3':
				return "def";
			case '4':
				return "ghi";
			case '5':
				return "jkl";
			case '6':
				return "mno";
			case '7':
				return "pqrs";
			case '8':
				return "tuv";
			case '9':
				return "wxyz";
			case '0':
				return " ";
			
		}
		return "";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(letterCombinations("2213"));
	}

}
