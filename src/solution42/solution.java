package solution42;

import java.util.ArrayList;

public class solution {
    public static int maxTwoSubArrays(ArrayList<Integer> nums) {
        // write your code
    	if(nums.size()==0) return 0;
    	int global=-1000000;
    	for(int k=1;k<nums.size();k++){
        	int local1=-1000000;
        	int global1=-1000000;
        	int local2=-1000000;
        	int global2=-1000000;
        	for(int i=0;i<k;i++){
        		local1=Math.max(local1+nums.get(i), nums.get(i));
        		global1=Math.max(local1, global1);
        	}
        	for(int i=k;i<nums.size();i++){
        		local2=Math.max(local2+nums.get(i), nums.get(i));
        		global2=Math.max(local2, global2);
        	}
        	global=Math.max(global,global1+global2);
    	}
    	return global;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]B={5,-10,4};
		ArrayList<Integer> A = new ArrayList<Integer>(B.length);

		for(int i=0;i<B.length;i++){
			A.add(B[i]);
		}
		System.out.println(maxTwoSubArrays(A));
	}

}
