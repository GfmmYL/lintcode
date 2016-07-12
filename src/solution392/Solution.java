package solution392;

public class Solution {
	
    public static long houseRobber(int[] A) {
        // write your code here
    	if(A.length<=0) return 0;
    	if(A.length==1) return A[0];
    	long[] dp=new long[A.length];
    	dp[0]=A[0];
    	dp[1]=Math.max(A[0],A[1]);
    	for(int i=2;i<A.length;i++){
    		dp[i]=Math.max(dp[i-1], dp[i-2]+A[i]);
    	}
    	return dp[A.length-1];
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={3,2,1,5};
		System.out.println(houseRobber(A));

	}

}
