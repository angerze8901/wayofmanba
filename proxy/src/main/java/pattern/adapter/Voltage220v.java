package pattern.adapter;

/**
 * Created by wangze on 2018/3/18.
 */
public class Voltage220v
{
    public int output220V()
    {
        int srcVol = 220;
        System.out.println("提供电压: " + srcVol);
        return srcVol;
    }
}
