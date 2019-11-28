public class LinkedListSplit {

//链表分割

     class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

        public ListNode partition(ListNode pHead, int x) {
            ListNode small=new ListNode(0);
            ListNode big=new ListNode(0);
            ListNode a=small;
            ListNode b=big;
            ListNode cur=pHead;
            while(cur!=null){
                if(cur.val<x){
                    a.next=new ListNode(cur.val);
                    a=a.next;
                }
                else{
                    b.next=new ListNode(cur.val);
                    b=b.next;
                }
                cur=cur.next;
            }
            ListNode c=small;
            while(c.next!=null&&c.next.val!=-1){
                c=c.next;
            }
            c.next=big.next;
            return small.next;
        }
    }

