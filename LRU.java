import java.util.*;


public class LRU {
    //结点类
    static class Node{
        int key , value;//分别代表存入的第一个和第二个数
        Node prev,next;//前驱和后继
        public Node(int key , int value){
            this.key = key;
            this.value = value;
        }
    }
    private Map<Integer,Node> map = new HashMap<>();//用来存储和判断长度是否大于K
    private Node head = new Node(-1,-1);//头节点
    private Node tail = new Node(-1,-1);//尾结点
    private int k;
    public int[] LRU (int[][] operators, int k) {

        this.k = k;
        head.next = tail;
        tail.prev = head;
        int len =(int) Arrays.stream(operators).filter(x->x[0] == 2).count();
        int[] ans = new int[len];
        int cnt = 0;
        for(int i=0;i < operators.length ;i++){
            if(operators[i][0] == 1){
                set(operators[i][1],operators[i][2]);
            }else{
                ans[cnt++] = get(operators[i][1]);
            }
        }
        return ans;
    }
    public void set(int key,int value){
        if(get(key) > -1){//判断map里是否存在这个key，如果存在，更换value
            map.get(key).value = value;
        }else{
            if(map.size() == k ){//长度等于k，删除最后一个结点，即最不常用的
                int rk = tail.prev.key;
                tail.prev.prev.next = tail;
                tail.prev = tail.prev.prev;
                map.remove(rk);
            }
            Node node = new Node(key,value);
            map.put(key,node);
            removeToHead(node);
        }
    }
    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.prev.next = node.next;
            node.next.prev = node.prev;

            removeToHead(node);
            return node.value;
        }
        return -1;
    }
    public void removeToHead(Node node){//将最新插入或用过的结点放在头节点之后
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }
}