package solution61;

public class solution {
    public static int[] searchRange(int[] A, int target) {
        // write your code here
    	int[] result={0,0};
    	if(A==null || A.length<=0){
    		result[0]=-1;result[1]=-1;    		
    		return result;
    	}

    	for(int i=0;i<A.length;i++){
    		if(A[i]<target){
    			result[0]++;
    		}
    		if(A[i]<=target){
    			result[1]++;
    		}
    	}

    	if(result[1]-result[0]==0){
    		result[0]=-1;result[1]=-1;
    		return result;
    	}
    	result[1]--;
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={5, 7, 7, 8, 8, 10};
		System.out.println(searchRange(A,8));
	}

}
