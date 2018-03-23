package pattern.observer;

/**
 * Created by wangze on 2018/3/23.
 */
public class TestOb
{
    public static void main(String[] args)
    {
        ConsumerAObserver aObserver = new ConsumerAObserver();
        ConsumerBObserver bObserver = new ConsumerBObserver();
        IphoneSubject iphoneSubject = new IphoneSubject();
        iphoneSubject.attach(aObserver);
        iphoneSubject.attach(bObserver);
        iphoneSubject.setMesg("有货了");
    }
}
