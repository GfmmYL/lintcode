package solution88;

import Solution69.TreeNode;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        // write your code here
    	if (root == null || root == A || root == B) {
            return root;
        }
    	
        // Divide
        TreeNode left = lowestCommonAncestor(root.left, A, B);
        TreeNode right = lowestCommonAncestor(root.right, A, B);
        
        // Conquer
        if (left != null && right != null) {
            return root;
        } 
        if (left != null) {
            return left;
        }
        if (right != null) {
            return right;
        }
        return null;
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(-2);
		root.right=new TreeNode(1);
		root.right.right=new TreeNode(3);
//		System.out.println(root,root.right,root.right.right);
		
	}

}
