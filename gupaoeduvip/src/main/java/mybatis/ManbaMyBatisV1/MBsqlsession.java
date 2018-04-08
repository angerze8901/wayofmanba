package mybatis.ManbaMyBatisV1;

import java.util.List;

/**
 * Created by wangze on 2018/4/2.
 */
public interface MBsqlsession
{
    TestMB selectOne(String statement);

    TestMB selectOne(String statement, Object parameter);

    List<TestMB> selectList(String statement);

    List<TestMB> selectList(String statement, Object parameter);

    <T> T getMapper(Class<T> clazz);
}
