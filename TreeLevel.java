import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeLevel {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return  list;
        Queue<TreeNode > queue =new LinkedList<>()  ;
        queue.offer(root);
        while(!queue.isEmpty()){

             list.add(queue.poll().val);
            if(root.left!=null) queue.offer(root.left);
            if(root.right!=null) queue.offer(root.right);
        }
        return  list;
    }
}