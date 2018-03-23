package pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangze on 2018/3/23.
 */
public class IphoneSubject
{
    List<AbstractConsumer> list = new ArrayList<>();

    public void setMesg(String mesg)
    {
        notifyAll(mesg);
    }

    public void attach(AbstractConsumer abstractConsumer)
    {
        list.add(abstractConsumer);
    }

    //通知订阅者
    private void notifyAll(String mesg)
    {
        for (AbstractConsumer ab:list
             )
        {
            ab.buyIphone(mesg);
        }
    }
}
