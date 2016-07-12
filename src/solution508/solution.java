package solution508;

import java.util.Arrays;

public class solution {
    public static void wiggleSort(int[] nums) {
        // Write your code here
    	if(nums==null || nums.length<=0) return;
		int len=nums.length/2;
    	Arrays.sort(nums);
    	if(len%2==1 && nums.length%2==0){
    		int i=1;
    		while(i<len){
    			int tmp=nums[len+i];
    			nums[len+i]=nums[i];
    			nums[i]=tmp;
    			i=i+2;
    		}
    	}
    	else if(len%2==1 && nums.length%2==1){
    		int i=1;
    		while(i<=len){
    			int tmp=nums[len+i];
    			nums[len+i]=nums[i];
    			nums[i]=tmp;
    			i=i+2;
    		}   		
    	}
    	else if(len%2==0 && nums.length%2==1){
    		int i=1;
    		while(i<len){
    			int tmp=nums[len+i+1];
    			nums[len+i+1]=nums[i];
    			nums[i]=tmp;
    			i=i+2;    			
    		}
    	}
    	else if(len%2==0 && nums.length%2==0){
    		int i=1;
    		while(i<=len){
    			int tmp=nums[len+i-1];
    			nums[len+i-1]=nums[i];
    			nums[i]=tmp;
    			i=i+2;
    		}    		
    	}
    	return;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3,4,5,6,7,8};
		wiggleSort(nums);
	}

}
