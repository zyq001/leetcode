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
	
	//0,1��ʾ�Ӽ����Ƿ���ĳԪ�أ���2^n���Ӽ��� ��һ��int�Ķ����Ʊ�ʾĳ���Ӽ���ѡ��������ص����ڱ������int��ÿһλ
public List<List<Integer>> subsets(int[] S) {
        Arrays.sort(S);
        List<List<Integer>> re = new ArrayList<List<Integer>>();
        int max = 1 << S.length;
        for(int i = 0; i < max; i++){//i ��ʾһ��ѡ��
        	int k = i, Index = 0;//Indexָ��ָ��i�е�λ
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
