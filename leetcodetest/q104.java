package leetcodetest;

public class q104 {

		public static int maxDepth(TreeNode root) {
			  /*
	        if root is null then return 0
	        otherwise return 1 + the recursive call of root.left, or root .right 
	        and take the max of that as its the further depth
	        */
	        return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
		}
}


