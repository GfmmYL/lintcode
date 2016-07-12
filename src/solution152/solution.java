package solution152;

import java.util.ArrayList;
import java.util.List;

public class solution {
	
	public static List<List<Integer>> combine(int n, int k) {
		// write your code here
    	List<List<Integer>> results=new ArrayList<List<Integer>>();

    	if(k>n) return results;
    	int[] index=new int[k];
    	if(k==1){
    	    for(int i=0;i<n;i++){
    	        List<Integer> item = new ArrayList<Integer>();
    	        item.add(i+1);
    	        results.add(item);
    	    }
    	    return results;
    	}
    	for(int i=0;i<k;i++){
    		index[i]=i+1;
    	}
    	
    	while(index[0]<n){
        	List<Integer> item = new ArrayList<Integer>();
    		for(int i=0;i<k;i++){
    			item.add(index[i]);
    		}
    		results.add(item);
    		index[k-1]++;
    		int j=k-1;
    		while(index[j]==n+1){
    			index[j-1]++;
    			index[j]=index[j-1]+1;
    			j--;
    		}
    	}
    	return results;
    }
	public static void main(String[] args) {
		int n=4,k=3;
		System.out.println(combine(n,k));

	}

}
