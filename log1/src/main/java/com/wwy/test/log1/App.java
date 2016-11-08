package com.wwy.test.log1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
    	logger.info("who am i {} , {}", "wuwen1ya", "222");
    }
}
