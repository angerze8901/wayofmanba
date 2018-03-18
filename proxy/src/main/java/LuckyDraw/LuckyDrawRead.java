package LuckyDraw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by wangze on 2018/3/16.
 */
public class LuckyDrawRead
{
    public static List<String> readFile(String filename) throws IOException
    {
        List<String> list = new ArrayList<String>();
        BufferedReader reader = null;
        String line;
        try
        {
            reader = new BufferedReader(new FileReader(filename));
            while ((line = reader.readLine()) != null)
            {
                if (!line.isEmpty())
                {
                    list.add(line.trim());
                }

            }

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (reader != null)
            {
                reader.close();
            }
        }
        return list;
    }

    //返回list中随机选出的名字
    public String radam(List<String> list)
    {
        int nameNum = new Random().nextInt(list.size());
//        int nameNum = (int) (Math.random() * list.size());
        return list.get(nameNum);
    }

    //运行测试的方法
    public static void main(String[] args)
    {
        List<String> result = new ArrayList<String>();
        //读取文件路径
        String filename = "D:/抽奖人员名单.txt";
        LuckyDrawRead readList = new LuckyDrawRead();
        try
        {
            List<String> listName = readList.readFile(filename);
            //此处修改返回的名字个数,默认是3个
            for (int i = 0; i < 3; i++)
            {
                String name = readList.radam(listName);
                result.add(name);
                listName.remove(name);
            }
            System.out.println(result);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
