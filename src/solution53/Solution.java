package solution53;

public class Solution {

    public static String reverseWords(String s) {
        // write your code
    	String result=new String();
    	if(s==null) return result;
    	int len=s.length();
    	if(len==0) return result;
    	String tmp=new String();
    	for(int i=0;i<len;i++){
    		if(s.charAt(i)!=' '){
    			tmp=tmp+s.charAt(i);
    		}
    		else{
    			if(tmp!=""){
	    			result=tmp+' '+result;
	    			tmp="";
    			}
    		}
    	}
		if(tmp!=""){
			result=tmp+' '+result;
		}
    	return result.substring(0, result.length()-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="the sky is blue   ";
		System.out.println(reverseWords(str));
	
	}

}
