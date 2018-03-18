package pattern.adapter;

/**
 * Created by wangze on 2018/3/18.
 */
public class Mobile
{
    public void charging(IAdapter5v iAdapter5v)
    {

        if (iAdapter5v.output5v() == 5)
        {
            System.out.println("电压匹配");
        }
        else
        {
            System.out.println("电压不匹配");
        }
    }
}
