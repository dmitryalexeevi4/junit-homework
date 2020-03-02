package com.github.dmitryalexeevi4;

import org.junit.jupiter.api.Test;
import org.slf4j.*;

public class SimpleTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

    @Test
    public void simpleTest() {
        LOG.info("Simple test complete!");
    }
}

