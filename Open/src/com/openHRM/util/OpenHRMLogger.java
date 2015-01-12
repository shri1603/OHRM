package com.openHRM.util;

import org.apache.log4j.Logger;

public class OpenHRMLogger
{

    private Logger logger;

    public OpenHRMLogger(Class<?> cls)
    {
        logger = null;
        logger = Logger.getLogger(cls.getName());
    }

    public void fatal(String error)
    {
        logger.fatal(error);
    }

    public void fatal(String error, Exception e)
    {
        logger.fatal(error, e);
    }

    public void debug(String error)
    {
        logger.debug(error);
    }

    public void info(String error)
    {
        logger.info(error);
    }

    public void warn(String error)
    {
        logger.warn(error);
    }

    public void error(String error)
    {
        logger.error(error);
    }
}
