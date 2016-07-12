package solution43;

public class Solution {

    public int maxSubArray(int[] nums, int k) {
        // write your code here
    	if(nums.length<k) return 0;
    	return 0;
    }
    public int minSubArray(int[] nums) {
        if (nums.length==0) return 0;
        int sum=nums[0];
        int min=sum;
        for(int i=1; i<nums.length;i++){
        	sum=sum+nums[i];
        	if (sum<min) min=sum;
        	if (nums[i]<min) min=nums[i];
        	if (sum>nums[i]) sum=nums[i];
        }
        if (sum<min) min=sum;
      return min;  
    }
    public void main(String[] args ){
    	
    }
}
