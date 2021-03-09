package com.z.kmodule.logger.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {

    private static final Logger logger = LoggerFactory.getLogger(TestLogger.class);

    public static void main(String[] args) {
        logger.info("info logger");
        logger.warn("warn logger");
        logger.error("error logger");
    }
}
