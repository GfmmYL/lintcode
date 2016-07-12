package Solution69;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import java.util.Queue;

public class Solution {

	
    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
    	ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
    	if(root==null) return result;
    	Queue<TreeNode> treeQueue=new LinkedList<TreeNode>();
    	treeQueue.offer(root);
    	
    	while(!treeQueue.isEmpty()){
    		ArrayList<Integer> tmp=new ArrayList<Integer>();
    		int size=treeQueue.size();
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
    		ArrayList<Integer> tmp1 = new ArrayList<Integer>(Arrays.asList(new Integer[tmp.size()]));
    		Collections.copy(tmp1,tmp);
    		result.add(tmp1);
    		tmp.clear();
    	}
    	return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		System.out.println(levelOrder(root));
		
	}

}
