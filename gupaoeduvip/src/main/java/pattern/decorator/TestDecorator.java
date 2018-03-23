package pattern.decorator;

import java.io.*;

/**
 * Created by wangze on 2018/3/23.
 */
public class TestDecorator
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Bread bread = new Bread(new ButterBread("flour"));

//        InputStream inputStream = new FileInputStream(new File(""));
//        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
    }
}
