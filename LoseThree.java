 

public class LoseThree {  
  public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);     
   int[] nums = new int[10000];    
   for (int i = 1; i <= 9997; i++) {         
   nums[sc.nextInt() - 1] = 1;    
    }      
  StringBuffer buf = new StringBuffer();    
    for (int i = 0; i < nums.length; i++) {    
        if (nums[i] = 0) {         
       buf.append(i + 1);          
  }    
    }      
  long res = Long.parseLong(buf.toString());     
   System.out.println(res % 7); 
   }
}