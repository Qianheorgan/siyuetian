//快慢指针
public class K{
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode fast=head; ListNode slow=head;
        while(k-->0){
            if(fast!=null){
                fast=fast.next;
            }
            else{
                return null;
            }
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}