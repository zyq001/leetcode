package edu.bupt.zyq;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	/**
	 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
	 * 
	 * */
	//Pascals1
public static List<List<Integer>> generate(int numRows) {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
    if( numRows > 0){
    List<Integer> a = new ArrayList<Integer>();
    a.add(1);
    res.add(a);
    int n = 0;
    while(++n<numRows){
    	List<Integer> a1 = new ArrayList<Integer>();
    	a1.add(res.get(n-1).get(0));
    	for(int i=0; i<res.get(n-1).size()-1;i++){
    		a1.add(res.get(n-1).get(i)+res.get(n-1).get(i+1));
    	}
    	a1.add(res.get(n-1).get(res.get(n-1).size()-1));
    	res.add(a1);
    }
    }
    return res;
}
public static List<Integer> getRow(int rowIndex) {
	
	List<Integer> res = new ArrayList<Integer>(rowIndex+1);
	ArrayList<Integer> resT = new ArrayList<Integer>();
    if( rowIndex > 0){
    res.add(1);
    int n = 0;
    while(++n<=rowIndex){
    	resT.clear();
    	resT.addAll(res);
    	for(int i=1; i<res.size();i++){ 
    		res.set(i, resT.get(i-1)+resT.get(i));
    	}
    	res.add( 1);
    }
    }
    return res;
	
	
}
//        List<Integer> res = new ArrayList<Integer>(rowIndex+1);
//        for(int i=0; i<rowIndex+1; i++){
//        	res.add(get(rowIndex,i));
//        }
//        return res;
//    }
//public static int get(int r,int i){
//	if(r == 0 || i == 0 || i ==  r)		return 1;	
//	if (i<0 || i>r) return 0;
//	
//	return get(r-1,i-1)+get(r-1,i);
//}

//public static nextPascalsList
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<List<Integer>> res = generate(5);
//		for(List<Integer> t : res){
//			for(int t1: t){
//				System.out.print(t1+" ");
//			}
//			System.out.println();
//		}
	System.out.println(System.currentTimeMillis());	
		List<Integer> re = getRow(25);
		System.out.println(System.currentTimeMillis());	

		for(int t : re){
			System.out.print(t+" ");
		}
	}

}
