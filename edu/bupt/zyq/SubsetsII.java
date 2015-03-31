package edu.bupt.zyq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

	/**
	 * Given a collection of integers that might contain duplicates, S, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If S = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
	 * */
	
public List<List<Integer>> subsetsWithDup(int[] num) {
		Arrays.sort(num);
	    List<List<Integer>> re = new ArrayList<List<Integer>>();
	    int max = 1 << num.length;
	    for(int i = 0; i < max; i++){//i 表示一种选择
	    	int k = i, Index = 0;//Index指针指向i中的位
	    	ArrayList<Integer> nowSet = new ArrayList<Integer>();
	    	while(Index < num.length){
	    		if( (k&1) > 0){
	    			nowSet.add(num[Index]);
	    		}
	    		k = k >> 1;
	    		Index++;
	    	}
	    	if(!re.contains(nowSet))//就加了这一句
	    	re.add(nowSet);
	    }
	    return re;
	}
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
