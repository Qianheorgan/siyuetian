import java.util.Scanner;

public class shitang {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int n=in.nextInt();
        String s=in.next();
       // System.out.println(s);
        int m=in.nextInt();
        String l=in.next ();
        //System.out.println(l);
        get(t,n,s,m,l);

    }
    public  static void get(int t,int n,String s,int m,String l) {
        for (int q = 0; q < t; q++) {

            int[] a = new int[n];
            String[] s1 = s.split("");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s1[i]);
            }
            String[] l1 = l.split("");
            for (int j = 0; j < m; j++) {
                if (l1[j].equals("F")) {
                    int min = a[0];
                    int b = 0;
                    for (int i = 1; i < n; i++) {
                        if (a[i] < min) {
                            min = a[i];
                            b = i;
                        }
                    }
                    a[b] += 1;
                    System.out.println(b + 1);
                } else {
                    int max = 0;
                    int c = 0;
                    for (int i = 0; i < n; i++) {
                        if (a[i] != 2) {
                            max = a[i];
                            c = i;
                            break;
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        if (a[i] > max && a[i] != 2) {
                            max = a[i];
                            c = i;
                        }
                    }
                    a[c] += 1;
                    System.out.println(c + 1);

                }
            }
        }
    }
}
