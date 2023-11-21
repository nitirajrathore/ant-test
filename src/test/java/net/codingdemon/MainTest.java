package net.codingdemon;

import junit.framework.TestCase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class MainTest extends TestCase {

    Logger logger = LogManager.getLogger(MainTest.class);
    public void testMain() {
        logger.info("Running testMain()");
        Assert.assertTrue(true);
        new Main().main(null);
    }

}