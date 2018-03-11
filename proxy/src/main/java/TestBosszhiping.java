/**
 * Created by wangze on 2018/3/11.
 */
public class TestBosszhiping
{
    public static void main(String[] args)
    {
        //传入的找到的公司
        String company = "ali";
        Person obj = (Person) new Bosszhiping().getinstace(new Zeshao());
        obj.findJob();
    }
}
