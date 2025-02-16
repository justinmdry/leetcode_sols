package leetcodetest;

public class q100 {
	
	
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
	        //If both are null return true ( breaks recursion)
	        if(q == null && p == null){
	            return true;
	        }else if( q == null && p != null){
	            //If one is null and the other is not then return false as there not 
	            //The same tree 
	            return false;
	        }else if ( q != null && p == null){
	        	//Same logic as the one above 
	            return false;
	        }

	        if(q.val == p.val && isSameTree(p.right, q.right) && isSameTree(p.left, q.left)){
	        	//Then check if the vals are the same and check recursively the rest of the tree
	        	//If everything is true then return true
	            return true;
	        }else{
	            return false;
	        }
	    }
}
