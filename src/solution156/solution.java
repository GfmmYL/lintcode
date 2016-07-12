package solution156;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class solution {

    public static List<Interval> merge(List<Interval> intervals){
        // write your code here
    	ArrayList<Interval> result = new ArrayList<Interval>();
        Comparator<Interval> comp = new Comparator<Interval>()  
        {  
            @Override  
            public int compare(Interval i1, Interval i2)  
            {  
                if(i1.start==i2.start)  
                    return i1.end-i2.end;  
                return i1.start-i2.start;  
            }  
        };  
        Collections.sort(intervals,comp);  
        Interval cur=intervals.get(0);
    	for(int i=1;i<intervals.size();i++){
    		Interval newInterval=intervals.get(i);
    		if(newInterval.start>cur.end){
    			Interval tmp=new Interval(cur.start,cur.end);
    			result.add(tmp);
    			cur.start=newInterval.start;
    			cur.end=newInterval.end;
    		}
    		else{
    			cur.start=Math.min(cur.start, newInterval.start);
       			cur.end=Math.max(cur.end, newInterval.end);
    		}
    	}
    	result.add(cur);
    	return result;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Interval> num = new ArrayList<Interval>();
		Interval num1=new Interval(2,3);
		Interval num2=new Interval(2,2);
		Interval num3=new Interval(3,3);
		Interval num4=new Interval(1,3);
		Interval num5=new Interval(5,7);
		Interval num6=new Interval(4,6);
		num.add(num1);
		num.add(num2);
		num.add(num3);
		num.add(num4);
		num.add(num5);
		num.add(num2);
		num.add(num6);
		System.out.println(merge(num));
	}

}
