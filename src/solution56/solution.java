package solution56;

import java.util.HashMap;
import java.util.Map;

public class solution {
    public static int[] twoSum(int[] numbers, int target) {
        // write your code here
    	Map<Integer,Integer> mapping=new HashMap<>();
    	int[] result=new int[2];
    	if(numbers==null) return result;
    	if(numbers.length<=0) return result;
    	for(int i=0;i<numbers.length;i++){
    		mapping.put(numbers[i], i);
    	}
    	for(int i=0;i<numbers.length;i++){
    		int search=target-numbers[i];
    		if(mapping.containsKey(search)){
    			result[0]=i;
    			result[1]=mapping.get(search);
    			return result;
    		}
    	}
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,0,-1};
		System.out.println(twoSum(A,-1));
	}

}
