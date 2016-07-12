package solution65;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	
    public static double findMedianSortedArrays(int[] A, int[] B) {
        // write your code here
    	ArrayList<Integer> AB=new ArrayList<Integer>(A.length+B.length);
    	for(int i=0;i<A.length;i++){
    		AB.add(A[i]);
    	}
    	for(int i=0;i<B.length;i++){
    		AB.add(B[i]);
    	}
    	Collections.sort(AB);
    	if((A.length+B.length)%2==0){
    		return (double)(AB.get((A.length+B.length)/2)+AB.get((A.length+B.length)/2-1))/2;
    	}
    	else{
    		return AB.get((A.length+B.length)/2);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,2,3,4,5,6};
		int[] B={2,3,4,5};
		System.out.println(findMedianSortedArrays(A,B));
	}

}
