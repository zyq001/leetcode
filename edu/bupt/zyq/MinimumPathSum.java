package edu.bupt.zyq;

public class MinimumPathSum {

	/**
	 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.
	 * */
	public static int[][] min ;
	public static int minPathSum(int[][] grid) {
		//递归查找并比较上面和左边的数，取较小值加上该节点值就是该节点最短路程，
		//注意：每计算一个元素的值，记下来，下次不用算了，复杂度就下来了！就从纯递归变成DP了
		if(grid == null || grid.length < 1) return 0;		
		int m = grid.length;
		int n = grid[0].length;
		min = new int[m][n];
		for(int i = 0; i< m; i++){
			for(int j = 0; j < n; j++){
				min[i][j] = -1;
			}
		}
		int re;
		re = minPathSumRe(grid, m - 1, n - 1);
		return re;
    }
	
	public static int minPathSumRe(int[][] grid, int m, int n){
		if(m == 0 && n == 0) 
		return grid[0][0];
		int nowMin = Integer.MAX_VALUE;
		if(m > 0) {
			if(min[m-1][n] < 0)
				min[m - 1][n] = minPathSumRe(grid, m - 1, n);
			if(min[m - 1][n] < nowMin)
				nowMin = min[m - 1][n];
		}
		if(n > 0) {
			if(min[m][n - 1] < 0)
				min[m][n - 1] = minPathSumRe(grid, m, n - 1);
			if(min[m][n - 1] < nowMin)
				nowMin = min[m][n - 1];
			
		}
		min[m][n] = nowMin + grid[m][n];
		return min[m][n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] t = {{5,0,1,1,2,1,0,1,3,6,3,0,7,3,3,3,1},{1,4,1,8,5,5,5,6,8,7,0,4,3,9,9,6,0},{2,8,3,3,1,6,1,4,9,0,9,2,3,3,3,8,4},{3,5,1,9,3,0,8,3,4,3,4,6,9,6,8,9,9},{3,0,7,4,6,6,4,6,8,8,9,3,8,3,9,3,4},{8,8,6,8,3,3,1,7,9,3,3,9,2,4,3,5,1},{7,1,0,4,7,8,4,6,4,2,1,3,7,8,3,5,4},{3,0,9,6,7,8,9,2,0,4,6,3,9,7,2,0,7},{8,0,8,2,6,4,4,0,9,3,8,4,0,4,7,0,4},{3,7,4,5,9,4,9,7,9,8,7,4,0,4,2,0,4},{5,9,0,1,9,1,5,9,5,5,3,4,6,9,8,5,6},{5,7,2,4,4,4,2,1,8,4,8,0,5,4,7,4,7},{9,5,8,6,4,4,3,9,8,1,1,8,7,7,3,6,9},{7,2,3,1,6,3,6,6,6,3,2,3,9,9,4,4,8}};
		System.out.println(System.currentTimeMillis());
		System.out.println(minPathSum(t));
		System.out.println(System.currentTimeMillis());

	}

}
