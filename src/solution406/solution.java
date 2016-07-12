package solution406;

public class solution {
    public static int minimumSize(int[] nums, int s) {
        // write your code here
    	int sum=100000;
    	int mark=0;
    	int[][] values=new int[nums.length][nums.length];
    	for(int w=0;w<=nums.length-1;w++){
    		for(int i=0;i<nums.length-w;i++){ 
    			int j=i+w;
    			if(i==j){
    				values[i][j]=nums[i];
    			}
    			else{
    				values[i][j]=values[i][j-1]+nums[j];
    			}
    			if(values[i][j]-s>=0 && values[i][j]-s<sum){
    				sum=values[i][j]-s;
    				mark=w+1;
    			}
    		}
    	}
    	if(sum==100000) return -1;
    	return sum>=0?mark:-1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,1,2,3,1,5};
		System.out.println(minimumSize(nums,5));
	}

}
