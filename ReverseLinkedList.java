 public class ReverseLinkedList {
    public ListNode ReverseList(ListNode head) {
        ListNode a=null;
        ListNode b=head;
        ListNode c=null;
        while(b!=null){
            c=b.next;
            b.next=a;
            a=b;
            b=c;
        }
        return a;
    }
}