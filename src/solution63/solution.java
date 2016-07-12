package solution63;

public class solution {
    public static boolean search(int[] A, int target) {
        // write your code here
    	if(A==null) return false;
    	int len=A.length;
    	if(len<=0) return false;
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
        	l=shift+1;
        	r=len-1;    		
    	}
    	else{
    		return false;
    	}
    	while(r>=l){
    		int i=(l+r)/2;
    		if(A[i]==target){
    			return true;
    		}
    		else if(A[i]>target){
    			r=i-1;
    		}
    		else{
    			l=i+1;
    		}
    	}
    	return false;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1, 1, 1, 1, 1, 1};
		System.out.println(search(A,0));
	}

}
