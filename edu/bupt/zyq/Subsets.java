package edu.bupt.zyq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import com.sun.java.util.jar.pack.ConstantPool.Index;

public class Subsets {

	/**
	 * Given a set of distinct integers, S, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If S = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
	 * */
	
	//0,1表示子集中是否有某元素，共2^n个子集， 用一个int的二进制表示某个子集的选择情况，重点在于遍历这个int的每一位
public List<List<Integer>> subsets(int[] S) {
        Arrays.sort(S);
        List<List<Integer>> re = new ArrayList<List<Integer>>();
        int max = 1 << S.length;
        for(int i = 0; i < max; i++){//i 表示一种选择
        	int k = i, Index = 0;//Index指针指向i中的位
        	ArrayList<Integer> nowSet = new ArrayList<Integer>();
        	while(Index < S.length){
        		if( (k&1) > 0){
        			nowSet.add(S[Index]);
        		}
        		k = k >> 1;
        		Index++;
        	}
        	re.add(nowSet);
        }
        return re;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
