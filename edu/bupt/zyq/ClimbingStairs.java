package edu.bupt.zyq;

public class ClimbingStairs {

	/**
	 * You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	 * */
	
public static int climbStairs(int n) {        
		if(n ==2 ) return 2;
        if(n == 1) return 1;
        int res = 0;
        int pre =2, prepre = 1;
        for(int i = 3; i<n; i++){
        	res = pre + prepre; 
        	prepre = pre;
        	pre = res;        	
        }        
        return res;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis());
		System.out.println(climbStairs(44));
		System.out.println(System.currentTimeMillis());

	}

}
