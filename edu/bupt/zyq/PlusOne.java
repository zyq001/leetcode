package edu.bupt.zyq;

public class PlusOne {


	/**
	 * Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
	 * */
	
public int[] plusOne(int[] digits) {
	int[] re ;
	int carry = 1;
	for(int i = digits.length -1; i >= 0; i++){
		int temp = digits[i]+carry;
		digits[i] = temp % 10;
		carry = temp / 10;
		if (carry == 0)break;
	}
	if(digits.length != 0 && carry == 1){
		re = new int[digits.length + 1];
		re[0] = 1;
		for(int j = 0; j < digits.length; j++){
			re[j+1] = digits[j];
		}
		return re;
	}else return digits;
	
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
