package solution82;

import java.util.Arrays;

public class Solution {

    public static int singleNumber(int[] A) {
        // Write your code here
    	Arrays.sort(A);
    	if(A.length==0) return 0;
    	int len=A.length/2;
    	if(len==0) return A[0];
    	for(int i=0;i<len;i++){
    		if(A[2*i+1]!=A[2*i]){
    			return A[2*i];
    		}
    			
    	}
    	return A[A.length-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,2,2,1,3,4,3};
		System.out.println(singleNumber(A));
	}

}
