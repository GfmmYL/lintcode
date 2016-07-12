package solution186;

import java.util.HashMap;

public class Solution {

    public static int maxPoints(Point[] points) {
        // Write your code here
    	
    	if(points==null || points.length==0) return 0;
    	
    	HashMap<Double,Integer> map=new HashMap<Double,Integer>();
    	int max=0;
    	
    	for(int i=0;i<points.length;i++){
    		int dup=1;
    		map.clear();
			for(int j=0;j<points.length;j++){
				
				if(i==j) continue;
				
				double detX=points[i].x-points[j].x;
				double detY=points[i].y-points[j].y;		
				if(detX==0 && detY==0){
					dup++;
				}
				else if(detX==0){
					if(map.containsKey((double)100000)){
						map.put((double)100000, map.get((double)100000)+1);
					}
					else{
						map.put((double)100000, 1);
					}
				}
				else{
					double tmp=detY/detX;
					if(map.containsKey(tmp)){
						map.put(tmp, map.get(tmp)+1);
					}
					else{
						map.put(tmp, 1);
					}	
				}
			}
			int count=0;
	    	for(int k:map.values()){
	    		count=Math.max(count,k);
	    	}
	    	max=Math.max(count+dup, max);
    	}
    	return max;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] points=new Point[21];
		points[0]=new Point(0,9);
		points[1]=new Point(138,429);
		points[2]=new Point(115,359);
		points[3]=new Point(115,359);
		points[4]=new Point(-30,-102);
		points[5]=new Point(230,709);
		points[6]=new Point(-150,-686);
		points[7]=new Point(-135,-613);
		points[8]=new Point(-60,-248);
		points[9]=new Point(-161,-481);
		points[10]=new Point(207,639);
		points[11]=new Point(23,79);
		points[12]=new Point(-230,-691);
		points[13]=new Point(-115,-341);
		points[14]=new Point(92,289);
		points[15]=new Point(60,336);
		points[16]=new Point(-105,-467);
		points[17]=new Point(135,701);
		points[18]=new Point(-90,-394);
		points[19]=new Point(-184,-551);
		points[20]=new Point(150,774);
	
		System.out.println(maxPoints(points));
	}

}
