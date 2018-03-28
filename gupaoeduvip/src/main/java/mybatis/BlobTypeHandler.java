package mybatis;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import sun.reflect.generics.tree.BaseType;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;

/**
 * Created by wangze on 2018/3/27.
 */
public class BlobTypeHandler extends BaseTypeHandler<String>
{
    public static final String DEFAULT_CHARSET = "UTF-8";

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException
    {
        //String转化为byte流
        try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(s.getBytes(DEFAULT_CHARSET)))
        {
            //prepareStatement相比statement因为是预编译所以速度更快而且还防止了sql注入
            preparedStatement.setBinaryStream(i,byteArrayInputStream,s.length());
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public String getNullableResult(ResultSet resultSet, String s) throws SQLException
    {
        //获取blob,s代表列名
        Blob blob = resultSet.getBlob(s);
        byte[] bytes = null;
        if (null != blob)
        {
            bytes = blob.getBytes(1, (int) blob.length());
        }
        try
        {
            if (null != bytes)
            {
                //转化为String
                return new String(bytes, DEFAULT_CHARSET);
            }
        } catch (UnsupportedEncodingException e)
        {
            throw new RuntimeException("Blob Encoding Error");
        }
        return null;
    }

    @Override
    public String getNullableResult(ResultSet resultSet, int i) throws SQLException
    {
        Blob blob = resultSet.getBlob(i);
        byte[] bytes = null;
        if (null != blob)
        {
            bytes = blob.getBytes(1, (int) blob.length());
        }
        try
        {
            if (null != bytes)
            {
                return new String(bytes, DEFAULT_CHARSET);
            }
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String getNullableResult(CallableStatement callableStatement, int i) throws SQLException
    {
        Blob blob = callableStatement.getBlob(i);
        byte[] bytes = null;
        if (null != blob)
        {
            bytes = blob.getBytes(1, (int) blob.length());
        }
        try
        {
            if (null != bytes)
            {
                return new String(bytes, DEFAULT_CHARSET);
            }
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
