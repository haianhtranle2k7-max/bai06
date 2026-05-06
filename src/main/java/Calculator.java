import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        int result = a + b;

        logger.info("Dang thuc hien cong: {} + {} = {}", a, b, result);
        return result;
    }
}