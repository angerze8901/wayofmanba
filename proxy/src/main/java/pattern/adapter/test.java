package pattern.adapter;

/**
 * Created by wangze on 2018/3/18.
 */
public class test
{
    public static void main(String[] args)
    {
        Mobile mobile = new Mobile();
        mobile.charging(new VoltageAdapter(),220);
    }
}
