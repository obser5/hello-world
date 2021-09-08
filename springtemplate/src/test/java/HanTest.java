import han.dao.IUserMapper;
import han.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class HanTest {
    @Autowired
    private IUserMapper userMapper;

    @Test
    public void testFindAllUsers() {
        List<User> userList = userMapper.findAllUsers();
        System.out.println("userList = " + userList);
    }

    @Test
    public void Hello() {
        System.out.println("Hello World!");
    }
}
