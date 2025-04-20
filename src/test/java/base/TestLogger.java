package base;

package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogger {
    private static final Logger logger = LogManager.getLogger(TestLogger.class);

    public static Logger getLogger() {
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        return LogManager.getLogger(className);
    }
}