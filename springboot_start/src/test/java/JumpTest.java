import org.junit.Test;
import org.junit.runner.RunWith;
import org.lyx.config.AuduenceConfig;
import org.lyx.config.JumpConfig;
import org.lyx.service.Jump;
import org.lyx.service.Performance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JumpConfig.class})
public class JumpTest {
    @Autowired
    private Performance performance;

    @Test
    public void perTest(){
        Jump jump = (Jump)performance;
        jump.jump();
        performance.perform("lyx");
    }
}
