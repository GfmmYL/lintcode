package solution148;

public class solution {
    public void sortColors(int[] nums) {
        // write your code here
    	if(nums==null) return;
    	int len=nums.length;
    	if(len<=0) return;
    	int count0=0,count1=0;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]==0) count0++;
    		else if(nums[i]==1) count1++;
    	}
    	for(int i=0;i<count0;i++){
    		nums[i]=0;
    	}
    	for(int i=count0;i<count0+count1;i++){
    		nums[i]=1;
    	}
    	for(int i=count0+count1;i<len;i++){
    		nums[i]=2;
    	}
    	return;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
