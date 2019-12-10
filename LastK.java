 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class LastK {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k ==0 ){
            return null;
        }
        ListNode a=head;
        ListNode b=head;
        for(int i=0;i<k;i++){
            if(a==null){
                return null;
            }
            a=a.next;
        }
        while(a!=null){
            a=a.next;
            b=b.next;
        }
        return b;
    }
}