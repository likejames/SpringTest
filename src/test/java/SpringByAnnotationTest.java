import com.cn.test.config.BeanConfig;
import com.cn.test.service.PersonImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : lj
 * @since : 2021/1/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfig.class)
public class SpringByAnnotationTest {
    @Autowired
    PersonImpl personService;
    @Test
    public void test() {
        personService.see();
    }
}
