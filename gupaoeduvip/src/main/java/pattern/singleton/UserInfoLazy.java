package pattern.singleton;

/**
 * Created by wangze on 2018/3/21.
 */
public class UserInfoLazy
{
    /**
     * 懒汉式的单例模式,一开始不创建实例,等到需要的时候再创建,这种做法是以时间换取了空间
     */
    public static UserInfoLazy instance;

    //方法加锁,效率降低
    public static synchronized UserInfoLazy getInstance()
    {
        if (instance == null)
        {
            instance = new UserInfoLazy();
        }
        return instance;
    }
}
