package mybatis.ManbaMyBatisV1;



import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangze on 2018/4/2.
 */
public class MBConfiguration
{
    public static final Map<String, String> map = new HashMap<String, String>();

    //动态代理方式,使用MapperProxy方式
    public <T> T getMapper(Class<T> clazz,MBsqlsession sqlsession)
    {
        return (T)Proxy.newProxyInstance(MBConfiguration.class.getClassLoader(),new Class[]{clazz},
                new MBMapperProxy(sqlsession));
    }

    static {
        map.put("selectByid", "select user_id, login_name, pwd from SYS_USER");
    }

}
