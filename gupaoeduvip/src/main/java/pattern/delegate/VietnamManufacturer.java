package pattern.delegate;

/**
 * Created by wangze on 2018/3/23.
 */
public class VietnamManufacturer implements Nike
{

    @Override
    public void productNikeShoes()
    {
        System.out.println("shoes:made in vietnam");
    }

    @Override
    public void productNikeClothes()
    {
        System.out.println("clothes:made in vietnam");
    }
}
