package solution510;

import java.util.Stack;

public class solution {
	
    public static int maximalRectangle(boolean[][] matrix) {
        // Write your code here
    	//row length
    	int len1=matrix.length;
    	if(len1==0) return 0;
    	//column length
    	int len2=matrix[0].length;
    	if(len2==0) return 0;
    	int largestSize=0;
    	for(int i=0;i<len1;i++){
    		//for each row, build a histogram
    		int[] tmp=new int[len2];
    		for(int j=0;j<len2;j++){
    			tmp[j]=0;
				for(int k=i;k>=0;k--){
					if(matrix[k][j]==true){
						tmp[j]++;
					}
					else{
						break;
					}
    			}
    		}
    		//get the largest size for each histogram
	    	int size=largestRectangleArea(tmp);
	    	
	    	//update values
	    	if(size>largestSize){
	    		largestSize=size;
	    	}	
    	}
    	return largestSize;
    }
    
    public static int largestRectangleArea(int[] height) {
        // write your code here
    	Stack<Integer> h= new Stack<Integer>();
    	Stack<Integer> indexes= new Stack<Integer>();
    	int largestSize=0;
    	for(int i=0;i<height.length;i++){
    		if(h.isEmpty() || height[i]>h.peek()){
    			h.push(height[i]);
    			indexes.push(i);
    			    			
    		}
    		else if(height[i]<h.peek()){
    			int lastIndex=0;
    			while(!h.isEmpty() && height[i]<h.peek()){
    				lastIndex=indexes.pop();
    				int tempAreaSize=h.pop()*(i-lastIndex);
    				if(tempAreaSize>largestSize){
    					largestSize=tempAreaSize;
    				}
    			}
    			h.push(height[i]);
    			indexes.push(lastIndex);		
    		}
    	}
    	while(!h.isEmpty()){
    		int tmpAreaSize=h.pop()*(height.length-indexes.pop());
    		if(tmpAreaSize>largestSize){
				largestSize=tmpAreaSize;    			
    		}
    	}
    	return largestSize;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] matrix={};
		System.out.println(maximalRectangle(matrix));
	}

}
