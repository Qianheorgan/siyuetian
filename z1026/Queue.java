public class Queue {
    private int[] array;
    private int size;
    private int front;
    private int last;
    public Queue(int[] array,int size,int front,int last){
        array=new int[10];
        size=0;
        front=0;
        last=0;
    }
    public boolean enQueue(int value) {
        if (size == array.length) {
            return false;
        } else {
            array[last] = value;
            size++;
            last = (last + 1) % array.length;
            return true;
        }
    }
        public boolean deQueue(){
            if(size==0){
                return false;
            }
            else{
                front=(front+1)%array.length;
                size--;
                return true;
            }
    }
    public int Rear(){
        return array[(last+array.length-1)%array.length];
    }


    public static void main(String[] args) {

    }
}
