
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testLogger {

    private Logger logger = LoggerFactory.getLogger(testLogger.class);
    @Test
    public void testUserObject(){
        logger.info("开始记录日志");
    }
}
