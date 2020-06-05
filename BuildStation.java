

import java.util.*;
public class BuildStation {
    public int work(int n, int[] a) {
        int res=1;
        for (int i = 1; i < n; i++) {
            int disance=a[i]-a[i-1];
            if(isPrime(disance)) {
                res++;
            }else if(disance%2==0||isPrime(disance-2)){
                res+=2;
            }else{
                res+=3;
            }
        }
        return res;
    }
    public boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n + 0.0); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
} 