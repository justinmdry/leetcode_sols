package leetcodetest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//Shits chalked, come back to it later.
public class q105 {
	public static void main(String args[]) {
		int[] po = {3,9,20,15,7};
		int[] io = {9,3,15,20,7};
		
		TreeNode test = buildTree(po, io);
		
		printTree(test);
	}
	
	public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 1){
            return new TreeNode(preorder[0]);
        }
        
        int idx = 0 ;
        for( ; idx <= inorder.length ; idx ++){
            if(inorder[idx] == preorder[0]){
                break;
            }
        }

        TreeNode rtn = new TreeNode(preorder[0],buildTreeHelper(preorder, inorder, 1, idx), buildTreeHelper(preorder, inorder, idx+1, preorder.length));
        
        return rtn;
    }

    public static TreeNode buildTreeHelper(int[] po, int[] io, int i, int k){
        if(i >= io.length){
            return null;
        }else if(i == k) {
        	return new TreeNode(po[i]);
        }

        
        //If working right subtree of root
        if(k == io.length){
        	return new TreeNode(po[i],buildTreeHelper(po, io, i+1, k),buildTreeHelper(po, io, i+2, k));
        }else{
        	//If working left subtree off root
        	return new TreeNode(po[i],buildTreeHelper(po, io, i+1, k),buildTreeHelper(po, io, i+2, k));
        }


    }
    
    public static void printTree(TreeNode tmpRoot) {

        Queue<TreeNode> currentLevel = new LinkedList<TreeNode>();
        Queue<TreeNode> nextLevel = new LinkedList<TreeNode>();

        currentLevel.add(tmpRoot);

        while (!currentLevel.isEmpty()) {
            Iterator<TreeNode> iter = currentLevel.iterator();
            while (iter.hasNext()) {
                TreeNode currentNode = iter.next();
                if (currentNode.left != null) {
                    nextLevel.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    nextLevel.add(currentNode.right);
                }
                System.out.print(currentNode.val + " ");
            }
            System.out.println();
            currentLevel = nextLevel;
            nextLevel = new LinkedList<TreeNode>();

        }

    }
    
    
}
