package ProjectCalc;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogServis {
    private static final Logger logger = Logger.getLogger(LogServis.class.getName());

    public static void logError(String message) {
        logger.log(Level.SEVERE, message);
    }

}
