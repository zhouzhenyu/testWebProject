package com.zzy;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

/**
 * This is Description
 *
 * @author
 * @date 2020/04/20
 */
public class Main {

    static Logger logger  = Logger.getLogger(Main.class);

    public static void main(String[] args) {
//        logger.info("info--------");
//        logger.debug("debug-----------");
//        logger.warn("warn----------");
//        logger.error("error------------");

        String a = null;
        try {
            System.out.printf(a);
        }catch (Exception e){
//            e.printStackTrace();
            logger.error(e);
        }

    }
}
