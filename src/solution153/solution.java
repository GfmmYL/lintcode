package solution153;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class solution {
    public static List<List<Integer>> combinationSum2(int[] num, int target) {
        // write your code here
    	List<Integer> solution=new ArrayList<Integer>();
    	List<List<Integer>> result= new ArrayList<List<Integer>>();
        if(num.length<=0) return result;
        Arrays.sort(num);
        int indx=0;
        finder(result,solution,num,target,indx);   
        return result;
    	    }
    	    static void finder(List<List<Integer>>result, List<Integer> solution, int[] num, int target, int indx){
    	    	if(target<0) return;
    	    	if(target==0){
    	    		List<Integer> tmp = new ArrayList<Integer>(Arrays.asList(new Integer[solution.size()]));
    	    		Collections.copy(tmp, solution);
    	    		if(!result.contains(tmp)){
    	    			result.add(tmp);
    	    		}
    	    		return;
    	    	}
    	    	for (int i=indx;i<num.length;i++){
    	    		solution.add(num[i]);
    	    		finder(result,solution,num,target-num[i],i+1);
    	    		solution.remove(solution.size()-1);
    	    	}
    	    }

    		public static void main(String[] args) {
    			int[] num={10,1,6,7,2,1,5};
    			int target=8;

    			System.out.println(combinationSum2(num,target));
    		}

}
