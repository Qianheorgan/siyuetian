import  java.util.*;
public class Typing {
     
    public String Typing (String s) {
        // write code here       
        char[] array = s.toCharArray();
        if(array.length == 0){
            return null;
        }
        LinkedList<Character> deque  = new LinkedList<>();
        for(Character ch : array){
            if(!ch.equals('<')){
                deque.push(ch);
            }else if(!(deque.size() == 0)){
                deque.pop();
            }
        }
        StringBuilder str = new StringBuilder();
        while(!(deque.size() == 0)){
            str.append(deque.pollLast());
        }
        return str.toString();
    }
}