package pattern.decorator;

/**
 * Created by wangze on 2018/3/23.
 */
public class Bread extends Ingredients
{
    private String flour;

    public Bread(Ingredients ingredients)
    {
        System.out.println("基础面包");
    }

}
