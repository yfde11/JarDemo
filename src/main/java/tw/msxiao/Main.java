package tw.msxiao;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class);
        BasicConfigurator.configure();
        logger.info("hello world");
    }
}
