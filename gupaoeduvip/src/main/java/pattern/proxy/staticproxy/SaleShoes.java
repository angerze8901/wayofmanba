package pattern.proxy.staticproxy;

/**
 * Created by wangze on 2018/3/21.
 */
public class SaleShoes implements SaleSomething
{

    /**
     * 自己一个人卖鞋子肯定有限,需要招一些代理来帮助卖
     */
    @Override
    public void sale()
    {
        System.out.println("卖家: 我想卖鞋子");
    }
}
