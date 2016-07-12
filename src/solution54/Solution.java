package solution54;

public class Solution {
	
    public static int atoi(String str) {
        // write your code here
    	if(str==null) return 0;
    	int len=str.length();
    	if(len==0) return 0;
    	double result=0;
    	boolean flag_negative=false;
    	int start=0;
    	if(str.charAt(0)=='-'){
    		flag_negative=true;
    		start++;
    	}
    	else if(str.charAt(0)=='+'){
    		start++;
    	} 
    	else if(str.charAt(0)=='0'){
    		return 0;
    	}
    	for(int i=start;i<len;i++){  		
    		if(str.charAt(i)>='0' && str.charAt(i)<='9'){
    			result=10*result+str.charAt(i)-'0';
    		}
    		else if(str.charAt(i)=='.'){
    			break;
    		}
    		else{
    			return 0;
    		}
    	}
    	if(flag_negative==true){
    		result=0-result;
    	}
    	if(result>Integer.MAX_VALUE){
    		return Integer.MAX_VALUE;
    	}
    	if(result<Integer.MIN_VALUE){
    		return Integer.MIN_VALUE;
    	}
    	return (int)result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123123123123123";
		System.out.println(atoi(str));
	}

}
