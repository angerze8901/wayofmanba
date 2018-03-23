package pattern.observer;

/**
 * Created by wangze on 2018/3/23.
 */
public class ConsumerAObserver extends AbstractConsumer
{

    @Override
    public void buyIphone(String args)
    {
        System.out.println("A买手机");
    }
}
