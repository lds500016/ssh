import org.com.entitys.UserBank;
import org.com.service.UserBankService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserBankTest {

    @Resource
    private  UserBankService ubs;

    public void setUbs(UserBankService ubs) {
        this.ubs = ubs;
    }

    @Test
    public void UserBankQuery(){

        List<UserBank> list=ubs.QueryAll();
        for(UserBank u : list){
            System.out.println(u.getUserName());
        }
    }
}
