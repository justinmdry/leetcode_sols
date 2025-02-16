package leetcodetest;

public class q101 {
	public static void main(String args[]) {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
		System.out.println(isSymmetric(root));
	}
	
	public static boolean isSymmetric(TreeNode root) {
		//Edge case for an empty tree
        if(root.left != null && root.right != null){
        	
            if(root.left.val == root.right.val){
            	//If the first two children are the same then call the helper function to start recursion
            return(isSymmetricHelper(root.left, root.right));
            }else {
            	//Otherwise return false as the tree already is not symmetrical
            	return false;
            }
        }else if(root.left == null && root.right == null && root.val != 0){
        	//Edge case for a one node tree
            return true;
        }else{
        	//Otherwise return false as its an empty tree so it cant be symmetrical
            return false;
        }
        
    }
	
	public static boolean isSymmetricHelper(TreeNode q, TreeNode p){
        //If both are null return true ( you've hit the end of the tree)
	        if(q == null && p == null){
	            return true;
	        }else if( q == null && p != null){
	            //If one is null and the other is not then return false as there not 
	            //a symmetrical tree 
	            return false;
	        }else if ( q != null && p == null){
	        	//Same logic as the one above 
	            return false;
	        }

	        if(q.val == p.val && isSymmetricHelper(p.left, q.right) && isSymmetricHelper(p.right, q.left)){
	        	//Then check if the vals are the same and check recursively the rest of the tree
	        	//If everything is symmetrical (ie the p.left's = q.rights and vice versa for the other children
	        	//If this is the case then return true.
	            return true;
	        }else{
	        	//Otherwise return false 
	            return false;
	        }
    }
}


