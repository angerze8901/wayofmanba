package mybatis.ManbaMyBatisV1;

import org.apache.ibatis.exceptions.TooManyResultsException;

import java.util.List;

/**
 * Created by wangze on 2018/4/2.
 */
public class MBDeafultSqlsession implements MBsqlsession
{
    private MBConfiguration configuration;
    private MBExecutor executor;

    public MBDeafultSqlsession(MBConfiguration configuration, MBExecutor executor)
    {
        this.configuration = configuration;
        this.executor = executor;
    }

    @Override
    public TestMB selectOne(String statement)
    {
        return this.selectOne(statement,null);
    }

    @Override
    public TestMB selectOne(String statement, Object parameter)
    {
        List<TestMB> list = this.selectList(statement, parameter);
        if (list.size() == 1)
        {
            return list.get(0);
        } else if (list.size() > 1)
        {
            throw new TooManyResultsException("只能返回一个list,but found: " + list.size());
        }else
        {
            return null;
        }
    }

    @Override
    public List<TestMB> selectList(String statement)
    {
        return this.selectList(statement,null);
    }

    @Override
    public List<TestMB> selectList(String statement, Object parameter)
    {
        return executor.query();
    }

    @Override
    public <T> T getMapper(Class<T> clazz)
    {
        return configuration.<T>getMapper(clazz,this);
    }
}
