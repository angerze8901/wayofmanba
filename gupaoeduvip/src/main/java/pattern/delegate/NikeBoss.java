package pattern.delegate;

/**
 * Created by wangze on 2018/3/23.
 */
public class NikeBoss implements Nike
{
    Nike Nike = new ChineseManufacturer();
    @Override
    public void productNikeShoes()
    {
        Nike.productNikeShoes();
    }

    @Override
    public void productNikeClothes()
    {
        Nike.productNikeClothes();
    }

    public void madeChinaShoes()
    {
        Nike = new ChineseManufacturer();
    }

    public void madeVietnam()
    {
        Nike = new VietnamManufacturer();
    }
}
