package edu.bupt.zyq;

import java.util.ArrayList;
import java.util.List;

public class CountandSay {
	/**
	 * The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.
	 * */
	
public static String countAndSay(int n) {
        int nc = 2;
        StringBuilder re =new StringBuilder( "1");
        int repCount = 1;
    	StringBuilder prev ;
    	char temp ;
        while(nc<=n){
        	prev = re;
        	re = new StringBuilder();
        	temp = prev.charAt(0);
        	repCount = 1;
        	for(int i=1; i<prev.length(); i++){
        		if(prev.charAt(i) != temp){
        			re.append(repCount).append(temp);
        			temp = prev.charAt(i);
        			repCount = 1;
        		}else{
        			repCount++;
        		}
        	}
        	re.append(repCount).append(temp);
        	nc++;
        }
        return re.toString();
    }

//public static StringBuilder say(StringBuilder prev){
//	int repCount = 1;
//	StringBuilder re = new StringBuilder();
//	for(int i=0; i<prev.length(); i++){
//		if(i < prev.length()-1 && (prev.charAt(i) == prev.charAt(i+1))){
//			repCount++;
//		}else{
//			re.append(repCount).append(1);
//			re.append(prev.charAt(i));
//		}
//	}
//	prev.delete(0, prev.length()-1);
//	prev = null;
//	return re;
//}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis());
		System.out.println(countAndSay(50));
		System.out.println(System.currentTimeMillis());

	}

}
