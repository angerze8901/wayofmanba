package pattern.singleton;

/**
 * Created by wangze on 2018/3/21.
 */
public class UserInfoHungry
{

    /**
     * 所谓饿汉式是指类初始化的时候已经完成了实例化,以空间换取时间的一种做法
     */
    public static UserInfoHungry instance = new UserInfoHungry();

    public static UserInfoHungry getInstance()
    {
        return instance;
    }


}
