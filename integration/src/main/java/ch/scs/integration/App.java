package ch.scs.integration;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {

    private static Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Hello World!");
    }

    public String basicOutput() {
        return "Basic output.";
    }
}
