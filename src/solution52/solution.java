package solution52;

import java.util.Arrays;

public class solution {
    public static void nextPermutation(int[] nums) {
        // write your code here
    	if(nums==null){
    		return;
    	}
    	if(nums.length<=0){
    		return;
    	}
    	int[] result=new int[nums.length];
    	for(int j=nums.length-1;j>=1;j--){
    		if(nums[j]>nums[j-1]){
    			int[] tmp = new int[nums.length-j];
    			for(int i=0;i<nums.length-j;i++){
    				tmp[i]=nums[i+j];
    			}
    			Arrays.sort(tmp);
    			
    			//find the minimum value that's bigger than nums[j-1], mark place
    			int min=100000;
    			int mark=0;
    			for(int i=0;i<nums.length-j;i++){
    				if(tmp[i]>nums[j-1] && tmp[i]<min){
    					min=tmp[i];
    					mark=i;
    				}
    			}
    			
    			//switch
    			int tmp2=nums[j-1];
    			nums[j-1]=tmp[mark];
    			tmp[mark]=tmp2;
    			
    			//copy the rest values into result
    			Arrays.sort(tmp);
    			for(int i=j;i<nums.length;i++){
    				nums[i]=tmp[i-j];
    			}
    			
    			return;
    		}
    	}
    	Arrays.sort(nums);
    	return;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,3,2};
		nextPermutation(A);
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]);
		}
	}

}
