package solution45;

public class solution {
	
    public static int maxDiffSubArrays(int[] nums) {
        // write your code here
    	if(nums.length==0) return 0;
    	int global=-1000000;
    	for(int k=1;k<nums.length;k++){
        	int localMax1=-1000000;
        	int globalMax1=-1000000;
        	int localMin1=1000000;
        	int globalMin1=1000000;        	
        	int localMax2=-1000000;
        	int globalMax2=-1000000;
        	int localMin2=1000000;
        	int globalMin2=1000000;
        	for(int i=0;i<k;i++){
        		localMax1=Math.max(localMax1+nums[i], nums[i]); 		
        		globalMax1=Math.max(localMax1, globalMax1);
        		localMin1=Math.min(localMin1+nums[i], nums[i]); 		
        		globalMin1=Math.min(localMin1, globalMin1);
        	}
        	for(int i=k;i<nums.length;i++){
        		localMax2=Math.max(localMax2+nums[i], nums[i]); 		
        		globalMax2=Math.max(localMax2, globalMax2);
        		localMin2=Math.min(localMin2+nums[i], nums[i]); 		
        		globalMin2=Math.min(localMin2, globalMin2);
        	}
        	int tmp=Math.max(Math.abs(globalMin2-globalMax1), Math.abs(globalMin1-globalMax2));
        	global=Math.max(global,tmp);
    	}
    	return global;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1, 2, -3, 1};
		System.out.println(maxDiffSubArrays(nums));
	}

}
