package pattern.singleton;

/**
 * Created by wangze on 2018/3/21.
 */
public class UserInfoInsideStatic
{
    /**
     * 内部静态类单例模式,其实也是一种懒加载,只有在调用getInstance的才会加载内部静态的类
     */
    private static class UserInfoInsideStaticInstance
    {
        private static final UserInfoInsideStatic instance = new UserInfoInsideStatic();
    }

    public static UserInfoInsideStatic getInstance()
    {
        return UserInfoInsideStaticInstance.instance;
    }

    //跟上面有何区别
//    public static final UserInfoInsideStatic u = new UserInfoInsideStatic();
}
