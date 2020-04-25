import java.util.*;
public class KindergartenDivision{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int size = sc.nextInt();
    HashSet<String> setA = new HashSet<>();
    HashSet<String> setB = new HashSet<>();
    String req[] = new String[2];
    sc.nextLine();
    int res =1;
    for(int i=0;i<size;i++){
        req=sc.nextLine().split(" ");
        if(!setA.contains(req[0])&&!setB.contains(req[0])&&!setA.contains(req[1])&&!setB.contains(req[1])){
            setA.add(req[0]);
            setB.add(req[1]);
        }

        else if(setA.contains(req[0])&&!setB.contains(req[0])&&!setA.contains(req[1])&&!setB.contains(req[1])){
            setB.add(req[1]);
        }
        else if(!setA.contains(req[0])&&setB.contains(req[0])&&!setA.contains(req[1])&&!setB.contains(req[1])){
            setA.add(req[1]);
        }
        else if(!setA.contains(req[0])&&setB.contains(req[0])&&!setA.contains(req[1])&&setB.contains(req[1])){
            res =0;
        }
        else if((setA.contains(req[0])&&setA.contains(req[1]))||(setB.contains(req[1])&&setB.contains(req[0]))){
            res =0;

        }
    }
        System.out.println(res);
}
}