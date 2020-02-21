import java.util.*;
class ListNode{
    int m_nKey;
    ListNode m_pNext=null;
    ListNode(int m_nKey ){
        this.m_nKey=m_nKey;

    }
}
public class OnewayLinkeList{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ListNode a1=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(3);
        ListNode a4=new ListNode(4);
        ListNode a5=new ListNode(5);
        ListNode a6=new ListNode(6);
        ListNode a7=new ListNode(7);
        a1.m_pNext=a2;
        a2.m_pNext=a3;
        a3.m_pNext=a4;
        a4.m_pNext=a5;
        a5.m_pNext=a6;
        a6.m_pNext=a7;
        a7.m_pNext=null;
        int k=in.nextInt();
        int length1=GetLength(a1);
        Num(a1,length1,k);
    }
    public static int GetLength(ListNode a1){
        ListNode cur =a1;
        int length=0;
        while(cur!=null){
            length++;
            cur=cur.m_pNext;
        }
        return length;
    }
    public static void Num(ListNode a1,int length1,int k){
        ListNode cur1=a1;
        for(int i=0;i<length1-k;i++){
            cur1=cur1.m_pNext;
        }
        System.out.println(cur1.m_nKey);
    }
}