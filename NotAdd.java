public class NotAdd {
    public int Sum_Solution(int n) {
        int sum=(int)Math.pow(n, 2)+n;
        return sum>>1;}

    public static void main(String[] args) {
        NotAdd a=new NotAdd();
        System.out.println(a.Sum_Solution(5));
    }
}
