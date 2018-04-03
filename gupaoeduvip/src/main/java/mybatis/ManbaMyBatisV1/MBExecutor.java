package mybatis.ManbaMyBatisV1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangze on 2018/4/2.
 */
public class MBExecutor
{
    List<TestMB> query()
    {
        List<TestMB> result = new ArrayList<>();
        String driver = "com.mysql.jdbc.Driver";
        Connection con;
        String url = "jdbc:mysql://172.171.2.153:3306/cacheAnalysis?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false&allowMultiQueries=true";
        String user = "analysis";
        String passwd = "123456";
        String sql = "select user_id, login_name, pwd from SYS_USER where user_id ='1d367421-9060-46e1-af29-368ed6e3b3ac'";
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

                TestMB testMB = new TestMB();
                testMB.setUserid(rs.getString("user_id"));
                testMB.setLoginname(rs.getString("login_name"));
                result.add(testMB);

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
            System.out.println(result);
            System.out.println("查询结束");
        }

        return result;
    }

    //测试连接
    public static void main(String[] args)
    {
        MBExecutor mbExecutor = new MBExecutor();
        mbExecutor.query();
    }
}
