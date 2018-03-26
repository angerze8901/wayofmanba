package pattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangze on 2018/3/26.
 */
public class RegisterSingleton
{
    //将注册的单例放入到map到
    private static Map<String, Object> map = new HashMap<String, Object>();

    static {
        RegisterSingleton registerSingleton = new RegisterSingleton();
        map.put(registerSingleton.getClass().getName(), registerSingleton);
    }

    public static RegisterSingleton getInstance(String name)
    {
        if (name == null)
        {
            name = RegisterSingleton.class.getName();
            System.out.println("name为null,name的值: " + name);
        }
        if (map.get(name) == null)
        {
            try
            {
                map.put(name, (RegisterSingleton) Class.forName(name).newInstance());
            } catch (Exception e)
            {
                e.getMessage();
            }
        }

        return (RegisterSingleton) map.get(name);
    }
}
