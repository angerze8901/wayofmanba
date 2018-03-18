package pattern.proxy.cglib;

/**
 * Created by wangze on 2018/3/11.
 */
public class TestLagou
{
    public static void main(String[] args)
    {
        lingyu object = (lingyu) new Lagou().getInstance(lingyu.class);
        object.findJob();
        System.out.println(object.getClass());
    }
}
