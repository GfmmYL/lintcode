package solution383;

public class solution {

    public static int maxArea(int[] heights) {
       int area=0;
       int res=0;
       int l=0,r=heights.length-1;
       while(l<r){
    	   area=Math.min(heights[r],heights[l])*(r-l);
    	   res=Math.max(area, res);
    	   if(heights[r]<heights[l]){
    		   r--;
    	   }
    	   else{
    		   l++;
    	   }
       }
       return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,3,2};
		System.out.println(maxArea(num));
	}

}
