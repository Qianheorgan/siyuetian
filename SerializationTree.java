 //序列化二叉树

public class SerializationTree {
    private int index=-1;
    String Serialize(TreeNode root) {
        if(root == null){
            return "";
        }
        StringBuffer s=new StringBuffer();
        First(root,s) ;
        return s.toString();
    }
    void First(TreeNode root, StringBuffer s){
        TreeNode cur=root;
        if(cur==null){
            return;
        }
        s.append(cur.val).append("!");
        if(cur.left==null){
            s.append("#!");

        }else{
            First(cur.left,s);
        }
        if(cur.right==null){
            s.append("#!");
        }else{
            First(cur.right,s);
        }

    }
    TreeNode Deserialize(String str) {
        if(str == null || str ==""){
            return null;
        }
        String[] s=str.split("!");
        return Get(s);

    }
    TreeNode Get(String []s){
        index++;
        if(!s[index].equals("#")){
            TreeNode node=new TreeNode(Integer.parseInt(s[index]));
            node.left=Get(s);
            node.right=Get(s);
            return node;
        }
        return null;
    }
}