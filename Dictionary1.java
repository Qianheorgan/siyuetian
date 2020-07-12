 

import java.util.*; 
public class Dictionary {   
 public static void main(String[] args) {     
    Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt(),m=sc.nextInt(),k= sc.nextInt(); 
       List<List<Character>> result = new ArrayList<>();
       List<Character> tempResult = new ArrayList<>();    
    char[] input = new char[n+m];    
    boolean[] hasVisted = new boolean[m+n];      
  for(int i=0;i<n;i++){       
     input[i]='a';   
     }   
     for(int i=0;i<m;i++){   
         input[n+i]='z';   
     }        
backTracing(tempResult,result,hasVisted,input);       
  for(char c:result.get(k-1)){      
      System.out.print(c);      
  }    
 }     
private static void backTracing(List<Character> tempResult, List<List<Character>> result, boolean[] hasVisted, char[] input) {     
   if (tempResult.size()==input.length){     
       if(result.contains(tempResult)==false){     
           result.add(new ArrayList<Character>(tempResult));   
         }   
         return;      
  }  
      for(int i=0;i<input.length;i++){     
       if(hasVisted[i]==true){   
             continue;    
        }     
       hasVisted[i] = true; 
           tempResult.add(input[i]);        
    backTracing(tempResult,result,hasVisted,input);     
       tempResult.remove(tempResult.size()-1);    
        hasVisted[i]=false;   
     }
    }
}