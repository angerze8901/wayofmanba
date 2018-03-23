package pattern.delegate;

/**
 * Created by wangze on 2018/3/23.
 */
public interface Nike
{
    //nike公司制造鞋子的方法,然而他自己本身不会去制造,而是委托给其他的制作商去
    public void productNikeShoes();

    public void productNikeClothes();
}
