
import com.xiaola.api.IUserService;
import com.xiaola.dao.UserInfoMapper;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by xiaola on 16/9/19.
 */
public class DubboTest extends BaseTest {
    @Resource
    private IUserService userService;

    @Test
    public void testDemo(){
        Integer result = userService.addUser();
        System.out.println("demo=====" + result);
    }
}
