  class ListNode1 {
    int val;
    ListNode1 next = null;

    ListNode1(int val) {
        this.val = val;
    }
}
public class DeleteLinkeList {

    public ListNode1 deleteDuplication(ListNode1 pHead) {
        if (pHead == null || pHead.next == null) {
            // 只有0个或1个节点
            return pHead;
        }
        if (pHead.val == pHead.next.val) {
            // 当前节点是重复节点
              ListNode1 node = pHead.next;
              while (node != null && node.val == pHead.val) {
                  // 跳过值与当前节点相同的全部节点，找到第一个与当前节点不同的节点
                     node = node.next;
              }
              return deleteDuplication(node);
              // 从第一个与当前结点不同的结点继续递归
               } else {
            pHead.next = deleteDuplication(pHead.next);
            // 保留当前节点，从下一个节点继续递归
               return pHead;
        }
    }
}
