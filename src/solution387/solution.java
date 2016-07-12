package solution387;

import java.util.Arrays;

public class solution {
    public static int smallestDifference(int[] A, int[] B) {
        // write your code here
    	if(A==null || B==null) return 0;
    	int lenA=A.length;
    	int lenB=B.length;
    	if(lenA==0 || lenB==0) return 0;
    	Arrays.sort(A);
    	Arrays.sort(B);
    	int i=0,j=0;
    	int diff=Math.abs(A[0]-B[0]);
    	int tmp=0;
    	int diff_local=0;
    	if(A[0]<B[0]){
    		tmp=A[0];i++;
    		}
    	else{
    		tmp=B[0];j++;
    		}
    	while(i<lenA && j<lenB){
    		if(A[i]<B[j] && i<lenA){
    			diff_local=B[j]-A[i];
    			tmp=A[i];
    			i++;
    		}
    		else if(A[i]>=B[j] && j<lenB){
    			diff_local=A[i]-B[j];
    			tmp=B[j];
    			j++;	
    		}

    		if(diff_local<diff){
    			diff=diff_local;
    		}
    	}
    	return diff;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={3,6,7,4};
		int[] B={2,8,9,3};
		System.out.println(smallestDifference(A,B));
	}

}
