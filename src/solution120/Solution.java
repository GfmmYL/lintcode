package solution120;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Solution {

    public static int ladderLength(String start, String end, Set<String> dict) {
        // write your code here
    	if(start.length()!=end.length()) return 0;
    	if(start.length()==0 || end.length()==0) return 0;
    	if(Arrays.equals(start.toCharArray(),end.toCharArray())) return 1;
    	LinkedList<String> queue=new LinkedList<String>();
    	LinkedList<Integer> count=new LinkedList<Integer>();
    	queue.add(start);
    	count.add(1);
    	while(!queue.isEmpty()){
    		char[] element=queue.poll().toCharArray();
    		int layercount=count.poll()+1;
    		for(int i=0;i<element.length;i++){
    			char[] tmp=element.clone();
    			for(char c='a';c<='z';c++){
    				tmp[i]=c;
    				if(Arrays.equals(tmp,end.toCharArray())){
    					return layercount;
    				}
    				if(dict.contains(String.valueOf(tmp))){
    					queue.add(String.valueOf(tmp));
    					count.add(layercount);
    					dict.remove(String.valueOf(tmp));
    				}

    			}
    		}
    	}
    	return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String start="hit";
		String end="cog";
		Set<String> dict=new HashSet<String>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		System.out.println(ladderLength(start,end,dict));
	}

}
