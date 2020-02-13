
   class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

public class TreeDepthMin {

    public int run(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left  = run(root.left);
        int right  = run(root.right);
        if(left*right >0){
            return (left>right?right:left)+1;
        }else{
            return (left>right?left:right)+1;
        }
    }
}