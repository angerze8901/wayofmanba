package mybatis.mybatisv1x1.session;

/**
 * Created by wangze on 2018/4/8.
 */
public interface SqlsessionMB
{
    <T> T selectOne(String statement, Object parameter);

    <T> T getMapper(Class<T> type);
}
