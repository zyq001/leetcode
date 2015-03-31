package edu.bupt.zyq;

public class ValidPalindrome {

public static boolean isPalindrome(String s) {
	if(s == null) return true;
	
     s =s.replaceAll("[^a-zA-Z0-9]", "");
        	
    	char []sC = s.toCharArray();
    	for(int i=0; i<sC.length;i++){
    		if(sC[i] == sC[sC.length-i-1] || Math.abs((sC[i] - sC[sC.length-i-1]) )== 32){
    			continue;
    		}else return false;
    	}
    	return true;
    }

public boolean isPalindromeSolution(String s) {
	int i = 0, j = s.length() - 1;
	while (i < j) {
	while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
	while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
	if (Character.toLowerCase(s.charAt(i))
	!= Character.toLowerCase(s.charAt(j))) {
	return false;
	}
	i++; j--;
	}
	return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "A man, a plan, a canal: Panama";
System.out.println(s.replaceAll("[^a-zA-Z]", ""));
System.out.println(isPalindrome("1a1"));
	}

}
