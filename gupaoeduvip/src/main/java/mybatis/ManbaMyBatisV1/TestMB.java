package mybatis.ManbaMyBatisV1;

import lombok.Data;

/**
 * Created by wangze on 2018/4/2.
 */
@Data
public class TestMB
{
    //暂时使用cacheAnalysis的sys_user表
    private String userid;

    private String loginname;

    private String pwd;

    private String salt;

    private String phone;

    private String email;

    private String status;

    private String menu;

    private String menuother;

}
