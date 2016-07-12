package solution135;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<Integer> solution=new ArrayList<Integer>();
    	List<List<Integer>> result= new ArrayList<List<Integer>>();
        if(candidates.length<=0) return result;
        Arrays.sort(candidates);
        int indx=0;
        finder(result,solution,candidates,target,indx);   
        return result;
    }
    static void finder(List<List<Integer>>result, List<Integer> solution, int[] candidates, int target, int indx){
    	if(target<0) return;
    	if(target==0){
    		List<Integer> tmp = new ArrayList<Integer>(Arrays.asList(new Integer[solution.size()]));
    		Collections.copy(tmp, solution);
    		result.add(tmp);
    		return;
    	}
    	for (int i=indx;i<candidates.length;i++){
    		solution.add(candidates[i]);
    		finder(result,solution,candidates,target-candidates[i],i);
    		solution.remove(solution.size()-1);
    	}
    }

	public static void main(String[] args) {
		int[] candidates={2,3,5};
		int target=7;

		System.out.println(combinationSum(candidates,target));

	}

}