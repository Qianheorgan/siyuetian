package udp.echo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class server {
    public static void main(String[] args) throws IOException {
        //1、创建一个socket
        DatagramSocket udpserversocker=new DatagramSocket(9898);
        byte[] receivebuffer=new byte[1024];
        DatagramPacket  receivepacket=new DatagramPacket(receivebuffer,receivebuffer.length);
        //2、等待客户端连接
        udpserversocker.receive(receivepacket);
        InetAddress clientAddress=receivepacket.getAddress();
        System.out.printf("我从%s：%d收到了消息%n",clientAddress.getHostAddress(),receivepacket.getPort());
        System.out.printf("我一共收到了%d字节的数据%n",receivepacket.getLength());
        String message1=new String(receivepacket.getData(),0,receivepacket.getLength(),"UTF-8");
        System.out.println(message1);
        Scanner in=new Scanner(System.in);
        System.out.println("请输入：");
        String message=in.nextLine();

        byte[] sendBuffer=message.getBytes("UTF-8");

        DatagramPacket sendPacket = new DatagramPacket(
                sendBuffer,
                sendBuffer.length,
                clientAddress ,
                receivepacket.getPort()
        );
       udpserversocker.send(sendPacket);


        udpserversocker.close();
    }
}
