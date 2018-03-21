package pattern.singleton;

/**
 * Created by wangze on 2018/3/21.
 */
public class UserInfoSychnized
{
    //标记的volatile的变量,可以实时的将变量改变后的值写入到主存中,同时有多个线程操作变量的时候保证其一致性,否则将会导致变量的数据错误
    volatile private static UserInfoSychnized instance = null;

    public static UserInfoSychnized getInstance()
    {
        if (instance == null)
        {
            synchronized (UserInfoSychnized.class)
            {
                if (instance == null)
                {
                    instance = new UserInfoSychnized();
                }
                else
                {
                    return instance;
                }
            }
        }
        return instance;
    }
}
