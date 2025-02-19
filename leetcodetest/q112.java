package leetcodetest;

public class q112 {
	//q112 
	/*
	 * Given the root of a binary tree and an integer targetSum, 
	 * return true if the tree has a root-to-leaf path such that 
	 * adding up all the values along the path equals targetSum.
	 */
	
	public boolean hasPathSum(TreeNode root, int targetSum) {
        //If root is null then return false as either the initial tree is empty
        //or your out of the tree
        if(root == null){
            return false;
        }
        //Otherwise if you've hit a leaf 
        if(root.left == null && root.right == null){
            //if target sum - root.val = 0 then return true as the target 
            //sum can be reached
            return targetSum == root.val;
        }
        //Otherwise recursively call the function on its children
        //While reducing the current val from target sum 
        boolean leftSum = hasPathSum(root.left, targetSum - root.val);
        boolean rightSum = hasPathSum(root.right, targetSum-root.val);

        return leftSum || rightSum;
    }
}
