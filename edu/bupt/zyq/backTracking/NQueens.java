package edu.bupt.zyq.backTracking;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.NEW;


public class NQueens {
	/**
	 * The n-queens puzzle is the problem of placing n queens on an n��n chessboard such that no two queens attack each other.



	Given an integer n, return all distinct solutions to the n-queens puzzle.

	Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.'
	 both indicate a queen and an empty space respectively.

	For example,
	There exist two distinct solutions to the 4-queens puzzle:

	[
	 [".Q..",  // Solution 1
	  "...Q",
	  "Q...",
	  "..Q."],

	 ["..Q.",  // Solution 2
	  "Q...",
	  "...Q",
	  ".Q.."]
	]
	 * */
	private List<String[]> re = new ArrayList<String[]>();
	public List<String[]> solveNQueens(int n) {
		if(n < 2) return new ArrayList<String[]>();
		int[] pos = new int[n];
		pos[0] = 0;
		isOK(pos, 1, 0);
		return re;
	}
	
	public void isOK(int [] pos, int end, int index){
		if(index >= pos.length){//ֱ�ӻ��ݵ���һ��
			if (end == 0) return;
			isOK(pos, end - 1, pos[end - 1] + 1);
			return;
		}else if(end == 0){
			pos[end] += 1;
			isOK(pos, end + 1, 0);
			return;
		}
		for(int i = 0; i < end ; i++){
			if(pos[i] == index || (end - i) == Math.abs(index - pos[i])){
				//��ǰindex�����Է�Q��
				if(index < pos.length - 1){
					//���ɷţ��ҵ�ǰ�л�δ�����꣬�ж�index + 1��λ���Ƿ�ɷ�
					isOK(pos, end, index + 1);
					return;
				}else if(index == pos.length - 1){
					//���ɷţ��ҵ�ǰ���ѱ�����
					if(end - 1 >= 0){//����{
						isOK(pos, end - 1, pos[end - 1] + 1);
						return;
					}
					else
						return;
				}
			}
		}		
		pos[end] = index;
		if(end + 1 == pos.length) {
			write2List(pos);
		}
		isOK(pos, end + 1, 0);
		
	}
	
	public void write2List(int[] pos){//�ѽ��д�뷵��
		String[] reStrings = new String[pos.length];
		for(int i = 0; i < pos.length; i++){
			StringBuilder sb = new StringBuilder();
			int j = 0;
			while(j < pos.length){
				if(j == pos[i]) sb.append('Q');
				else sb.append('.');
				j++;
			}
			reStrings[i] = sb.toString();
		}
		re.add(reStrings);
	}
	
	public static void main(String[] args){
		
		System.out.println(new NQueens().solveNQueens(4));
		
	}

}
