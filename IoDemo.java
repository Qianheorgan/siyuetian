import java.io.*;
import java.net.Socket;

public class IoDemo {
    public static void main(String[] args) throws IOException {
        InputStream is=获取一个输入流();
        String message=从字节流中最终获得字符数据(is);
        System.out.println(message);
    }

    private static InputStream 获取一个输入流 ()throws IOException{

        InputStream inputstream;
       // inputstream=new FileInputStream("本地文件.txt");
       // byte[] bytes="我只是内存中的一段空间\r\n第二行\r\n".getBytes("UTF-8");
        //inputstream =new ByteArrayInputStream(bytes);
        //inputstream=System.in;
        Socket socket=new Socket("www.baidu.com",80);
        OutputStream os=socket.getOutputStream();
        Writer writer=new OutputStreamWriter(os,"UTF-8");
        PrintWriter printWriter=new PrintWriter(writer,false);
        printWriter.printf("GET/HTTP/1.0\r\n\r\n");
        printWriter.flush();
        inputstream =socket.getInputStream();
        return inputstream;
    }
    private static String 从字节流中最终获得字符数据 (InputStream is) throws IOException{
      /*  byte[] buffer=new byte[1024];
        int len=is.read(buffer);
        String message=new String(buffer,0,len,"UTF-8");
        return message;*/

       /* Reader reader=new InputStreamReader(is,"UTF-8");
        char[] buffer=new char[1024];
        int len=reader.read(buffer);
        StringBuilder sb=new StringBuilder();

        while((len=reader.read(buffer))!=-1){
            sb.append(buffer,0,len);
        }
        //String message=new String(buffer,0,len);
        String message=sb.toString();
        return message;*/
       Reader reader=new InputStreamReader(is,"UTF-8");
        BufferedReader bufferedReader=new BufferedReader(reader);
        String line;
        StringBuilder sb=new StringBuilder();
        while((line=bufferedReader.readLine())!=null){
            sb.append(line+"\r\n");
        }
        String message=sb.toString();
        return message;
    }
}
