package solution116;

public class solution {
    public static int jump(int[] A) {
        // write your code here
    	int n_jump=0;
    	int last=0;
    	int cur=0;
    	if(A.length<=1) return 0;
    	for(int i=0;i<A.length;i++){
    		if(i>cur) return 0;
    		if(i>last){
    			last=cur;
    			n_jump++;
    		}
    		cur=Math.max(cur, i+A[i]);
    	}
    	return cur>=A.length-1?n_jump:0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={4,34};
		System.out.println(jump(A));
	}

}
