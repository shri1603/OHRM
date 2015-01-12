package com.openHRM.util;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory
{

    private static String CONFIG_FILE_LOCATION;
    private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
    private static Configuration configuration;
    private static SessionFactory sessionFactory;
    private static String configFile;

    private HibernateSessionFactory()
    {
    }

    public static Session getSession() throws HibernateException
    {
        Session session = (Session)threadLocal.get();
        
        if(session == null || !session.isOpen())
        {
            if(sessionFactory == null)
            {
                rebuildSessionFactory();
            }
        
            session = sessionFactory == null ? null : ((Session) (sessionFactory.openSession()));
            threadLocal.set(session);
        }
        return session;
    }

    public static void rebuildSessionFactory()
    {
        try
        {
            configuration.configure(configFile);
            sessionFactory = configuration.buildSessionFactory();
        }
        catch(Exception e)
        {
            System.err.println("%%%% Error Creating SessionFactory %%%%");
            e.printStackTrace();
        }
    }

    public static void closeSession()
        throws HibernateException
    {
        Session session = (Session)threadLocal.get();
        threadLocal.set(null);
        if(session != null)
        {
            session.close();
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    public static void setConfigFile(String configFile)
    {
        HibernateSessionFactory.configFile = configFile;
        sessionFactory = null;
    }

    public static Configuration getConfiguration()
    {
        return configuration;
    }

    static
    {
        CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";
        configuration = new Configuration();
        configFile = CONFIG_FILE_LOCATION;
        try
        {
            configuration.configure(configFile);
            sessionFactory = configuration.buildSessionFactory();
        }
        catch(Exception e)
        {
            System.err.println("%%%% Error Creating SessionFactory %%%%");
            e.printStackTrace();
        }
    }
}
