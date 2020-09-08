import java.util.*;
public class mingan{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine ();
        String b=in.nextLine ();
        String c=in.nextLine ();
        Set<String> set=new HashSet<>() ;
        for(int i=0;i<a.length();i++){
            set.add(a.substring(i,i+1));
        }
        int size =set.size();
        String[] b1=b.split(",");
        for(int j=0;j<b1.length ;j++){
             String d=b1[j];
             String[] m=d.split(" ");
             for(int i=0;i<m.length;i++){
                 String l=m[i];
                 boolean t=false;
                 if(l.length()==size){
                     t=true;
                 for(int g=0;g<l.length();g++){
                     if(!set.contains(l.substring(g,g+1))){
                         t=false;
                         break;
                     }
                 }
                 }
                 if(t){
                     System.out.print(c );
                 }else{
                     System.out.print(l );
                 }
                 if(i!=m.length-1){
                 System.out.print(" ");}
             }
             if(j!=b1.length-1){
            System.out.print(",");}

        }
    }
//    public static String get(String  d,Set<String> set,String c){
//        StringBuffer  s=new StringBuffer ();
//        int size=set.size();
//            String[] e=d.split(" ");
//            for(int t=0;t<e.length;t++){
//              boolean g=true;
//              String f=e[t];
//               if(f.length()==size){
//                for(int j=0;j<size;j++){
//                    if(!set.contains(f.substring(j,j+1))){
//                        g=false;
//                        break;
//                    }
//
//                }
//                if(g){
//                    s.append(c);
//                    s.append(" ");
//                }
//                else{
//                s.append(f);
//                s.append(" ");}
//            }
//
//        }
//        System.out.println(s);
//        String w=s.substring(0,s.length());
//        return   w;
//    }
}