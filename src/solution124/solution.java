package solution124;

import java.util.Arrays;

public class solution {
    public static int longestConsecutive(int[] num) {
        // write you code here
    	Arrays.sort(num);
    	int len=num.length;
    	if(len<=0) return 0;
    	int count=1;
    	int max=1;
    	for(int i=1;i<len;i++){
    		if(num[i]-num[i-1]==1){
    			count++;
    		}
    		else{
    			count=1;
    		}
    		if(count>max){
    			max=count;
    		}
    	}
    	return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={100, 4, 200, 1, 3, 2};
		System.out.println(longestConsecutive(num));
	}

}
