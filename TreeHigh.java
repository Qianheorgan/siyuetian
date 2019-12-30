 class TreeNode1 {
 int val = 0;
 TreeNode1 left = null;
 TreeNode1 right = null;

 public TreeNode1(int val) {
 this.val = val;

 }

 }

public class TreeHigh{
    public int TreeDepth(TreeNode1 root) {
         if(root==null){
             return 0;
         }
         int left=TreeDepth(root.left);
         int right=TreeDepth(root.right);
         return Math.max(left,right)+1;
    }
}