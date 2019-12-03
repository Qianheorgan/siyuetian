import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、注册Driver
        Class.forName("com.mysql.jdbc.Driver");
        //2、通过DriverManager获取数据库连接
        Connection connection=DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/helloword?useSSL=false",
                "root",
                "070707"
        );
        Statement statement=connection.createStatement();
       // int rows=statement.executeUpdate("DELETE FROM classes WHERE name = 'java 11ban'");
        //int rows1=statement.executeUpdate(" insert into classes (name) values ('xiangrekuiban')");
        int row2=statement.executeUpdate("insert into students(sn,name,class_id ) values (10086,'labixianxin',4),(10039,'maidou',4),(10028,'sunwukong',4)");
        System.out.println(row2);
        /*ResultSet resultSet= statement.executeQuery("show tables");
      while(resultSet.next()){
          //jdbc，列是从1开始的
          String tabelName=resultSet.getString(1);
          System.out.println(tabelName);
      }
      resultSet.close();
      //关闭statement*/
      statement.close();
        //3、执行SQL（获取Statement；执行Statement并得到ResultSet；读取ResultSet；关闭ResultSet；关闭Statement）
       // System.out.println(connection);
        //最后关闭连接
        connection.close();
    }
}
