
public class NearPublicFather{
    public int getLCA(int a, int b) {
        if (a == b)
            return a;
        return a>b? getLCA(a/2, b): getLCA(a, b/2);
    }
};