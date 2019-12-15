import java.util.ArrayList;
  class TreeNode1 {
 int val = 0;
 TreeNode1 left = null;
 TreeNode1 right = null;

 public TreeNode1(int val) {
 this.val = val;

 }

 }

public class TreeAdd {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode1 root,int target) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        if (root.left == null && root.right == null && root.val == target) {
            ArrayList<Integer> path = new ArrayList<>();
            path.add(root.val);
            res.add(path);
            return res;
        }
        ArrayList<ArrayList<Integer>> leftRes = FindPath(root.left, target - root.val);
        ArrayList<ArrayList<Integer>> rightRes = FindPath(root.right, target - root.val);
        addValToPath(leftRes, root.val);
        addValToPath(rightRes, root.val);
        // 保证数据长度长的排前面。用类似归并排序合并有序的思想，因为leftRes、rightRes已经有序
          int leftPoint = 0, rightPoint = 0;
          while (leftPoint != leftRes.size() && rightPoint != rightRes.size()) {
              if (leftRes.get(leftPoint).size() > rightRes.get(rightPoint).size())
                  res.add(leftRes.get(leftPoint++));
              else
                  res.add(rightRes.get(rightPoint++));
          }
          while (leftPoint < leftRes.size())
              res.add(leftRes.get(leftPoint++));
          while (rightPoint < rightRes.size())
              res.add(rightRes.get(rightPoint++));
          return res;
    }
    private void addValToPath(ArrayList<ArrayList<Integer>> res, int val) {
        for (ArrayList<Integer> path : res)
            path.add(0, val);   
    }
    }

