package edu.bupt.zyq;

import javax.sound.midi.MidiChannel;

public class Sqrtx {

	/**
	 * Implement int sqrt(int x).

Compute and return the square root of x.
	 * */
	
	public static int sqrt(int x) {
        if(x <= 0) return 0;
        long start = 0, end = x, mid = 0;
        while(start <= end){
        	mid = (start + end)/2;
        	if(mid * mid == x || mid * mid < x && (mid + 1) * (mid + 1) > x )
        		return (int) mid;
//    		if( mid * mid > x && (mid - 1) * (mid - 1) < x)
//    			return (int) mid-1;
        	if(mid * mid < x){
        		start = mid + 1;
        	}else if(mid *mid > x){
        		end = mid - 1;
        	}
        }
        return (int) mid;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sqrt(6));
	}

}
