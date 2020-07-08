 
public class UserLike{   
       public static void main(String args[]){      
   Scanner sc=new Scanner(System.in);  
       int n=sc.nextInt();    
     sc.nextLine();      
   int[] sn=new int[n];   
      Map<Integer, ArrayList<Integer>> map=new HashMap<Integer, ArrayList<Integer>>();   
      for(int i=0;i<n;i++){      
       //得到的数组处理一下       
      sn[i]=sc.nextInt();       
      if(map.containsKey(sn[i])){  
              ArrayList<Integer> alist=map.get(sn[i]);     
            alist.add(i);              
   map.put(sn[i],alist);           
  }            
 else{         
        ArrayList<Integer> alist=new ArrayList<Integer>();       
         alist.add(i);    
             map.put(sn[i],alist);     
        }     
    }   
      //         sc.nextLine();   
      int q=sc.nextInt();       
  for(int i=0;i<q;i++){
 //对每个query求取        
     sc.nextLine();         
    int l=sc.nextInt()-1;    
         int r=sc.nextInt()-1;  
           int k=sc.nextInt();      
       if(!map.containsKey(k)){   
              System.out.println(0); 
                continue;    
         }           
  ArrayList<Integer> alist=map.get(k);     
        int size=alist.size();    
         int ll=0;     
        int rr=size-1;    
         if((alist.get(rr)<l) || (alist.get(ll)>r)){//区间完全不覆盖，则排除      
           System.out.println(0);       
          continue;        
     }             
 else{              
   while(alist.get(ll)<l)      
               ll++;         
        while(alist.get(rr)>r)      
               rr--;    
         }             
System.out.println(rr-ll+1);    
     }     
}    
  }