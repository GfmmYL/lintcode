package solution363;

public class solution {
    public static int trapRainWater(int[] heights) {
        // write your code here
    	int start=0;
    	if(heights==null) return 0;
    	if(heights.length<3) return 0;
    	for(int i=0;i<heights.length;i++){
    		if(heights[i]>0){
    			start=i;
    			break;
    		}
    	}
    	int sum=0;
    	boolean flag=true;
    	while(start<heights.length-1){
    		flag=true;
        	int r=start+1;
    		int tmp=heights[start];
    		for(int i=r;i<heights.length;i++){
    			if(heights[i]>=tmp){
    				r=i;
    			    flag=false;	
    				break;
    			}
    		}
    		if(flag){
    			start++;
    			continue;
    		}
    		else{
				int top=Math.min(heights[start], heights[r]);	
	    		for(int i=start+1;i<r;i++){
	    			sum+=top-heights[i];	
	    		}
	    		start=r;
    		}
    	}
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={0,1,0,2,1,0,1,3,2,1};
		System.out.println(trapRainWater(A));
	}

}
