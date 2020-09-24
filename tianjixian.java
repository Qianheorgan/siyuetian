import java.util.*;
public class tianjixian{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //建筑物个数
        int n = Integer.parseInt(sc.nextLine());
        int[][] buildings = new int[n][3];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            for (int j = 0; j < arr.length; j++) {
                buildings[i][j] = Integer.parseInt(arr[j]);
            }
        }

        //获取天际线，待实现
        List<List<Integer>> skyline = getSkyline(buildings);

        //输出skyline到标准输出
        for (List<Integer> point : skyline) {
            int size = point.size();
            for (int i = 0; i < size; i++) {
                System.out.print(point.get(i));
                if (i < size-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> getSkyline(int[][] buildings) {
         int len=buildings.length;
         if(len==0){
             return new ArrayList<>();

         }
         return  get(buildings,0,len-1);

    }
    public static List<List<Integer>> get(int[][]buildings, int l,int r){
        List<List<Integer>> list =new ArrayList<>();
        if(l==r){
            list.add(Arrays.asList(buildings[l][0],buildings[l][2]));
            list.add(Arrays.asList(buildings[l][1],0));
            return  list;
        }
        int mid=l+(r-l)/2;
        List<List<Integer>> left=get(buildings,l,mid);
        List<List<Integer>> right =get(buildings,mid+1,r);
        int a=0;
        int b=0;
        int a1=0;
        int b1=0;
        int lx,ly,rx,ry;
        while(a<left.size()||b<right.size()){
            if(a>=left.size()){
                list.add(right.get(b++));
            }
            else if(b>=right.size()){
                list.add(left.get(a++));
            }
            else{
                lx=left.get(a).get(0);
                ly=left.get(b).get(1);
                rx=right.get(b).get(0);
                ry=right.get(b).get(1);
                if(lx<rx){
                    if(ly>ry){
                        list.add(left.get(a));

                    }
                    else if(ly>a1){
                        list.add(Arrays.asList(lx,b1));
                    }
                        a1=ly;
                        a++;

                }
                    else if(lx>rx){
                        if(ry>a1) {
                        list.add(right.get(b));
                        }
                        else if(b1>a1) {
                        list.add(Arrays.asList(rx, a1));
                    }
                            b1=ry;
                            b++;


                }
                    else {
                        if(ly>=ry&&ly!=(a1>b1?a1:b1)){
                            list.add(left.get(a));
                        }
                        else if(ly<=ry&&ry!=(a1>b1?a1:b1)){
                            list.add(right.get(b));
                        }
                        a1=ly;
                        b1=ry;
                        a++;
                        b++;
                    }
                }

            }


        return list;

     }
}