package solution46;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static int majorityNumber(ArrayList<Integer> nums) {
        // write your code
    	int len=nums.size();
    	if(len==0) return 0;
    	Collections.sort(nums);
    	int tmp=nums.get(0);
    	int localCount=1;
    	for(int i=1;i<len;i++){
    		if(localCount>len/2){
    			return tmp;
    		}
    		if(nums.get(i)==tmp){
    			localCount++;
    		}
    		else{
    			tmp=nums.get(i);
    			localCount=1;
    		}
    	}
		if(localCount>len/2){
			return tmp;
		}
		else{
			return 0;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums=new ArrayList<Integer>();
		int[] num={2,2,2,1};
		for(int i=0;i<num.length;i++){
			nums.add(num[i]);
		}
		System.out.println(majorityNumber(nums));
	}

}
