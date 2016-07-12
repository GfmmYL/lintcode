package solution381;

public class solution {
    public static int[][] generateMatrix(int n) {
        // Write your code here  
    	int[][] result= new int[n][n];
    	if(n<=0) return result;

    	int l=0,r=result[0].length;
    	int u=0,d=result.length;
    	int i=1;
    	while(i<=n*n){
        	for(int j=l;j<r;j++){
        		result[u][j]=i;
        		i++;
        	}
        	if(i>n*n) break;
        	for(int k=u+1;k<d;k++){
        		result[k][r-1]=i;
        		i++;
        	}
        	if(i>n*n) break;
        	u++;r--;
        	for(int m=r-1;m>=l;m--){
        		result[d-1][m]=i;
        		i++;
        	}
        	if(i>n*n) break;
        	for(int v=d-2;v>=u;v--){
        		result[v][l]=i;
        		i++;
        	}
        	if(i>n*n) break;
        	d--;l++;    		
    	}
    	return result;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateMatrix(3));
	}

}
