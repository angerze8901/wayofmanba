package mybatis.ManbaMyBatisV1;

import java.sql.*;

/**
 * Created by wangze on 2018/4/2.
 */
public class JavaConnectToMysql
{
    public static void main(String[] args)
    {
        String driver = "com.mysql.jdbc.Driver";
        Connection con;
        String url = "jdbc:mysql://172.171.2.153:3306/cacheAnalysis?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false&allowMultiQueries=true";
        String user = "analysis";
        String passwd = "123456";
        String sql = "select user_id, login_name, pwd from SYS_USER";
        try
        {
            //加载驱动
            Class.forName(driver);
            //1.getCon
            con = DriverManager.getConnection(url, user, passwd);
            if (!con.isClosed())
            {
                System.out.println("succeed connecting to the Database");
            }
            //2.创建statement
            Statement statement = con.createStatement();

            //3.存放结果集
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next())
            {
                System.out.println(rs.getObject("user_id"));
                System.out.println(rs.getObject("login_name"));

            }
            rs.close();
            con.close();

        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("查询结束");
        }
    }
}
