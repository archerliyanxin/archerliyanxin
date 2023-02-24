import org.junit.Test;
import org.junit.runner.RunWith;
import org.lyx.config.AuduenceConfig;
import org.lyx.service.Performance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AuduenceConfig.class)
/* ContextConfiguration

注释用于配置需要 Spring 依赖注入的单元测试。
* */
public class AudienceTest {
    @Autowired
    private Performance performance;

    @Test
    public void perTest(){
        performance.perform();
    }

    @Test
    public void perNTest(){performance.perform("lyx");}
}
