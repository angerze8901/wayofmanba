package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/**
 * Created by wangze on 2018/3/11.
 */
public class Lagou implements MethodInterceptor
{
    public Object getInstance(Class<?> clazz)
    {
        Enhancer enhancer = new Enhancer();
        //继承clazz类
        enhancer.setSuperclass(clazz);
        //自己调用这个类
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable
    {
        //业务增强
        System.out.println("拉勾开始帮你找工作");
        methodProxy.invokeSuper(o, objects);
        System.out.println("如果合适,就办事");
        return null;
    }
}
