package solution41;

public class solution {
    public static int maxSubArray(int[] nums) {
    	if(nums.length==0) return 0;
    	int local=0;
    	int global=0;
    	for(int i=0;i<nums.length;i++){
    		local=Math.max(local+nums[i], nums[i]);
    		global=Math.max(local, global);
    	}
    	return global;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={ -2,2, -3,4, -1,2,1, -5,3};
		System.out.println(maxSubArray(A));
	}

}
