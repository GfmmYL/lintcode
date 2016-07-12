package solution191;

public class Solution {

    public static int maxProduct(int[] nums) {
        // write your code here
    	if(nums.length==0) return 0;
    	int local_max=nums[0];
    	int local_min=nums[0];
    	int global_product=nums[0];
    	for(int i=1;i<nums.length;i++){
    		int tmp=local_max;
    		local_max=Math.max(Math.max(local_max*nums[i], nums[i]),local_min*nums[i]);
    		local_min=Math.min(Math.min(local_min*nums[i], nums[i]),tmp*nums[i]);
    		global_product=Math.max(global_product, local_max);
    	}
    	return global_product;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={2,3,-2,4};
		System.out.println(maxProduct(nums));
	}

}
