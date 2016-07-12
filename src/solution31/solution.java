package solution31;

public class solution {
	
    public static int partitionArray(int[] nums, int k) {
	    //write your code here
    	if(nums==null ||nums.length<=0) return 0;
    	int count=0;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]<k)
    			count++;
    	}
    	if(count==nums.length) return nums.length;
    	int l=0,r=count;
    	while(l<count && r<nums.length){
    		if(nums[l]>=k){
    			while(nums[r]>=k){
    				r++;
    				if(r==nums.length){
    					return count;
    				}
    			}
    			int tmp=nums[l];
    			nums[l]=nums[r];
    			nums[r]=tmp;
    		}
    		else{
    			l++;
    		}
    	}
    	return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={9,9,9,8,9,8,7,9,8,8,8,9,8,9,8,8,6,9};
		System.out.println(partitionArray(nums,9));
	}

}
