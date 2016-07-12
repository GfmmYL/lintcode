package solution515;

public class Solution {

    public static int minCost(int[][] costs) {
        // Write your code here
    	if(costs.length==0 || costs[0].length==0) return 0;
    	int R=0,G=0,B=0;
    	for(int i=0;i<costs.length;i++){
    		int tmp_R=R,tmp_G=G,tmp_B=B; 		
    		R=costs[i][0]+Math.min(tmp_G, tmp_B);
    		G=costs[i][1]+Math.min(tmp_R, tmp_B);
    		B=costs[i][2]+Math.min(tmp_R, tmp_G);
    	}
    	return Math.min(R, Math.min(G, B));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] costs={{14,2,11},{11,14,5},{14,3,10}};
		System.out.println(minCost(costs));
	}

}
