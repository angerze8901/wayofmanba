package pattern.delegate;

/**
 * Created by wangze on 2018/3/23.
 */
public class TestDelegate
{
    public static void main(String[] args)
    {
        NikeBoss nikeBoss = new NikeBoss();
        nikeBoss.productNikeClothes();
        nikeBoss.productNikeShoes();
        nikeBoss.madeVietnam();
        nikeBoss.productNikeShoes();
        nikeBoss.productNikeClothes();
    }
}
