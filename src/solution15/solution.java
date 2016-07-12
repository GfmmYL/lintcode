package solution15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class solution {
    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        // write your code here
    	ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
    	if(nums==null){
    		return result;
    	}
    	if(nums.size()<=0){
    		return result;
    	}
    	ArrayList<Integer> curr=new ArrayList<Integer>();
    	Boolean[] isVisited=new Boolean[nums.size()];
    	for(int i=0;i<nums.size();i++){
    		isVisited[i]=false;
    	}
    	findPermutations(result,nums,curr,isVisited);
    	return result;
    }
    public static void findPermutations(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> nums, ArrayList<Integer> curr, Boolean[] isVisited){
    	if(curr.size()==nums.size()){
    		ArrayList<Integer> tmp = new ArrayList<Integer>(Arrays.asList(new Integer[curr.size()]));
    		Collections.copy(tmp, curr);
    		result.add(tmp);
    		return;
    		
    	}
    	for(int i=0;i<nums.size();i++){
    		if(isVisited[i]==false){
    			curr.add(nums.get(i));
    			isVisited[i]=true;
    			findPermutations(result,nums,curr,isVisited);
    			isVisited[i]=false;
    			curr.remove(curr.size()-1);
    			
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums=null;
		System.out.println(permute(nums));
		
	}
}
