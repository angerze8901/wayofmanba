package pattern.proxy.staticproxy;

/**
 * Created by wangze on 2018/3/21.
 */
public class TestSale
{
    public static void main(String[] args)
    {
        //静态代理卖鞋子
        ProxySale proxySale = new ProxySale(new SaleShoes());
        proxySale.sale();
    }

}
