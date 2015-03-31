package edu.bupt.zyq;

import java.util.ArrayList;
import java.util.List;

public class CompareVersionNumbers {

	/**
	 * Compare two version numbers version1 and version1.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
	 * */
	
public static int compareVersion(String version1, String version2) {
       List<Integer> re1 = new ArrayList<Integer>();
       List<Integer> re2 = new ArrayList<Integer>();
       String[] v1 = null, v2 = null;
        int re10 =0 ,re20 =0, re11 = 0,re21 = 0 ;
        if(!version1.contains(".")){
        	re1.add(Integer.valueOf(version1));
        }else{
        	  v1 = version1.split("\\.");
        	 for(String t: v1){
        		 re1.add(Integer.valueOf(t));
        	 }        	
        }
        if(!version2.contains(".")){
        	re2.add(Integer.valueOf(version2));
        }else{
        	 v2 = version2.split("\\.");
        	 for(String t: v2){
        		 re1.add(Integer.valueOf(t));
        	 }        	
        }
        
        if(re1.size()<re2.size()){
        	List<Integer> temp = re2;
        	re2 = re1;
        	re1 = temp;
        }
       for(int i=0; i<re2.size(); i++){
    	   if(re1.get(i)>re2.get(i))return 1;
    	   if(re1.get(i)<re2.get(i))return -1;
       }
       if(re1.size() > re2.size()){
    	   for (int j = re2.size(); j<re1.size(); j++){
    		   if(re1.get(j)>0)return 1;
    	   }
       }else return 0;
        return 0;
      
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(compareVersion("1.0","1.1"));
	}

}
