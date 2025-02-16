package leetcodetest;

public class q226 {
	//Invert a BST 
	
//	public TreeNode invertTree(TreeNode root) {
//        invertTreeHelper(root);
//        return root;
//    }
//
//    public void invertTreeHelper(TreeNode root){
//        if(root == null){
//            return;
//        }
//        TreeNode clone = root.left;
//        root.left = root.right;
//        root.right = clone;
//        invertTreeHelper(root.left);
//        invertTreeHelper(root.right);
//    }
	
	//Below is the solution to inverting a BST 
//	public TreeNode invertTree(TreeNode root) {
//        //Call the helper function for recursion purpses
//        invertTreeHelper(root);
//        //Return root as its still the pointer for the head
//        return root;
//    }
//
//    public void invertTreeHelper(TreeNode root){
//        //If root == null then its the end of the tree so just exit the function
//        if(root == null){
//            return;
//        }
//        //Clone the right
//        TreeNode clone = root.left;
//        //Make the left equal to right.
//        root.left = root.right;
//        //Make the right equal to the clone of left.
//        root.right = clone;
//        //Call recursion on the left and right of root.
//        invertTreeHelper(root.left);
//        invertTreeHelper(root.right);
//    }
}
