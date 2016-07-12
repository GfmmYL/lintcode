package solution62;

import java.util.Arrays;

public class solution {
	
    public static int search(int[] A, int target) {
        // write your code here
    	if(A==null) return -1;
    	int len=A.length;
    	if(len<=0) return -1;
    	int shift=len-1;
    	for(int i=0;i<len-1;i++){
    		if(A[i+1]<A[i]){
    			shift=i;
    			break;
    		}
    	}
    	int l=0,r=0;
    	if(target>=A[0]){
        	l=0;
        	r=shift;
    	}
    	else if(target<=A[len-1]){
        	l=shift;
        	r=len-1;    		
    	}
    	else{
    		return -1;
    	}
    	while(r>=l){
    		int i=(l+r)/2;
    		if(A[i]==target){
    			return i;
    		}
    		else if(A[i]>target){
    			r=i-1;
    		}
    		else{
    			l=i+1;
    		}
    	}
    	return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={5};
		System.out.println(search(A,5));
	}

}
