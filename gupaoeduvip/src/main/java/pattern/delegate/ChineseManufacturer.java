package pattern.delegate;

/**
 * Created by wangze on 2018/3/23.
 */
public class ChineseManufacturer implements Nike
{
    //由中国制造商去制造
    @Override
    public void productNikeShoes()
    {
        System.out.println("shoes:made in china.");
    }

    @Override
    public void productNikeClothes()
    {
        System.out.println("clothes:made in china");
    }
}
