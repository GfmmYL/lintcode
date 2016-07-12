package solution71;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Solution69.TreeNode;

public class Solution {

    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
    	ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
    	if(root==null) return result;
    	Queue<TreeNode> treeQueue=new LinkedList<TreeNode>();
    	treeQueue.offer(root);
    	int count=0;
    	while(!treeQueue.isEmpty()){
    		ArrayList<Integer> tmp=new ArrayList<Integer>();
    		int size=treeQueue.size();
    		if(count%2==0){    		
	    		for(int i=0;i<size;i++){
	    			TreeNode tmpNode=treeQueue.poll();
	    			tmp.add(tmpNode.val);
	    			if(tmpNode.left!=null){
	    				treeQueue.add(tmpNode.left); 				
	    			}
	    			if(tmpNode.right!=null){
	    				treeQueue.add(tmpNode.right);
	    			}
	    		}
    		}
    		else{
    			Stack<Integer> treeTmp=new Stack<Integer>();
	    		for(int i=0;i<size;i++){
	    			TreeNode tmpNode=treeQueue.poll();
	    			treeTmp.push(tmpNode.val);
	    			if(tmpNode.left!=null){
	    				treeQueue.add(tmpNode.left); 				
	    			}
	    			if(tmpNode.right!=null){
	    				treeQueue.add(tmpNode.right);
	    			}
	    		}
	    		for(int i=0;i<size;i++){
	    			tmp.add(treeTmp.pop());
	    		}
    		}
    		ArrayList<Integer> tmp1 = new ArrayList<Integer>(Arrays.asList(new Integer[tmp.size()]));
    		Collections.copy(tmp1,tmp);
    		result.add(tmp1);
    		tmp.clear();
    		count++;
    	}
    	return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		System.out.println(zigzagLevelOrder(root));

	}

}
