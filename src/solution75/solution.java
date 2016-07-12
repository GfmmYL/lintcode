package solution75;

public class solution {
    public static int findPeak(int[] A) {
        // write your code here
    	if(A.length<=0) return 0;
    	for(int i=1;i<A.length-1;i++){
    		if(A[i]>A[i-1] && A[i]>A[i+1]){
    			return i;
    		}	
    	}
    	return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1, 2, 1, 3, 4, 5, 7, 6};
		System.out.println(findPeak(A));
	}

}
