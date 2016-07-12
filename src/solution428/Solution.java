package solution428;

public class Solution {

    public static double myPow(double x, int n) {
        // Write your code here
    	if(x==0) return (double)0;
    	double result=1;
    	if(n==0){
    		return (double)1;
    	}
    	else if(n<0){
    		boolean neg=true;
    		result=calPow(x,-n);
    		return 1/result;
    	}
    	else{
    		boolean neg=false;
    		result=calPow(x,n);
    		return result;
    	}
    }
    public static double calPow(double x, int n){
    	double result=1;
    	if((int)n/2!=0){
    		double tmp_result=myPow(x,(int)n/2);
    		result=result*tmp_result*tmp_result;
    	}
    	if(n%2!=0){
    		result=result*x;
    	}
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myPow((double)2.1,-3));
	}

}
