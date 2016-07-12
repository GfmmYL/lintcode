package solution189;

import java.util.Arrays;

public class solution {
	
    public static int firstMissingPositive(int[] A) {
        // write your code here
    	Arrays.sort(A);
    	if(A.length<=0 || A[0]>1) return 1;
    	for(int i=1;i<A.length;i++){
    		if(A[i]-A[i-1]>1 && A[i-1]>0){
    			return A[i-1]+1;   		
    		}
    	}
    	return A[A.length-1]+1>1?A[A.length-1]+1:1;
    }	

	public static void main(String[] args) {
		int[] A={1,1,1,1};
		System.out.println(firstMissingPositive(A));
	}

}
