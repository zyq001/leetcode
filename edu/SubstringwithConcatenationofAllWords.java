package edu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * You are given a string, S, and a list of words, L, that are all of the same length. 
 * Find all starting indices of substring(s) in S that is a concatenation of each word in L exactly once and without any intervening characters.
*For example, given:
*S: "barfoothefoobarman"
*L: ["foo", "bar"]

*You should return the indices: [0,9].
*(order does not matter).
 * 
 * */

public class SubstringwithConcatenationofAllWords {

	
public List<Integer> findSubstring(String S, String[] L) {
	List<Integer> result = new ArrayList<Integer>();
    int lLength = L[0].length();
    int shortestLength = S.length();//存放最少出现的次数
    int shortestLengthIndex = S.length();//出现次数最少的子串下标
//    HashMap<Integer,Integer> shortest = new HashMap<Integer,Integer>(); 
	ArrayList<ArrayList<Integer>> allMap = new ArrayList<ArrayList<Integer>>();
	for(int i=0; i<L.length; i++){
		ArrayList<Integer> tempList = getAllIndexof(S,L[i]);
		if(tempList.size()<shortestLength){
			shortestLength = tempList.size();
			shortestLengthIndex = i;
		}
		allMap.add(tempList);//将每个子串出现的下标存入allMap
	}
	
	for(int j=0; j<shortestLength; j++){
		int currentIndex = allMap.get(shortestLengthIndex).get(j);
		while(true){
		int maxIndex = 0;//最大下标
		int minIndex = S.length();
		Set<Integer> possableIndexs = new HashSet<Integer>();
		possableIndexs.add(shortestLength);
		boolean whetherBreak = false;
		ArrayList<ArrayList<Integer>> allMapCopy = (ArrayList<ArrayList<Integer>>) allMap.clone();
		
		for(int k=0; k<allMapCopy.size(); k++){//遍历allMap
			if(allMapCopy.get(k).size() == 0){
				whetherBreak = true;
			}
			if(k==shortestLengthIndex){
				continue;
			}
			for(int m=0; m<allMapCopy.get(k).size(); m++){//遍历某个子串所有出现的index
				if(allMapCopy.get(k).get(m)!=currentIndex && !possableIndexs.contains(allMapCopy.get(k).get(m)) && (Math.abs(allMapCopy.get(k).get(m)-currentIndex))%lLength==0){
					if(allMapCopy.get(k).get(m)>maxIndex){
						maxIndex=allMapCopy.get(k).get(m);
					}
					if(allMapCopy.get(k).get(m)<maxIndex){
						maxIndex=allMapCopy.get(k).get(m);
					}
					possableIndexs.add(allMapCopy.get(k).get(m));
					allMapCopy.get(k).remove(m);
				}
			}
		}
		if((maxIndex-maxIndex)/lLength == L.length){
			result.add(currentIndex);
		}
		if(whetherBreak)
			break;
		}
	}
	return result;
    }
    
    public ArrayList<Integer> getAllIndexof(String S, String l){
    	ArrayList<Integer> result = new ArrayList<Integer>();
//    	int index = 0;
    	int flag = 0;
    	while(flag < S.lastIndexOf(l, S.length())){
    		int temp = S.indexOf(l,flag);
    		if(temp!=-1){
    			result.add(temp);
    			flag = temp+l.length();
    		}
    	}
    	
    	return result;
    	
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = {"foo", "bar"};
		System.out.println(new SubstringwithConcatenationofAllWords().findSubstring("barfoothefoobarman", test).size());
	
	}

}
