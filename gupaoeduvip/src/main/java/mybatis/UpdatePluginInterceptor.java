package mybatis;


import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;

import java.util.Properties;

/**
 * Created by wangze on 2018/3/28.
 */
@Intercepts({@Signature(type = Executor.class,
method = "update",
args = {MappedStatement.class,Object.class})})
public class UpdatePluginInterceptor implements Interceptor
{

    @Override
    public Object intercept(Invocation invocation) throws Throwable
    {
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object o)
    {
        return Plugin.wrap(o,this);
    }

    @Override
    public void setProperties(Properties properties)
    {

    }
}
