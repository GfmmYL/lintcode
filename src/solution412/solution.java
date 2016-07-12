package solution412;

public class solution {
	
    public static int candy(int[] ratings) {
        // Write your code here
    	if(ratings==null) return 0;
        if(ratings.length==0) return 0;
        if(ratings.length==1) return 1;
        int len=ratings.length;
        int[] total=new int[len];
        for(int i=0;i<len;i++){
        	total[i]=1;
        }        
        int sum=0;
        for(int i=1;i<len;i++){
        	if(ratings[i-1]<ratings[i]){
        		total[i]=Math.max(total[i], total[i-1]+1);
        	}
        }
        for(int i=len-2;i>=0;i--){
        	if(ratings[i]>ratings[i+1]){
        		total[i]=Math.max(total[i], total[i+1]+1);
        	}
        }
        for(int i=0;i<len;i++){
        	sum=sum+total[i];
        }
        return sum;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ratings={1, 2};
		System.out.println(candy(ratings));
	}

}
