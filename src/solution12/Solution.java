package solution12;

import java.util.Stack;

public class Solution {
	Stack<Integer> s;
	Stack<Integer> trackMin;    
    public Solution() {
        // do initialize if necessary
    	s = new Stack<Integer>();
    	trackMin=new Stack<Integer>();
    }
    public void push(int number) {
        // write your code here
    	s.push(number);
    	if(trackMin.isEmpty() || trackMin.peek()>number){
    		trackMin.push(number);
    	}
    	else{
    		trackMin.push(trackMin.peek());
    	}
    }

    public int pop() {
        // write your code here
    	trackMin.pop();
    	int result=s.pop();
    	return result;
    }

    public int min() {
        // write your code here
    	return trackMin.peek();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		sol.push(1);
		System.out.println(sol.pop());
		sol.push(2);
		sol.push(3);
		System.out.println(sol.min());
		sol.push(1);
		System.out.println(sol.min());
	}

}
