package solution374;

import java.util.ArrayList;
import java.util.List;

public class solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
     // Write your code here
    List<Integer> result=new ArrayList<Integer>();   	
    if(matrix==null) return result;
    int d=matrix.length;
    if(d<=0) return result;
    int r=matrix[0].length;
    if(r<=0 ) return result;

    int l=0,u=0;
    int i=0;
    while(i<matrix.length*matrix[0].length){
    	for(int j=l;j<r;j++){
    		result.add(matrix[u][j]);
    		i++;
    	}
    	if(i==matrix.length*matrix[0].length) break;
    	for(int k=u+1;k<d;k++){
    		result.add(matrix[k][r-1]);
    		i++;
    	}
    	if(i==matrix.length*matrix[0].length) break;
    	u++;r--;
    	for(int m=r-1;m>=l;m--){
    		result.add(matrix[d-1][m]);
    		i++;
    	}
    	if(i==matrix.length*matrix[0].length) break;
    	for(int n=d-2;n>=u;n--){
    		result.add(matrix[n][l]);
    		i++;
    	}
    	if(i==matrix.length*matrix[0].length) break;
    	d--;l++;
    }
    return result;	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix=new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};
		System.out.println(spiralOrder(matrix));
		
	}

}
