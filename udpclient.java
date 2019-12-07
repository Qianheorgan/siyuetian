package udp.echo;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
        DatagramSocket udpclientsocket=new DatagramSocket();
        Scanner in=new Scanner(System.in);
        System.out.println("请输入：");
        String message=in.nextLine();
        byte[] sendBuffer=message.getBytes("UTF-8");
        //192.168.0.158
        byte[] serverIp=new byte[4];
        serverIp[0]=(byte)192;
        serverIp[1]=(byte)168;
        serverIp[2]=(byte)0;
        serverIp[3]=(byte)158;
        InetAddress serverAddress=InetAddress.getByAddress(serverIp);
        DatagramPacket sendPacket = new DatagramPacket(
                sendBuffer,
                sendBuffer.length,
                serverAddress,
                9898
        );
        udpclientsocket.send(sendPacket);
        byte[] receivebuffer=new byte[1024];
        DatagramPacket  receivepacket=new DatagramPacket(receivebuffer,receivebuffer.length);
        udpclientsocket.receive(receivepacket);
        String message1=new String(receivepacket.getData(),0,receivepacket.getLength(),"UTF-8");
        System.out.println(message1);
        udpclientsocket .close();
    }
    }

