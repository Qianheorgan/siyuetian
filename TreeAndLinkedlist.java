import java.util.ArrayList;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class TreeAndLinkedlist {
    public TreeNode Convert(TreeNode pRootOfTree) {
        ArrayList<TreeNode> list=new ArrayList<>();
        zhang(pRootOfTree,list);
        return chao(list);

    }
    public void zhang(TreeNode pRootOfTree,ArrayList<TreeNode> list){
        if(pRootOfTree.left!=null){
        zhang(pRootOfTree.left,list);}
        list.add(pRootOfTree);
        if(pRootOfTree.right!=null){
            zhang(pRootOfTree.right,list);
        }
    }
    public   TreeNode chao(ArrayList<TreeNode> list){
     for(int i=0;i<list.size();i++){
         list.get(i).right=list.get(i+1);
         list.get(i+1).left=list.get(i);
     }
     return list.get(0);
    }
}

/*
        TreeNode pre=null;
public TreeNode Convert(TreeNode pRootOfTree) {
    if(pRootOfTree==null)
        return null;
    Convert(pRootOfTree.right);
    if(pre==null)
        pre=pRootOfTree;
    else{
        pRootOfTree.right=pre;
        pre.left=pRootOfTree;
        pre=pRootOfTree;
    }
    Convert(pRootOfTree.left);
    return pre;
}
*/