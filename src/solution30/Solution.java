package solution30;

import java.util.ArrayList;


public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        // write your code here
        int i=0;
        int count=0;
        boolean flag=true;
        while(i<intervals.size()){
        	Interval current=intervals.get(i);
        	if(current.start>newInterval.end){
        		result.add(newInterval);
        		flag=false;
        		i+=2;
        	}
        	else if(current.end<newInterval.start){
        		result.add(current);
        		i++;
        		count++;
        	}
        	else{
        		newInterval.start=Math.min(current.start,newInterval.start);
        		newInterval.end=Math.max(current.end,newInterval.end);
        		i++;
        		count++;
        	}
        }
        for(int k=count;k<intervals.size();k++){
        	result.add(intervals.get(k));
        }
        if(flag){
        	result.add(newInterval);
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Interval interval=new Interval();
		
	}

}
