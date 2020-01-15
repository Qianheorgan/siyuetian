
public class CutString{
    public int cutRope(int target) {
        return cutRope(target, 0);
    }
        public int cutRope(int target, int max) {
        int maxValue = max;
        for(int i = 1; i < target; ++i){
            maxValue = Math.max(maxValue, i*cutRope(target -i, target -i));
        }
        return maxValue;
    }
}