package solution122;

import java.util.Stack;

public class solution {
	
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
		int[] height={2,4,2,1};
		System.out.println(largestRectangleArea(height));
	}

}
