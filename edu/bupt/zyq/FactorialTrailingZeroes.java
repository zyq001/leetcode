package edu.bupt.zyq;

public class FactorialTrailingZeroes {

	/**
	 * Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.
	 * 
	 * */
	
public static int trailingZeroes(int n) {
        int re = 0;
        int x = 5;
        while(n >= x){
        	re += n / x;
        	if(Integer.MAX_VALUE / 5 <= x)
        		break;
        	x *= 5;
        }
        return re;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(System.currentTimeMillis());
		System.out.println(trailingZeroes(2147483647));
		System.out.println(System.currentTimeMillis());

	}

}
