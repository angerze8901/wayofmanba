package pattern.singleton;

/**
 * Created by wangze on 2018/3/21.
 */
public enum UserInfoEnum
{
    BLACKPEOPLE("kob",23,1.75),YELLOWPEOPLE("ya",33,1.65)

    ;
    private String name;

    private int age;

    private double height;


    UserInfoEnum(String name, int age, double height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }
}
