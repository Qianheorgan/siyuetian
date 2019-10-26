public class z1022{
    class Node{
        int val;
        Node next=null;
        Node(int val){
            this.val=val;

        }    }
        public static Node reverseList(Node head){
        Node result=null;
        Node cur=head;
        while(cur!=null){
            cur.next=result;
            result=cur;
            cur=cur.next;
        }
        return result;
        }
    public static void main(String[] args) {

    }

}