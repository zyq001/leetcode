package edu.bupt.zyq.math;

public class PalindromeNumber {

	/**
	 * Determine whether an integer is a palindrome. Do this without extra space.

click to show spoilers.

Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, 
if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.
	 * */

	public boolean isPalindrome(int x) {
		//����ͷ��ʼ�Ƚϣ��Ƚ���һ�ν�x��βȥ���ֱ�ȥ��һλ x = (x % carry) / 10;
		//�ؼ���ȡ��һλ������һ��ȫ�ֵ�carry 1����k��0 ���ڸ���ǰxλ����ͬ  l = x / carry ���������һλ
		if(x < 0) return false;
		int carry = 1;
		while(x / carry >= 10){
			carry *= 10;
		}
		
		while(x > 0){
			int l = x / carry;
			int r = x % 10;
			if(l != r) return false;
			x = (x % carry) / 10;
			carry /= 100;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
