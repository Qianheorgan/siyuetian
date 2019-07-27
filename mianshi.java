
 class Node {
    int val;
    Node next = null;
    Node(int val) {
        this.val = val;
    }
}

public class mianshi{
	public static void main(String[] args){
		Node n1=new Node(1);
		Node n2=new Node(1);
		Node n3=new Node(1);
		Node n4=new Node(1);
		Node n5=new Node(1);
		 n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;
		 print(n1);
	}
	 private static void print(Node head) {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur + " ");
        }
        System.out.println();
    }
	 //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
	private static Node remove (Node head){
		Node prev=null;
		Node  cur=head;
		Node result=head.next;
		while(result!=null){
			if(cur.val!=result.val){
				 prev=cur;
				 cur=result;
				 result=result.next;
			}
			else{
				while(result!=null){
					if(result.val==cur.val){
					result=result.next;}
				}
				if(prev==null){
					head=result;
				}
				else{
					prev.next=result;
				}
				cur=result;
				if(result!=null){
					result=result.next;
				}
			}
		}
		return head;
	}
	 
		
	}


 