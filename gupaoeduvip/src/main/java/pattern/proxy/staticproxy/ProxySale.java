package pattern.proxy.staticproxy;

/**
 * Created by wangze on 2018/3/21.
 */
public class ProxySale implements SaleSomething
{
    //引入卖家,此处缺陷在于固定了卖家SaleShoes,如果有很多卖家,这里一个个写死很蛋疼,所以需要动态代理
    private SaleShoes saleShoes;

    public ProxySale(SaleShoes saleShoes)
    {
        this.saleShoes = saleShoes;
    }

    @Override
    public void sale()
    {
        System.out.println("代理:我是1号代理,请问有什么需要?");
        saleShoes.sale();
    }


}
