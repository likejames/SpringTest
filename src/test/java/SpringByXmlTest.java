import com.cn.test.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : lj
 * @since : 2021/1/21
 */
public class SpringByXmlTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person.toString());
    }
}
