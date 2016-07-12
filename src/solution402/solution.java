package solution402;

import java.util.ArrayList;

public class solution {
    public static ArrayList<Integer> continuousSubarraySum(int[] A) {
        // Write your code here
    	int sum=0;
    	int max=A[0];
    	int l=0,r=0;
    	int result_l=0;
    	ArrayList<Integer> result=new ArrayList<Integer>();
    	for(int i=0;i<A.length;i++){
    		sum+=A[i];
    		if(sum>max){
    			r=i;
    			max=sum;
    			result_l=l;
    		}
    		if(sum<0){
    			l=i+1;
    			sum=0;
    		}
    	}
    	result.add(result_l);
    	result.add(r);
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={-101,-33,-44,-55,-67,-78,-101,-33,-44,-55,-67,-78,-100,-200,-1000,-22,-100,-200,-1000,-22};
		System.out.println(continuousSubarraySum(num));

	}

}
