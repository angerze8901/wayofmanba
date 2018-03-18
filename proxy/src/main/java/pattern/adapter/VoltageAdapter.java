package pattern.adapter;

/**
 * Created by wangze on 2018/3/18.
 */
public class VoltageAdapter extends Voltage220v implements IAdapter5v
{

    @Override
    public int output5v()
    {
        //得到源电压
        int srcVlo = output5v();
        //通过转换,源电压变成5v
        int destVol = srcVlo / 44;
        System.out.println("转换之后的电压: " + destVol);
        return destVol;
    }
}
