import java.util.ArrayList;

class TreeNode3 {
    int val = 0;
    TreeNode3 left = null;
    TreeNode3 right = null;

    public TreeNode3(int val) {
        this.val = val;

    }

}

public class SmallTreeNode{


        ArrayList<TreeNode3> list = new ArrayList<>();
         TreeNode3 KthNode(TreeNode3 pRoot, int k)    {
             addNode(pRoot);
             if(k>=1 && list.size()>=k) {
                 return list.get(k-1);
             }
             return null;
         }
         // 中序遍历
     void addNode(TreeNode3 cur) {
                   if(cur != null) {
                       addNode(cur.left);
                       list.add(cur);
                       addNode(cur.right);
                   }
         }
}



