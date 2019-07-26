public class Node {
    public static  void main(String[] args){
        Node1 head=null;
        head=pushFront(head,1);
        head=pushFront(head,2);
        head=pushFront(head,3);
        head=pushFront(head,4);
        head=pushFront(head,5);
        print(head);
       Node1 head1=pushBack(head, 0);
        print(head1);
       Node1 head2=pushFront(head,6);
        print(head2);
        head=merge(head1,head2);
       print(head);
        segmentation (head, 4);
        print(head);
        //head=reverse( head);
        //print(head);
        // Node1 node1=found(head,3);
        //Node1 node= middleNode( head);
      // System.out.println(node1);
    }
    //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    private static Node1 segmentation (Node1 head,int k){
        Node1 cur=head;
        Node1 result=null;
        Node1 last=null;
		Node1 result1=null;
        Node1 last1=null;
        while(cur!=null){
             
            if(cur.val<k){
                if (result==null){
                    result=cur;  
                }
                else{
                    last.next=cur;
                }
				last=cur;
                 
            }
                else{
                    if (result1==null){
                    result1=cur;

                }
                else{
                    last1.next=cur;

                }
                last1=cur;
            }
			cur=cur.next;
		}
			if (result == null) {
            return result1;
        } else {
            last.next = result1;
            if (last1 != null) {
              last1.next = null;
            }
			return result;
        }
        
    }
//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
private static Node1 merge(Node1 head1,Node1 head2){
Node1 cur1=head1;
Node1 cur2=head2;
Node1 result=null;
Node1 last=null;
if(cur1==null){return cur2;}
if(cur2==null){return cur1;}
while(cur1!=null&&cur2!=null) {
    
    if (cur1.val > cur2.val) {
		Node1 next1 = cur1.next;
        if (result == null) {
            result = cur1;

        } else {
            last.next = cur1;

        }
        last = cur1;
        cur1 = next1;
    } else {
        Node1 next = cur2.next;

        if (result == null) {
            result = cur2;
        } else {
            last.next = cur2;
        }
        last = cur2;
        cur2 = next;
    }
     

}
return result;
}

    private  static  Node1 found1(Node1 head,int k){
        Node1 cur=head;
        for(int i=0;i<k;i++){
            if(cur==null){
                return null;
            }
            cur=cur.next;
        }
        return cur;
    }
    //输出该链表中倒数第k个结点
    private static Node1 found(Node1 head,int k){
        Node1 list=found1(head,k);
        Node1 cur1=head;
        if(list==null){
            return head;
        }else{
            while(list!=null){
                list=list.next;
                cur1=cur1.next;
            }
        }
        return cur1;
    }
    private static int getLength(Node1 head) {
        int len = 0;
        for (Node1 cur = head; cur != null; cur = cur.next) {
            len++;
        }

        return len;
    }
    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点
    public  static Node1  middleNode(Node1 head) {
        int len = getLength(head);
        int midLen = len / 2;
        Node1 node = head;
        for (int i = 0; i < midLen; i++) {
            node = node.next;
        }

        return node;
    }
    //反转一个链表
     private static Node1 reverse(Node1 head){
        Node1 result=null;
        Node1 cur=head;

        while(cur!=null) {
            Node1 next = cur.next;
            cur.next=result;
            result=cur;
            cur=next;

    }return result;
    }
    //打印链表
    private static void print(Node1 head) {
        System.out.println("打印链表：");
        for (Node1 cur = head; cur != null; cur = cur.next) {
            System.out.print(cur + " --> ");
        }
        System.out.println("null");
    }
//头插
        private static  Node1 pushFront(Node1 head,int val){
        Node1 node=new Node1(val);
        node.next=head;
        return node;
}
//尾插
private static Node1 pushBack(Node1 head,int val){
        Node1 node = new Node1(val);
        if(head==null){
            return node;
        }
        else{
            Node1 last=head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=node;
            return head;


        }
}
 }
 class Node1{
    int val;
    Node1 next;
     Node1(int val){
        this.val=val;
        this.next=next;
    }
    public String toString(){
         return String.format("Node1(%d)",val);
    }
}