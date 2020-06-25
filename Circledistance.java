 
import java.io.*;
import java.util.*;
public class Circledistance { 
   public static double msv1; 
   public static double msv2;  
  public static double sum = Double.MIN_VALUE;    
public static void main(String[] args) throws Exception {   
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
    int n = Integer.valueOf(br.readLine());    
    double arr ;     
   Map<Integer, List<Double>> map = new HashMap<Integer, List<Double>>(); 
       for(int i = 0;i<n;i++){       
     arr = Double.valueOf(br.readLine());     
       if(map.containsKey((int)arr)) {           
     map.get((int)arr).add(arr);     
       }else {            
    List<Double> list = new ArrayList<Double>();     
           list.add(arr);         
       map.put((int)arr, list);   
         }     
   }     
   //System.out.println(map);       
 for(Integer key :map.keySet()) {    
        double temp = Double.MIN_VALUE ;         
   double temp2 = Double.MIN_VALUE ;   
         int diagonal;         
   if(key<=180) {              
  diagonal = key + 180;           
     for(int i = diagonal,j=0;i>=key;i--,j++) {      
              if(map.containsKey(i)) {          
              if(i == diagonal||i==key) {      
                     temp = check2(map.get(key),map.get(i),map.get(i-1),map.get(i+1));                            if(temp>sum) {                                sum = temp;                            }                            break;                        }                        if(i-key+1>=sum) {                            temp = check(map.get(key),map.get(i),1);                            if(temp>sum) {                                sum = temp;                            }                        }                    }                    int s1 = 0;                    int s2 = 0;                    if(2*j+i>360) {                        s1 = 2*j+i-360;                        s2 = 1;                    }else {                        s1 = 2*j+i;                        s2 = -1;                    }                    if(map.containsKey(s1)) {                        if(Math.abs(s1-key)+1>=sum) {                            temp2 = check(map.get(key),map.get(s1),s2);                            if(temp2>sum) {                                sum = temp2;              
              }               
         }              
      }       
         }    
        }   
     }      
  //System.out.println(msv1);      
  //System.out.println(msv2);      
  System.out.println(String.format("%.8f", sum)); 
   }    
private static double check2(List<Double> list, List<Double> list2, List<Double> list3, List<Double> list4) {    
    List<Double> t2 = new ArrayList<Double>(list2);  
      List<Double> t3 ;     
   List<Double> t4 ;    
    if(list3!=null) {         
   t3 = new ArrayList<Double>(list3);  
          t2.addAll(t3);  
      }       
 if(list4!=null) {      
      t4 = new ArrayList<Double>(list4);     
       t2.addAll(t4);    
    }       
 double result = 0;     
   for(int i = 0;i<list.size();i++) {    
        for(int j = 0;j<t2.size();j++) {    
            double t = Math.abs(list.get(i)-t2.get(j));    
            if(t>180) {         
           if(result<360-t) {     
                   result = 360-t;       
             }            
    }else {        
            if(result<t) {         
               result = t;             
       }             
   }           
 }       
 }//   if(result>180) {
//     System.out.println("--------check2--------"+result);//      }     
   return result;   
 }   
 private static double check(List<Double> list, List<Double> list2, int i) {       
  list.sort(new Comparator<Double>() { 
           public int compare(Double o1, Double o2) {    
            if(o1>o2){      
              return 1;             
   }else {                 
   return -1;               
 }        
    }    
    });  
      list2.sort(new Comparator<Double>() {      
      public int compare(Double o1, Double o2) {   
             if(o1>o2){             
       return 1;           
     }else {            
        return -1;           
     }         
   }      
  });     
   List<Double> temp;   
     if(list.get(0)>list2.get(0)) {       
     temp= list;         
   list = list2;     
       list2 = temp;     
   }        
double result = 0;        if(i>=1) {   
         result = list2.get(list2.size()-1)-list.get(0);  
          if(result > sum) {     
           msv1 = list2.get(list2.size()-1);     
           msv2 = list.get(0);        
    }  
      }else {  
          result = 180-(list2.get(0)-(list.get(list.size()-1)+180));  
          if(result > sum) {    
            msv1 = list.get(list.size()-1);        
        msv2 = list2.get(0);      
      }      
  }//      if(result>180) {
//          System.out.println("--------check--------"+result);
//      }  
      return result;   
 }
}