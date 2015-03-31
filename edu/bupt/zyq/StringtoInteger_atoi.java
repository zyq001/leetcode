package edu.bupt.zyq;

public class StringtoInteger_atoi {

	/**
	 * Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.

spoilers alert... click to show requirements for atoi.

Requirements for atoi:
The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
	 * */
	
	public static int atoi(String str) {
		if(str == null ) return 0;
        double res = 0;
        boolean fu = false;
        int i = 0;
        while(i++ < str.length()){
        	if(str.matches("\\s(.+)?")){
        		str = str.substring(1);
        	}else break;        
        }
        if(str.length() < 0) return 0;
        if(!str.matches("(-|\\+)?[0-9](.+)?")) return 0;
        if(str.charAt(0) == '-') {
        	str = str.substring(1);
        	fu = true;
        }else if(str.charAt(0) == '+'){
        	str = str.substring(1);
        }
        i=0;
        while(i++ < str.length()){
        	if(str.charAt(0) == '0'){
        		str = str.substring(1);
        	}else break;
        }
        
        if(str.length() < 0) return 0;
        str = str.split("[^0-9]")[0];
        for(i = 0; i < str.length(); i++){
//        	if(str.charAt(i))
        	res = 10 * res  + Integer.parseInt("" + str.charAt(i));
        }
        if(fu) res = -res;
        if(res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(atoi("9223372036854775809"));
	}

}
