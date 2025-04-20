package base;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestNGListener;

public class TestLogger implements ITestNGListener {
    private static final Logger logger = LogManager.getLogger(TestLogger.class);

    public static Logger getLogger() {
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        return LogManager.getLogger(className);
    }
}