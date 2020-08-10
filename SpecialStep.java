public class SpecialStep {
    public static void main(String[] args) {
        JumpFloorII(10);
    }
    public static  int JumpFloorII(int target) {
        return (int ) Math.pow(2,target-1);
    }
}