package solution532;

public class solution {
    public long reversePairs(int[] A) {
        // Write your code here
    	if(A==null || A.length<=0) return 0;
    	int count=0;
    	for(int i=0;i<A.length-1;i++){
    		for(int j=i+1;j<A.length;j++){
    			if(A[i]>A[j]){
    				count++;
    			}
    		}
    	}
    	return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
