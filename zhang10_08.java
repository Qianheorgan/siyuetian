public class zhang10_08
{


     public static class Node {
         String name;
         String phone;
         Node left;
         Node right;
     }
     private Node root=null;
     public boolean insert(String name,String phone)
     {
         Node cur=root;
         while(cur!=null){
             int a=name.compareTo(cur.name);
             if(a==0){
                 return true;
             }
             else if(a<0){
                 cur=cur.left;
             }
             else{
                 cur=cur.right;
             }

         }
         return false;
     }
}
