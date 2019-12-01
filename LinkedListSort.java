//合并两个有序链表
//class ListNode {
//   int val;
//   ListNode next = null;
//
//   ListNode(int val) {
//       this.val = val;
//   }
//}
public class LinkedListSort {


        public ListNode Merge(ListNode list1,ListNode list2) {
            ListNode a=list1;
            ListNode b=list2;
            ListNode c=new ListNode(-1);
            ListNode d=c;
            while(a!=null&&b!=null){
                if(a.val<b.val){
                    d.next=a;
                    a=a.next;
                }
                else {
                    d.next=b;
                    b=b.next;
                }
                d=d.next;
            }
              if(a!=null){
                d.next=a;
              }
              if(b!=null){
                d.next=b;
              }
              return c.next;
        }
    }
