import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


class TreeNode2 {
    int val = 0;
    TreeNode2 left = null;
    TreeNode2 right = null;

    public TreeNode2(int val) {
        this.val = val;

    }

}

public class PrintTree{

    public ArrayList<ArrayList<Integer>> Print(TreeNode2 pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode2> list = new LinkedList<>();
        // 存储节点，每次一层
        if(pRoot != null) list.add(pRoot);
        boolean flag = true;
        // true 从左到右
            while (!list.isEmpty()) {
                int size = list.size();
                ArrayList<Integer> layer = new ArrayList<>();
                if (flag)
                    for (int i = 0; i < size; i++) layer.add(list.get(i).val);
                else
                    for (int i = size - 1; i >= 0; i--) layer.add(list.get(i).val);
                flag = !flag;
                res.add(layer);
                for (int i = 0; i < size; i++) {
                    TreeNode2 node = list.poll();
                    if (node.left != null) list.add(node.left);
                    if (node.right != null) list.add(node.right);
                }
            }
            return res;
    }

}