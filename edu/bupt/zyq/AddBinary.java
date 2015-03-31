package edu.bupt.zyq;

public class AddBinary {

	/**
	 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100"
	 * */
	
public static String addBinary(String a, String b) {
        if(a == null)return b;
        if(b == null)return a;
        int carry = 0;       
        if(a.length() < b.length()){
        	String c = a;
        	a = b;
        	b = c;        	
        }
        StringBuilder sb = new StringBuilder(a.length());
        int i, now;
        for(i = b.length()-1; i >= 0; i--){
        	now = Integer.parseInt("" + b.charAt(i)) + Integer.parseInt("" + a.charAt(a.length() - b.length() + i)) + carry;
        	sb.insert(0, now % 2);
        	carry = now / 2;
        }
        for(int j = a.length() - b.length()-1; j >= 0; j--){
        	now = Integer.parseInt("" + a.charAt(j)) + carry;
        	sb.insert(0, now % 2);
        	carry = now / 2;
        }
        if(carry == 1){
        	sb.insert(0, 1);
        }
        return sb.toString();
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(addBinary("11", "1"));
	}

}
