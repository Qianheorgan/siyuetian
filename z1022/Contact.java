import java.util.Map;
import java.util.TreeMap;
public class Contact {
    Map<String,User> map=new TreeMap<>();
    public void add(String name,String mobilephone,String officephone)throws ExceptionDemo{
        User user=new User(name,mobilephone,officephone);
        if(map.containsKey(name)){
            throw new ExceptionDemo();
        }
        map.put(name,user);

    }
    public void search(String name)throws ExceptionDemo{
        if(!map.containsKey(name)){
            throw new ExceptionDemo();
        }
        User a=map.get (name);
        System.out.println("找到了");
        System.out.println(a.name);
        System.out.println(a.mobliephone);
        System.out.println(a.officephone);
    }
    public  void remove (String name)throws ExceptionDemo{
        if(!map.containsKey(name)){
            throw new ExceptionDemo();
        }
        map.remove(name);
        System.out.println("删除成功");
    }
    public void update(String name,String mobilephone,String officephone) {
         User a=map.get(name);
         a.mobliephone=mobilephone;
         a.officephone=officephone;
        System.out.println("输出更新后的信息");
        User b=map.get(name);
        System.out.println(b.name);
        System.out.println(b.mobliephone);
        System.out.println(b.officephone);
    }
}
