package mybatis.mybatisv1x1.session;

import mybatis.mybatisv1x1.ConfigurationMB;

/**
 * Created by wangze on 2018/4/8.
 */
public class DefaultSqlSessionMB implements SqlsessionMB
{
    private ConfigurationMB configurationMB;
    private ExecutorMB executorMB;

    @Override
    public <T> T selectOne(String statement, Object parameter)
    {
        return null;
    }

    @Override
    public <T> T getMapper(Class<T> type)
    {
        return null;
    }
}
