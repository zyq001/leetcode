package edu.bupt.zyq;

public class ExcelSheetColumnTitle {

	/**
	 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
	 * */
	
public static String convertToTitle(int n) {
//        int chu = n;
        String res = "";
        while(n != 0){
        	if(n % 26 != 0){
        	res = (char)(n % 26 + (int)'A' -1) +res;
        	n = n /26;
        	}else{
        		res = 'Z' + res;
        		n = n / 26 - 1;
        		if(n == 0) break;
        	}
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(convertToTitle(53));
	}

}
