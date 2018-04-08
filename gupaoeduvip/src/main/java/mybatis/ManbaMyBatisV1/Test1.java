package mybatis.ManbaMyBatisV1;

/**
 * Created by wangze on 2018/4/3.
 */
public class Test1
{
    public static void main(String[] args)
    {
        MBsqlsession mBsqlsession = new MBDeafultSqlsession(new MBConfiguration(), new MBExecutor());
        MBTestMapper testMapper = mBsqlsession.getMapper(MBTestMapper.class);
        TestMB testMB = testMapper.selectByid();
        System.out.println(testMB);
    }
}
