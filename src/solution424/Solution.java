package solution424;

import java.util.Stack;

public class Solution {
	
    public static int evalRPN(String[] tokens) {
        // Write your code here
    	int length=tokens.length;
    	if(length==0) return 0;
    	Stack<String> stack=new Stack<String>();
    	for(int i=0;i<length;i++){
    		if(tokens[i] =="+"){
    			int a=Integer.valueOf(stack.pop());
    			int b=Integer.valueOf(stack.pop());
    			stack.push(String.valueOf(a+b));
    		}
    		else if(tokens[i] =="-"){
    			int a=Integer.valueOf(stack.pop());
    			int b=Integer.valueOf(stack.pop());
    			stack.push(String.valueOf(b-a));
    		}
    		else if(tokens[i] =="*"){
    			int a=Integer.valueOf(stack.pop());
    			int b=Integer.valueOf(stack.pop());
    			stack.push(String.valueOf(a*b));
    		}
    		else if(tokens[i] =="/"){
    			int a=Integer.valueOf(stack.pop());
    			int b=Integer.valueOf(stack.pop());
    			stack.push(String.valueOf(b/a));
    		}
    		else{
    			stack.push(tokens[i]);
    		}
    	}
    	return Integer.valueOf(stack.pop());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens={"0","3","/"};
		System.out.println(evalRPN(tokens));
	}

}
