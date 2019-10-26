import  java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Contact contact=new Contact();


        while(true){
            menu();
            int selecte=scanner.nextInt();
            scanner.nextLine();
            switch (selecte) {
                case 1:
                    add(contact,scanner);
                    break;
                case 2:
                    search(contact,scanner);
                    break;
                case 3:
                    remove(contact,scanner);
                    break;

                case 4:
                    update(contact,scanner);
                    break;
            }
        }

    }
    //添加
    private static void add(Contact contact,Scanner scanner){
        System.out.println("请输入姓名");
        String name =scanner.nextLine();
        System.out.println("请输入手机");
        String mobilephone=scanner.nextLine();
        System.out.println("请输入办公室电话");
        String offerphone=scanner.nextLine();
        try{
            contact.add(name,mobilephone,offerphone);
            System.out.println("添加成功");
        }
        catch(ExceptionDemo e){
            System.out.println("添加失败，用户已存在");
        }
        finally{
            System.out.println("***********");
        }
    }
    //查找
    private static void search(Contact contact,Scanner scanner){
        System.out.println("请输入姓名");
        String name1 =scanner.nextLine();
        try {
            contact.search(name1);

        }
        catch(ExceptionDemo e){
            System.out.println("没找到");
        }
        finally{
            System.out.println("*************");
        }

    }
    //删除
    public static void remove(Contact contact,Scanner scanner){
        System.out.println("请输入姓名");
        String name1 =scanner.nextLine();
        try{
            contact.remove(name1);
        }
        catch(ExceptionDemo e ){
            System.out.println("没有这个人");
        }
        finally{
            System.out.println("************");
        }
    }
    //更新
    public static void update(Contact contact,Scanner scanner){
        System.out.println("请输入要更改的姓名");
        String name=scanner.nextLine();
        search(contact, scanner);

        System.out.println("请输入要更改的手机");
        String mobilephone=scanner.nextLine();
        System.out.println("请输入要更改的办公室电话");
        String offerphone=scanner.nextLine();
        contact.update(name,mobilephone,offerphone);
    }
    //界面
    private static void menu(){
        System.out.println("|比特专用通讯录");
        System.out.println("|1、添加");
        System.out.println("|2、查找");
        System.out.println("|3、删除");
        System.out.println("|4、更新");
        System.out.println("请选择正确的选项");
    }

}
